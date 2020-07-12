package com.neusoft.dao.impl;

import com.neusoft.dao.ProSelectDao;
import com.neusoft.entity.PS;
import com.neusoft.util.DButil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProSelectDaoImpl implements ProSelectDao {
    private final String URL = "jdbc:mariadb://localhost:3306/mysqldb";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";

    public List<PS> selectProduct() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Statement statement = null;

        Scanner sc = new Scanner(System.in);
        List<PS> ps = new ArrayList<PS>();

        try {
            connection = DButil.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            final String SQL = "select p.pro_id ,p.title,o.price,o.typecd " +
                    "from product p,offer_price o where p.pro_id = o.pro_id;";
            resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                ps.add(new PS(resultSet.getInt(1), resultSet.getString(2)
                        , resultSet.getDouble(3), resultSet.getString(4)));
                if (resultSet.getString(4).equals("促销商品")) {
                    final String sql = "update offer_price set price=? where ofp_id=?;";
                    PreparedStatement pls;
                    pls = connection.prepareStatement(sql);
                    System.out.println("该商品正在促销");
                    System.out.println("显示促销商品的ID：");
                    int ofpId = sc.nextInt();
                    System.out.println("请输入促销价格：");
                    double price = sc.nextDouble();
                    if (resultSet.getDouble(3) > price) {
                        System.out.println("正价低于促销价格");
                        pls.setDouble(1, price);
                        pls.setInt(2, ofpId);
                        pls.executeUpdate();
                    }
                }
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
        return ps;
    }
}

