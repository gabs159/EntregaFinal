package com.dev.web.mobile.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

import com.dev.web.mobile.util.PropertyUtil;

public class ConnectionPool {
	private static ConnectionPool INSTANCE = null;
	private final Properties props;
	private static BasicDataSource dataSource;

	private ConnectionPool(Properties props) {
		this.props = props;
	}

	public static final synchronized ConnectionPool getInstance() throws IOException {
		if (INSTANCE == null) {
			final Properties props = PropertyUtil.getInstance().readFromClasspath("fretao.properties");
			if (props == null) {
				throw new FileNotFoundException(
						String.format("Dont possible find the db-config file: '%s'.", "fretao.properties"));
			}
			INSTANCE = new ConnectionPool(props);
		}
		return INSTANCE;
	}
	
	public Connection createConnectionComPool() throws SQLException, IOException, ClassNotFoundException {
		StringBuilder builder = new StringBuilder();
		builder.append(props.getProperty("jdbc.protocolo"));
		builder.append(props.getProperty("jdbc.host"));
		builder.append(":");
		builder.append(props.getProperty("jdbc.port"));
		builder.append("/");
		builder.append(props.getProperty("jdbc.database"));
		
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName((props.getProperty("jdbc.driver")));
		dataSource.setUrl(builder.toString());
		dataSource.setUsername(props.getProperty("jdbc.username"));
		dataSource.setPassword(props.getProperty("jdbc.password"));
		dataSource.setInitialSize(10);
		
		Connection connection = dataSource.getConnection();
		return connection;
	}
	public Connection getConnectionHeroku() throws SQLException, URISyntaxException{
		URI uri = new URI(System.getenv("DATABASE_URL"));
		String username = uri.getUserInfo().trim().split(":")[0];
		String password = uri.getUserInfo().trim().split(":")[1];;
		String host = "jdbc:postgresql://" + uri.getHost().trim() + uri.getPath().trim();
		
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl(host);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setInitialSize(10);
		
		return dataSource.getConnection();
	}

}
