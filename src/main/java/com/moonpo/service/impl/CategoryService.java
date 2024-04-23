package com.moonpo.service.impl;

import java.util.List;


import com.moonpo.dao.ICategoryDAO;
import com.moonpo.model.CategoryModel;
import com.moonpo.service.ICategoryService;

import jakarta.inject.Inject;

public class CategoryService implements ICategoryService {
	
	@Inject
	private ICategoryDAO iCategoryDAO;

	@Override
	public List<CategoryModel> findAllCategory() {
		List<CategoryModel> listCategorys = iCategoryDAO.findAllCategory();
		return listCategorys;
	}

}
