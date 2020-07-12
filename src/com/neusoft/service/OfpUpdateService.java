package com.neusoft.service;

import com.neusoft.entity.OfferPrice;

import java.sql.SQLException;
import java.util.List;

public interface OfpUpdateService {
    List<OfferPrice> updateOfp() throws SQLException;
}
