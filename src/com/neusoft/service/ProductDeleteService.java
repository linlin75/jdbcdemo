package com.neusoft.service;

import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDeleteService {
    //删除商品信息
    public List<Product> deleteProduct() throws SQLException;
}
