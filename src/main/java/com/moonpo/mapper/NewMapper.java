package com.moonpo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.moonpo.model.NewsModel;

public class NewMapper implements RowMapper<NewsModel> {

	@Override
	public NewsModel mapRow(ResultSet rs) {
		NewsModel newsModel = new NewsModel();
		try {
			newsModel.setId(rs.getLong("id"));
			newsModel.setTitle(rs.getString("title"));
			newsModel.setCategoryId(rs.getLong("categoryid"));
			return newsModel;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
