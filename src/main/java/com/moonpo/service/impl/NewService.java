package com.moonpo.service.impl;

import java.util.List;

import com.moonpo.dao.INewDAO;
import com.moonpo.model.NewsModel;
import com.moonpo.service.INewService;

import jakarta.inject.Inject;

public class NewService implements INewService {
	
	@Inject
	private INewDAO newDAO;

	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		return newDAO.findByCategoryId(categoryId);
	}

}
