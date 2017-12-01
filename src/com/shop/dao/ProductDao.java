package com.shop.dao;

import java.util.List;

import com.shop.dao.BaseDao;
import com.shop.entity.Product;

public interface ProductDao extends BaseDao<Product>{
	/**
     * 查找最热的十个商品
     *
     * @return
     */
    public List<Product> findHot();

    /**
     * 查找最新的十个商品
     *
     * @return
     */
    public List<Product> findNew();
    public Product findOne(Integer pid);
}
