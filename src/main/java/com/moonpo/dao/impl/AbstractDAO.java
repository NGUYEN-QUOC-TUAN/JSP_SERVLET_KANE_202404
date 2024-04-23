package com.moonpo.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.moonpo.dao.GennericDAO;
import com.moonpo.mapper.RowMapper;

public class AbstractDAO<T> implements GennericDAO<T> {

	private static String DB_URL = "jdbc:mysql://localhost:3306/jsp_servlet";
	private static String USER_NAME = "root";
	private static String PASSWORD = "0945525830";

	public static Connection getConnection() {
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

	@Override
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		List<T> results = new ArrayList<>();
		try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql);) {

			try (ResultSet resultSet = statement.executeQuery()) {
				setParameter(statement, parameters);
				while (resultSet.next()) {
					results.add(rowMapper.mapRow(resultSet));
				}
			}
			return results;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	private void setParameter(PreparedStatement statement, Object... parameters) {

		try {
			for (int i = 0; i < parameters.length; i++) {
				Object parameter = parameters[i];
				int index = i + 1;
				if (parameter instanceof Long) {
					statement.setLong(index, (Long) parameter);
				}else if(parameter instanceof String){
					statement.setString(index, (String) parameter);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
