package com.dev.web.mobile.impl;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.dao.CityDAO;
import com.dev.web.mobile.util.ActExec;
import com.dev.web.mobile.model.City;
import com.dev.web.mobile.util.Constantes;
import com.dev.web.mobile.util.Utilities;

public class CityTableLoad implements ActExec{
	
	private static final String CITIES_REQUEST_ATTRIBUTE = "cities";	
	private static final CityDAO DAO = CityDAO.getInstance();
	
	@Override
	public String exc(HttpServletRequest request, HttpServletResponse response) {	
		
		try {
			updatRequesteCityList(request);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}		
		
		return Utilities.buildJSPPagesPath(Constantes.CADASTRA_CIDADE_JSP);
	}
	
	private void updatRequesteCityList(HttpServletRequest request) throws ClassNotFoundException, SQLException, IOException {
		List<City> cities = DAO.getCities();
		request.setAttribute(CITIES_REQUEST_ATTRIBUTE, cities);
	}

}