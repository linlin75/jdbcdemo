package com.neusoft.service;

import com.neusoft.entity.OfferPrice;
import java.sql.SQLException;
import java.util.List;

public class OfpSelectServiceImpl implements OfpSelectService{

    @Override
    public List<OfferPrice> selectOfferPrice() throws SQLException {
        OfpSelectService dao = new OfpSelectServiceImpl();
        return dao.selectOfferPrice();
    }
}
