package com.neusoft.dao;

import com.neusoft.entity.OfferPrice;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface OfpSelectDao {
    //查询详细商品活动信息
    public abstract List<OfferPrice> selectOfferPrice() throws SQLException;

}
