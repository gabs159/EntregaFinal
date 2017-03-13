package com.dev.web.mobile.impl;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.dao.CityDAO;
import com.dev.web.mobile.util.ActExec;
import com.dev.web.mobile.util.Constantes;
import com.dev.web.mobile.util.Utilities;

public class ChamaCalculoFrete implements ActExec{	
	
	private static final CityDAO DAO = CityDAO.getInstance();

	@Override
	public String exc(HttpServletRequest request, HttpServletResponse response) {
		 
		 try {
			request.setAttribute("citiesA", DAO.getCities());
			request.setAttribute("citiesB", DAO.getCities());
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
		 
		return Utilities.buildJSPPagesPath(Constantes.CALCULA_FRETE_JSP);
		
	}

}