package com.dev.web.mobile.impl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.dao.CityDAO;
import com.dev.web.mobile.model.City;
import com.dev.web.mobile.util.ActExec;
import com.dev.web.mobile.util.Constantes;
import com.dev.web.mobile.util.Utilities;

public class CadastroCidade implements ActExec {
	
	private static final CityDAO DAO = CityDAO.getInstance();

	@Override
	public String exc(HttpServletRequest request, HttpServletResponse response) {

		City city = mapRequestToCityEntity(request);

		try {
			if (city.isCityValid())
				DAO.insert(city);
			
			updateRequestCityList(request);

		} catch (ClassNotFoundException | SQLException | IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		
		return Utilities.buildJSPPagesPath(Constantes.CADASTRA_CIDADE_JSP);
	}

	private void updateRequestCityList(HttpServletRequest request) throws ClassNotFoundException, SQLException, IOException {
		List<City> cities = DAO.getCities();
		request.setAttribute("cities", cities);
	}

	private City mapRequestToCityEntity(HttpServletRequest request) {
		String nome = request.getParameter("nome");
		String geocodigo = request.getParameter("geocodigo");
		String latitude = request.getParameter("latitude");
		String longitude = request.getParameter("longitude");

		City city = new City();
		city.setNome(nome.toUpperCase());
		city.setGeocodigo(geocodigo != null ? new Double(geocodigo) : 0);
		city.setLatitude(latitude != null ? new Double(latitude) : 0);
		city.setLongitude(longitude != null ? new Double(longitude) : 0);
		return city;
	}

}