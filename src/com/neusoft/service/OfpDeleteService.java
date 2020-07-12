package com.neusoft.service;

import com.neusoft.entity.OfferPrice;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface OfpDeleteService {
    //删除促销商品信息
    public List<OfferPrice> selectOfferPrice() throws SQLException;
}
