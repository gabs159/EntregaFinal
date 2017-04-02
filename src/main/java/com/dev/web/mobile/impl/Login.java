package com.dev.web.mobile.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.interfaces.ActionExecuter;
import com.dev.web.mobile.util.FretaoConstantes;
import com.dev.web.mobile.util.JSPUtil;

public class Login implements ActionExecuter {	

	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return JSPUtil.buildJSPPagesPath(FretaoConstantes.INICIO_JSP);
	}	

}
