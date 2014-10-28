package br.com.rm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			String connection = "jdbc:mysql://localhost/GerenciadorRPG";
			String login = "root";
			String password = "root";
			return DriverManager.getConnection(connection, login, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
