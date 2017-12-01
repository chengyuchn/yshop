package com.shop.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shop.dao.CategoryDao;
import com.shop.entity.Category;

@Repository("categoryDao")
@SuppressWarnings("all")
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao{
	public List<Category> findAll() {
        String hql = "from Category";
        return find(hql);
    }

}
