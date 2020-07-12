package com.neusoft.service;

import com.neusoft.entity.OfferPrice;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductInsertService {
    //添加商品信息
    public List<Product> insertProduct() throws SQLException;
}
