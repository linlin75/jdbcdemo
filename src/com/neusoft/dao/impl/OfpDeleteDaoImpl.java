package com.neusoft.dao.impl;

import com.neusoft.dao.OfpDeleteDao;
import com.neusoft.entity.OfferPrice;
import com.neusoft.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfpDeleteDaoImpl implements OfpDeleteDao {
    private final String DBURL = "jdbc:mariadb://localhost:3306/";
    private final String DB = "mysqldb";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";

    @Override
    public List<OfferPrice> deleteOfferPrice() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner sc = new Scanner(System.in);

        List<OfferPrice> offerPrices = new ArrayList<>();

        try {
            connection = DButil.getConnection(DB, DBURL, USER, PASSWORD);
            final String SQL = "delete from product where pro_id = ?;";
            preparedStatement = connection.prepareStatement(SQL);
            System.out.println("请输入你要删除的促销商品的ID：");
            int num = sc.nextInt();
            preparedStatement.setInt(1, num);
            preparedStatement.executeUpdate();
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
        }
        return offerPrices;
    }
}
