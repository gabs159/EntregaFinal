package com.dev.web.mobile.impl;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.dao.CityDAO;
import com.dev.web.mobile.interfaces.ActionExecuter;
import com.dev.web.mobile.util.FretaoConstantes;
import com.dev.web.mobile.util.JSPUtil;

public class ChamaCalculaFrete implements ActionExecuter{	
	
	private static final CityDAO DAO = CityDAO.getInstance();

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		 
		 try {
			request.setAttribute("citiesA", DAO.getCities());
			request.setAttribute("citiesB", DAO.getCities());
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
		 
		return JSPUtil.buildJSPPagesPath(FretaoConstantes.CALCULA_FRETE_JSP);
		
	}

}