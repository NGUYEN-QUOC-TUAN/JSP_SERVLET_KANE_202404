package com.moonpo.dao;

import java.util.List;

import com.moonpo.model.NewsModel;

public interface INewDAO extends GennericDAO<NewsModel> {

	NewsModel findOneById(Long id);

	List<NewsModel> findByCategoryId(Long categoryId);

	Long save(NewsModel newsModel);
}
