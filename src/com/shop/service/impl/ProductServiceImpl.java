package com.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.dao.ProductDao;
import com.shop.entity.Product;
import com.shop.service.ProductService;

@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService{
	@Resource
	private ProductDao productDao;

    public List<Product> findHot() {
        return productDao.findHot();
    }

    public List<Product> findNew() {
        return productDao.findNew();
    }
    public Product findByPid(Integer pid) {
        return productDao.findOne(pid);
    }
}
