package com.neusoft.dao.impl;

import com.neusoft.dao.OfpSelectDao;
import com.neusoft.entity.OfferPrice;
import com.neusoft.util.DButil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OfpSelectDaoImpl implements OfpSelectDao {
    private final String DBURL = "jdbc:mariadb://localhost:3306/";
    private final String DB = "mysqldb";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";

    public List<OfferPrice> selectOfferPrice() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        ResultSet resultSet = null;

        List<OfferPrice> prices = new ArrayList<>();

        try {
            connection = DButil.getConnection(DB, DBURL, USER, PASSWORD);
            statement = connection.createStatement();
            final String SQL = "select * from mysqldb.offer_price;";
            resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + ","
                        + resultSet.getString(2) + ","
                        + resultSet.getString(3) + ","
                        + resultSet.getDouble(4) + ","
                        + resultSet.getString(5) + ","
                        + resultSet.getInt(6));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                }
            }
        }
        return prices;
    }
}
