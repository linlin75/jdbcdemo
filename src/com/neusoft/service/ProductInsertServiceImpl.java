package com.neusoft.service;

import com.neusoft.dao.ProInsertDao;
import com.neusoft.dao.impl.ProInsertDaoImpl;
import com.neusoft.entity.OfferPrice;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductInsertServiceImpl implements ProductInsertService {

    @Override
    public List<Product> insertProduct() throws SQLException {
        ProInsertDao dao = new ProInsertDaoImpl();
        return null;
    }
}
