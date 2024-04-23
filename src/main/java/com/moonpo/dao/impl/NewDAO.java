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

}
