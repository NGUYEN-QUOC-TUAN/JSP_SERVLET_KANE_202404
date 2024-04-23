package com.moonpo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	private static String DB_URL = "jdbc:mysql://localhost:3306/jsp_servlet";
	private static String USER_NAME = "root";
	private static String PASSWORD = "0945525830";

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connect successfully!");
			return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
		return conn;
	}
}
