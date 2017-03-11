package com.dev.web.mobile.dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;

import com.dev.web.mobile.model.City;

public class Executor {
	
	private static final CityDAO cityDAO = CityDAO.getInstance();

	public static void main(String[] args) {
		/*
		City city = new City();
		
		city.setNome("ItajubÃ¡");
		city.setGeocodigo(0.0);
		city.setLatitude(0.0);
		city.setLongitude(0.0);
				
		try {
			cityDAO.insert(city);
		} catch(ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e.toString());
			
		}
		*/
		/*
		try {			
			City city = cityDAO.getCityByGeocodigo(0);
			System.out.println(city.toString());
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e.toString());			
		}
		*/
		/*
		City city = new City();
		
		try {			
			city.setId(new Long("1"));
			cityDAO.delete(city);					
			System.out.println(city.toString());
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e.toString());			
		}
		*/
		
		City city = new City();
				
		try {
			city.setId(new Long("2"));
			city.setNome("Cruzeiro"); // caso queria mudar o nome da cidade tambÃ©m
			city.setGeocodigo(12722000);
			city.setLatitude(-25.20654843);
			city.setLongitude(-45.35484616);
		
			cityDAO.update(city);
			
		} catch(ClassNotFoundException | SQLException | IOException | URISyntaxException e) {
			System.out.println(e.toString());
			
		}
		
		

	}

}
