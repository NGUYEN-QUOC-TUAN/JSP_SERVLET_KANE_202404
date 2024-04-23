package com.moonpo.dao;

import java.util.List;

import com.moonpo.model.NewsModel;

public interface INewDAO extends GennericDAO<NewsModel>{
	List<NewsModel> findByCategoryId(Long categoryId);
}
