package com.dev.web.mobile.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dev.web.mobile.interfaces.ActionExecuter;
import com.dev.web.mobile.util.FretaoConstantes;
import com.dev.web.mobile.util.JSPUtil;

public class Logout implements ActionExecuter {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.removeAttribute("usuario.hashcode");
		session.invalidate();
		
		return JSPUtil.buildJSPRootPath(FretaoConstantes.INDEX_JSP);
	}

}
