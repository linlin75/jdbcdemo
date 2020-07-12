package com.neusoft.dao;

import com.neusoft.entity.OfferPrice;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface OfpUpdateDao {
    //修改信息
    public abstract List<OfferPrice> updateOfp() throws SQLException;

}
