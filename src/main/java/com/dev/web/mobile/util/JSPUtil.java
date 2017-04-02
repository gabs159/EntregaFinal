package com.dev.web.mobile.util;

public final class JSPUtil {
	
	public static String buildJSPPagesPath(String jspPage) {
		return FretaoConstantes.RAIZ_PAGES + jspPage;
	}
	
	public static String buildJSPRootPath(String jspPage) {
		return FretaoConstantes.RAIZ + jspPage;
	}

}
