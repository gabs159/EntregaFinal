package com.dev.web.mobile.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.util.ActExec;
import com.dev.web.mobile.util.Constantes;
import com.dev.web.mobile.util.Utilities;

public class CallCadCity implements ActExec{
	
	@Override
	public String exc(HttpServletRequest request, HttpServletResponse response) {	
		
		return Utilities.buildJSPPagesPath(Constantes.CADASTRA_CIDADE_JSP);
	}
}
