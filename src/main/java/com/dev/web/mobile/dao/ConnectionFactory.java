package com.dev.web.mobile.dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;

/**
 * 
 * @author JETHER ROIS
 *
 */
public class ConnectionFactory {

	private static ConnectionFactory INSTANCE = null;

	private ConnectionFactory() {
	}

	public static final synchronized ConnectionFactory getInstance() throws IOException {
		if (INSTANCE == null)	
			INSTANCE = new ConnectionFactory();
		
		return INSTANCE;
	}

	public ConnectionManager getConnectionManager() throws SQLException, IOException, ClassNotFoundException {

		ConnectionManager connectionManager = null;

		try {
			connectionManager = HerokuConnectionManager.getInstance();
			//connectionManager = LocalConnectionManager.getInstance();
		} //
		catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		//connectionManager = LocalConnectionManager.getInstance();

		return connectionManager;

	}

}
