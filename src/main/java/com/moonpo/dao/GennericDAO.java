package com.moonpo.dao;

import java.util.List;

import com.moonpo.mapper.RowMapper;


public interface GennericDAO<T> {
	@SuppressWarnings("hiding")
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	
}
