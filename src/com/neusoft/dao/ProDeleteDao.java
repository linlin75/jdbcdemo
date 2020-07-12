package com.neusoft.dao;

import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProDeleteDao {
    //删除商品信息
    public abstract List<Product>  deleteProduct() throws SQLException;

}
