package com.dev.web.mobile.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "/*")
public class AuditoriaFiltro implements Filter{

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		logRequestedURLInfo(req);
		filter.doFilter(request, response);
	}

	private void logRequestedURLInfo(HttpServletRequest req) {
		System.out.println("Valor da URI: " + req.getRequestURI());
		System.out.println("Valor da URL: " + req.getRequestURL() + "/" + req.getQueryString());
	}

	public void init(FilterConfig config) throws ServletException {

	}

	public void destroy() {

	}

}
