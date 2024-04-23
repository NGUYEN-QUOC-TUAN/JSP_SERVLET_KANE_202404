package com.moonpo.dao;

import java.util.List;

import com.moonpo.model.CategoryModel;

public interface ICategoryDAO extends GennericDAO<CategoryModel>{

	List<CategoryModel> findAllCategory();

	CategoryModel findOneCategoryById(Long id);
}
