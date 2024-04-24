package com.moonpo.dao.impl;

import java.util.List;

import com.moonpo.dao.INewDAO;
import com.moonpo.mapper.NewMapper;
import com.moonpo.model.NewsModel;

public class NewDAO extends AbstractDAO<NewsModel> implements INewDAO {

	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public Long save(NewsModel newsModel) {
		String sql = "INSERT INTO news(title, content, categoryid) VALUES(?, ?, ?)";
		Long id = insert(sql, newsModel.getTitle(), newsModel.getContent(), newsModel.getCategoryId());
		return id;
	}

	@Override
	public NewsModel findOneById(Long id) {
		String sql = "SELECT * FROM news WHERE id = ?";
		List<NewsModel> news = query(sql, new NewMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}
}
