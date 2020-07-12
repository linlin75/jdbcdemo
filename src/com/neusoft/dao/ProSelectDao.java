package com.neusoft.dao;

import com.neusoft.entity.PS;

import java.sql.SQLException;
import java.util.List;

public interface ProSelectDao {
    //查询商品信息
    public abstract List<PS> selectProduct() throws SQLException;

}
