package com.neusoft.dao;

import com.neusoft.entity.OfferPrice;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface OfpDeleteDao {
    public abstract List<OfferPrice> deleteOfferPrice() throws SQLException;
}
