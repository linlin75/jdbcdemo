package com.neusoft.service;

import com.neusoft.dao.ProSelectDao;
import com.neusoft.dao.impl.ProSelectDaoImpl;
import com.neusoft.entity.PS;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductSelectServiceImpl implements ProductSelectService {
    //查询商品所有信息
    @Override
    public List<PS> selectProduct() throws SQLException {
        ProSelectDao dao = new ProSelectDaoImpl();
        return dao.selectProduct();
    }
}

