package com.dev.web.mobile.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.dao.CityDAO;
import com.dev.web.mobile.interfaces.ActionExecuter;
import com.dev.web.mobile.model.City;
import com.dev.web.mobile.util.FretaoConstantes;
import com.dev.web.mobile.util.JSPUtil;

public class CarregaTabelaCidades implements ActionExecuter{
	
	private static final String CITIES_REQUEST_ATTRIBUTE = "cities";	
	private static final CityDAO DAO = CityDAO.getInstance();
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {	
		
		try {
			updatRequesteCityList(request);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}		
		
		return JSPUtil.buildJSPPagesPath(FretaoConstantes.CADASTRA_CIDADE_JSP);
	}
	
	private void updatRequesteCityList(HttpServletRequest request) throws ClassNotFoundException, SQLException, IOException {
		List<City> cities = DAO.getCities();
		request.setAttribute(CITIES_REQUEST_ATTRIBUTE, cities);
	}

}
