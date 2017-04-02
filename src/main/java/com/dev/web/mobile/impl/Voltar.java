package com.dev.web.mobile.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.interfaces.ActionExecuter;
import com.dev.web.mobile.util.FretaoConstantes;

public class Voltar implements ActionExecuter{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return FretaoConstantes.RAIZ_PAGES + "inicio.jsp";
	}

}