package com.shop.service;

import java.util.List;

import com.shop.entity.Product;

public interface ProductService {
	// 查找最热的商品10条
    public List<Product> findHot();

    // 查找最新的商品10条
    public List<Product> findNew();
    
    // 根据商品的pid的值查询商品
    public Product findByPid(Integer pid);
}
