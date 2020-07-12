package com.neusoft.service;

import com.neusoft.dao.OfpDeleteDao;
import com.neusoft.dao.impl.OfpDeleteDaoImpl;
import com.neusoft.entity.OfferPrice;

import java.sql.SQLException;
import java.util.List;

public class OfpDeleteServiceImpl implements OfpDeleteService{
    @Override
    public List<OfferPrice> selectOfferPrice() throws SQLException {
        OfpDeleteDao dao =new  OfpDeleteDaoImpl();
        return dao.deleteOfferPrice();
    }
}
