package com.neusoft.service;

import com.neusoft.entity.OfferPrice;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface OfpSelectService {
    //查询商品活动信息
    List<OfferPrice> selectOfferPrice() throws SQLException;
}
