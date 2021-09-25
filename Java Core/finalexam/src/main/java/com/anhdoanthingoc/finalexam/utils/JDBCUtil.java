package com.anhdoanthingoc.finalexam.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	public static final String URL_DB = "jdbc:mysql://localhost:3306/testingsystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
	public static final String USER_DB = "root";
	public static final String PASSWORD = "1111";
	private static JDBCUtil intance;
	private Connection connection;

	public static JDBCUtil getIntance() {
		if (intance == null) {
			intance = new JDBCUtil();
			
		}
		return intance;
	}

	public void removeIntance() throws SQLException {
		closeConnection();
		intance = null;
	}

	private JDBCUtil() {

	}

	public Connection getConnection() throws SQLException {
		if (connection == null) {

			connection = DriverManager.getConnection(URL_DB, USER_DB, PASSWORD);

		}
		return connection;
	}

	public Statement getStatement() throws SQLException {
		return getConnection().createStatement();
	}
	
	public ResultSet stExeQuery(String query)throws SQLException {
		return getStatement().executeQuery(query);
	}

	public PreparedStatement getPreparedStatement(String sqlQuery) throws SQLException {
		PreparedStatement preparedStatement = getConnection().prepareStatement(sqlQuery);
		return preparedStatement;
	}

	public void closeConnection() throws SQLException {
		if (connection != null) {
			connection.close();
		}
		connection = null;
	}

}