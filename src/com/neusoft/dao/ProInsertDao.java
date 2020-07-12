package com.neusoft.dao;

import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProInsertDao {
    //添加商品信息
    public abstract List<Product> insertProduct() throws SQLException;
}
