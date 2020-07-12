package com.neusoft.dao.impl;

import com.neusoft.dao.OfpUpdateDao;
import com.neusoft.entity.OfferPrice;
import com.neusoft.entity.Product;
import com.neusoft.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfpUpdateDaoImpl implements OfpUpdateDao {
    String DBURL = "jdbc:mariadb://localhost:3306/";
    String DB = "test";
    String USER = "root";
    String PASSWORD = "mariadb";

    @Override
    public List<OfferPrice> updateOfp() throws SQLException {

        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        Scanner sc = new Scanner(System.in);
        int num = 0;
        List<Product> products = new ArrayList<>();
        try {
            Product p = new Product();
            connection = DButil.getConnection(DB, DBURL, USER, PASSWORD);
            final String SQL = "update offerprice set effetiveStartDate=?," +
                    "effetiveEndDate=?,price=?,typecd=? where ofpld=?;";
            PreparedStatement pstmt;
            pstmt = connection.prepareStatement(SQL);
            System.out.println("开始修改offerprice表数据");
            System.out.println("输入修改后的商品编号");
            int ofpld = sc.nextInt();
            System.out.println("输入修改后的促销起始时间");
            String star = sc.next();
            System.out.println("输入修改后的促销截至时间");
            String end = sc.next();
            System.out.println("输入修改后的商品价格");
            int price = sc.nextInt();
            System.out.println("输入修改后商品是否促销");
            String type = sc.next();
            pstmt.setString(1, star);
            pstmt.setString(2, end);
            pstmt.setInt(3, price);
            pstmt.setString(4, type);
            pstmt.setInt(5, ofpld);
            num = pstmt.executeUpdate();
            System.out.println(num == 0 ? "没有数据改变" : "修改了" + num + "条数据");

        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
     return updateOfp();
    }
}
