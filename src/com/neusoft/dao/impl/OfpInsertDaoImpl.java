package com.neusoft.dao.impl;

import com.neusoft.dao.OfpInsertDao;
import com.neusoft.entity.OfferPrice;
import com.neusoft.util.DButil;
import sun.util.calendar.BaseCalendar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OfpInsertDaoImpl implements OfpInsertDao {
    private final String DBURL = "jdbc:mariadb://localhost:3306/";
    private final String DB = "mysqldb";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";


    public List<OfferPrice> insertOfferPrice() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int num = 0;

        List<OfferPrice> offerPrices = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要插入的商品详细信息的ID：");
        int ofpId = scanner.nextInt();
        System.out.println("请输入你要插入的商品活动开始时间：");
        String effetiveStarDate = scanner.next();
        System.out.println("请输入你要插入的商品活动结束时间：");
        String effetiveEndDate = scanner.next();
        System.out.println("请输入你要插入商品的价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入商品的活动类型：");
        String typeCD = scanner.next();
        System.out.println("请输入你要插入商品的ID：");
        int proid = scanner.nextInt();
        OfferPrice o = new OfferPrice();
        o.setOfpId(ofpId);
        o.setEffetiveStarDate(effetiveStarDate);
        o.setEffetiveEndDate(effetiveEndDate);
        o.setPrice(price);
        o.setTypeCD(typeCD);
        o.setProId(proid);
        offerPrices.add(o);

        try {
            connection = DButil.getConnection(DB, DBURL, USER, PASSWORD);
            final String SQL = "insert into Product values (?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(SQL);
            for (int i = 0; i < offerPrices.size(); i++) {
                preparedStatement.setInt(1, offerPrices.get(i).getOfpId());
                preparedStatement.setString(2, offerPrices.get(i).getEffetiveStarDate());
                preparedStatement.setString(3, offerPrices.get(i).getEffetiveEndDate());
                preparedStatement.setDouble(4, offerPrices.get(i).getPrice());
                preparedStatement.setString(5, offerPrices.get(i).getTypeCD());
                preparedStatement.setInt(6, offerPrices.get(i).getProId());

                num = preparedStatement.executeUpdate();
            }
            System.out.println(num == 0 ? "没有数据改变" : "插入了" + num + "条数据");
        } catch (
                SQLException throwables) {
            System.out.println(throwables.getMessage());
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
