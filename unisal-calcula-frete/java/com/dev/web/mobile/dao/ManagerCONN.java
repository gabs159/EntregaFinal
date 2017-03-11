package com.dev.web.mobile.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ManagerCONN {
	
	Connection getConnection() throws SQLException;

}
