package com.dev.web.mobile.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.util.ActExec;
import com.dev.web.mobile.util.Constantes;

public class Voltar implements ActExec{

	@Override
	public String exc(HttpServletRequest request, HttpServletResponse response) {
		return Constantes.ROOT_PAGES + "inicio.jsp";
	}

}
