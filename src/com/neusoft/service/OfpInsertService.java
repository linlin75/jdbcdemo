package com.neusoft.service;

import com.neusoft.entity.OfferPrice;

import java.sql.SQLException;
import java.util.List;

public interface OfpInsertService {
    public List<OfferPrice> insertOfferPrice() throws SQLException;

}
