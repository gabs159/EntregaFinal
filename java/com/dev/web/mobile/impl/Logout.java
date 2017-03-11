package com.dev.web.mobile.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.web.mobile.interfaces.Instancia;
import com.dev.web.mobile.util.Constantes;

public class Logout implements Instancia {

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.removeAttribute("usuario.hashcode");
		session.invalidate();
		
		return Constantes.ROOT + "index.jsp";
	}

}
