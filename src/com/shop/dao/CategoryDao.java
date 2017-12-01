package com.shop.dao;

import java.util.List;

import com.shop.entity.Category;

public interface CategoryDao extends BaseDao<Category>{
	public List<Category> findAll();
}
