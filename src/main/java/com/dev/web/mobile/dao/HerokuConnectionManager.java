package com.dev.web.mobile.dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class HerokuConnectionManager implements ConnectionManager {

	private static ConnectionManager connectionManager = null;
	private static BasicDataSource dataSource = null;
	private String dbUrl;

	@Override
	public Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(this.dbUrl);
		return connection;
	}

	HerokuConnectionManager() throws URISyntaxException {
		URI uri = new URI(System.getenv("DATABASE_URL"));		
		String dbUrl = System.getenv("JDBC_DATABASE_URL");
	    String username = System.getenv("JDBC_DATABASE_USERNAME");
	    String password = System.getenv("JDBC_DATABASE_PASSWORD");	    
	    this.dbUrl = dbUrl;
	}

	public static synchronized ConnectionManager getInstance() throws URISyntaxException {
		
		if(connectionManager == null)
			connectionManager = new HerokuConnectionManager();
		
		return connectionManager;
	}

}
