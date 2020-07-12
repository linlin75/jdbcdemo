package com.neusoft.service;

import com.neusoft.entity.OfferPrice;

import java.sql.SQLException;
import java.util.List;

public class OfpInsertServiceImpl implements OfpInsertService{
    @Override
    public List<OfferPrice> insertOfferPrice() throws SQLException {
        OfpInsertService dao = new OfpInsertServiceImpl();
        return dao.insertOfferPrice();
    }
}
