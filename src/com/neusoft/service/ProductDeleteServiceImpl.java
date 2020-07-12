package com.neusoft.service;

import com.neusoft.dao.ProDeleteDao;
import com.neusoft.dao.impl.ProDelectDaoImpl;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductDeleteServiceImpl implements ProductDeleteService{

    @Override
    public List<Product> deleteProduct() throws SQLException {
        ProDeleteDao dao = new ProDelectDaoImpl();
        return dao.deleteProduct();
    }
}
