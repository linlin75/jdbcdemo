package com.neusoft.dao;

import com.neusoft.entity.OfferPrice;

import java.sql.SQLException;
import java.util.List;

public interface OfpInsertDao {
    //查询详细商品活动信息
    public abstract List<OfferPrice> insertOfferPrice() throws SQLException;
}
