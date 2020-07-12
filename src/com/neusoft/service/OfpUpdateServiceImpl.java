package com.neusoft.service;

import com.neusoft.dao.OfpUpdateDao;
import com.neusoft.dao.impl.OfpUpdateDaoImpl;
import com.neusoft.entity.OfferPrice;

import java.sql.SQLException;
import java.util.List;

public class OfpUpdateServiceImpl implements OfpUpdateService{
    @Override
    public List<OfferPrice> updateOfp() throws SQLException {
        OfpUpdateDao dao = new OfpUpdateDaoImpl();
        return dao.updateOfp();
    }
}
