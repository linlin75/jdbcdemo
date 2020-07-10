package com.neusoft.dao;

import com.neusoft.entity.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> selectProByName(String title);
}
