package com.shop.dao;

import java.util.List;

import com.shop.dao.BaseDao;
import com.shop.entity.Product;

public interface ProductDao extends BaseDao<Product>{
	/**
     * �������ȵ�ʮ����Ʒ
     *
     * @return
     */
    public List<Product> findHot();

    /**
     * �������µ�ʮ����Ʒ
     *
     * @return
     */
    public List<Product> findNew();
    public Product findOne(Integer pid);
}
