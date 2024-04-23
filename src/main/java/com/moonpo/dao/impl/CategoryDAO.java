package com.moonpo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.moonpo.dao.ICategoryDAO;
import com.moonpo.mapper.CategoryMapper;
import com.moonpo.model.CategoryModel;
import com.moonpo.util.ConnectDB;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	private ConnectDB connect = new ConnectDB();

	@Override
	public List<CategoryModel> findAllCategory() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());

	}

	@Override
	public CategoryModel findOneCategoryById(Long id) {
		String sql = "SELECT * FROM category WHERE id = ?";
		CategoryModel categoryModel = null;
		try (Connection connection = connect.getConnection();
				PreparedStatement statement = connection.prepareStatement(sql)) {

			statement.setLong(1, id);
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					categoryModel = new CategoryModel();
					categoryModel.setId(resultSet.getLong("id"));
					categoryModel.setName(resultSet.getString("name"));
					categoryModel.setCode(resultSet.getString("code"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return categoryModel;
	}

}
