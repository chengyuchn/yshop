package com.shop.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	public List<T> find(String hql);
	public List<T> find(String hql, int page, int rows);
	public void update(T o);
	public Serializable save(T o);
	public Integer count(String hql);

}
