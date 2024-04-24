package com.moonpo.service;

import java.util.List;

import com.moonpo.model.NewsModel;

public interface INewService {
	List<NewsModel> findByCategoryId(Long categoryId);
	NewsModel save(NewsModel newsModel);
}
