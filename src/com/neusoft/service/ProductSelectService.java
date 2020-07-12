package com.neusoft.service;

import com.neusoft.entity.PS;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductSelectService {
    //查询商品信息
    public List<PS> selectProduct() throws SQLException;
}
