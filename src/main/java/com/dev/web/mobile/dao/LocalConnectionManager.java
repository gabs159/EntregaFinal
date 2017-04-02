package com.dev.web.mobile.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.dev.web.mobile.util.FretaoConstantes;
import com.dev.web.mobile.util.PropertyUtil;

public class LocalConnectionManager implements ConnectionManager {

	private static ConnectionManager connectionManager = null;	
	//private Properties props = null;
	private static String connectionString = null;

	@Override
	public Connection getConnection() throws SQLException {		
		Connection connection = DriverManager.getConnection(connectionString, "postgres",
				"1234");
		return connection;
	}

	//LocalConnectionManager(Properties props) throws ClassNotFoundException {
	LocalConnectionManager() throws ClassNotFoundException {
		
		//this.props = props;
		
		/*
		StringBuilder builder = new StringBuilder();
		builder.append(props.getProperty("jdbc.protocolo"));
		builder.append(props.getProperty("jdbc.host"));
		builder.append(":");
		builder.append(props.getProperty("jdbc.port"));
		builder.append("/");
		builder.append(props.getProperty("jdbc.database"));
		
		connectionString = builder.toString();
		
		Class.forName(props.getProperty("jdbc.driver"));	
		
		*/

		StringBuilder builder = new StringBuilder();
		builder.append("jdbc:postgresql://");
		builder.append("localhost");
		builder.append(":");
		builder.append("5432");
		builder.append("/");
		builder.append("fretao");
		
		connectionString = builder.toString();
		
		Class.forName("org.postgresql.Driver");	
		
		
		
	}

	public static synchronized ConnectionManager getInstance() throws FileNotFoundException, IOException, ClassNotFoundException {		
	
		if (connectionManager == null){
			/*final Properties props = PropertyUtil.getInstance()
					.loadPropertieFile(FretaoConstantes.FRETAO_DB_PROPERTIES_FILE_NAME);*/			
			//connectionManager = new LocalConnectionManager(props);
			connectionManager = new LocalConnectionManager();
		}

		return connectionManager;
	}

}
