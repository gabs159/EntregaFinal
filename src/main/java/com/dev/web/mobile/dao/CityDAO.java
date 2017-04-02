package com.dev.web.mobile.dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dev.web.mobile.model.City;
import com.dev.web.mobile.util.DbUtil;

/**
 * 
 * @author JETHER ROIS
 *
 */
public class CityDAO extends GenericDAO{
	private static final CityDAO INSTANCE = new CityDAO();
	
	private CityDAO(){
	}
	
	public static final CityDAO getInstance(){
		return INSTANCE;
	}
	
	public List<City> getCities() throws ClassNotFoundException, SQLException, IOException{
		String sql = "SELECT id, nome, geocodigo, latitude, longitude FROM city";
		List<City> cities = new ArrayList<>();
		
		List<Object[]> objects = executeSqlWithoutParameter(getConnection(), sql);
		if (objects != null) {
			for (Object[] os : objects) {
				cities.add(castObjectToCity(os));
			}
		}
		return cities;
	}
	
	public City getCityByGeocodigo(double geocodigo) throws ClassNotFoundException, SQLException, IOException, URISyntaxException{
		String sql = "SELECT id, nome, geocodigo, latitude, longitude " +
						"FROM city WHERE geocodigo = ?";
		
		City city = null;		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = getConnection().prepareStatement(sql);
			ps.setDouble(1, geocodigo);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				city = new City();
				city.setId(rs.getLong(1));
				city.setNome(rs.getString(2));
				city.setGeocodigo(rs.getDouble(3));
				city.setLatitude(rs.getDouble(4));
				city.setLongitude(rs.getDouble(5));
			}
			
		} finally {
			DbUtil.getInstance().closeQuietly(ps);
		}
		return city;
		
	}
	
	public void insert(City city) throws ClassNotFoundException, SQLException, IOException, URISyntaxException{
		String sql = "insert into city (nome, geocodigo, latitude, longitude)" +
				"values (?, ?, ?, ?)";
		
		PreparedStatement ps = null;
		
		try {
			ps = getConnection().prepareStatement(sql);
			
			ps.setString(1, city.getNome());
			ps.setDouble(2, city.getGeocodigo());
			ps.setDouble(3, city.getLatitude());
			ps.setDouble(4, city.getLongitude());
			
			ps.execute();
			
		} finally {
			DbUtil.getInstance().closeQuietly(ps);
		}
		
	}
	
	public void update(City city) throws ClassNotFoundException, SQLException, IOException, URISyntaxException {
		
		String sql = "update city set nome=?, geocodigo=?, latitude=?, longitude=? " +
					"where id = ?";
		
		PreparedStatement ps = null;
		
		try {
			ps = getConnection().prepareStatement(sql);			
			ps.setLong(5, city.getId());			
			
			ps.setString(1, city.getNome());
			ps.setDouble(2, city.getGeocodigo());
			ps.setDouble(3, city.getLatitude());
			ps.setDouble(4, city.getLongitude());
			
			ps.execute();
			
		} finally {
			DbUtil.getInstance().closeQuietly(ps);
		}
		
	}
	
	public void delete(City city) throws ClassNotFoundException, SQLException, IOException, URISyntaxException {
		String sql = "delete from city where id = ?";
		
		PreparedStatement ps = null;
		
		try {
			ps = getConnection().prepareStatement(sql);
			
			ps.setLong(1, city.getId());			
			ps.execute();
			
		} finally {
			DbUtil.getInstance().closeQuietly(ps);
		}
		
	}
	
	private City castObjectToCity(Object[] os){
		City city = new City();
		city.setId((Long)os[0]);
		city.setNome((String)os[1]);
		city.setGeocodigo((Double)os[2]);
		city.setLatitude((Double)os[3]);
		city.setLongitude((Double)os[4]);
		
		return city;
	}
}
