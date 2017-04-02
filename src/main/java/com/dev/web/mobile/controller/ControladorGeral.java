package com.dev.web.mobile.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.util.ActExec;
import com.dev.web.mobile.util.Constantes;

@WebServlet(urlPatterns = "/controlador-geral")
public class ControladorGeral extends HttpServlet{
	
	private static final long serialVersionUID = -3214432047220516430L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String instance = req.getParameter("execute");
		if (instance == null) 
			throw new IllegalArgumentException("The [execute] parameter cannot be null.");
		
		StringBuilder classe = new StringBuilder();
		classe.append(Constantes.PROJECT_BASE_PACKAGE_PATH);
		classe.append(instance);
		
		try {
			Class<?> type = Class.forName(classe.toString().trim());
			ActExec criarInstancia = (ActExec) type.newInstance();
			String pagina = criarInstancia.exc(req, resp);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(pagina);
			dispatcher.forward(req, resp);
			
		} catch (Exception e) {
			throw new ServletException(e);
		} 
	}
	

	// Método criado para que possam atender requisições do tipo GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String instance = req.getParameter("execute");
		if (instance == null) 
			throw new IllegalArgumentException("The [execute] parameter cannot be null.");
		
		StringBuilder classe = new StringBuilder();
		classe.append(Constantes.PROJECT_BASE_PACKAGE_PATH);
		classe.append(instance);
		
		try {
			Class<?> type = Class.forName(classe.toString().trim());
			ActExec criarInstancia = (ActExec) type.newInstance();
			String pagina = criarInstancia.exc(req, resp);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(pagina);
			dispatcher.forward(req, resp);
			
		} catch (Exception e) {
			throw new ServletException(e);
		} 
	}


}
