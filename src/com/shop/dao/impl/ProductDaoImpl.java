package com.shop.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.shop.dao.ProductDao;
import com.shop.entity.Product;

@Repository("productDao")
@SuppressWarnings("all")
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao{
	public List<Product> findHot() {
        String hql = "from Product p where p.is_hot = 1 ";
        hql += "order by p.pdate desc";
        int rows = 10;
        return find(hql, 1, rows);
    }
	public List<Product> findNew() {
        String hql = "from Product p ";
        hql += "order by p.pdate desc";
        int rows = 10;
        return find(hql, 1, rows);
    }
	public Product findOne(Integer pid) {
        String hql = "from Product p where p.pid = ?";
        Query query = this.getCurrentSession().createQuery(hql);
        query.setParameter(0, pid);
        return (Product) query.uniqueResult();
    }
}
