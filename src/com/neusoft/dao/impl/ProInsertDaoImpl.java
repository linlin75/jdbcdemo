package com.neusoft.dao.impl;

import com.neusoft.dao.ProInsertDao;
import com.neusoft.entity.Product;
import com.neusoft.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProInsertDaoImpl implements ProInsertDao {
    private final String DBURL = "jdbc:mariadb://localhost:3306/";
    private final String DB = "mysqldb";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";

    public List<Product> insertProduct() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int num = 0;

        List<Product> product = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要插入的ID：");
        int proid = scanner.nextInt();
        System.out.println("请输入你要插入的商品编号：");
        String sku = scanner.next();
        System.out.println("请输入你要插入的商品名称：");
        String title = scanner.next();
        Product p = new Product();
        p.setProId(proid);
        p.setSku(sku);
        p.setTitle(title);
        product.add(p);

        try {
            connection = DButil.getConnection(DB, DBURL, USER, PASSWORD);
            final String SQL = "insert into Product values (?,?,?)";
            preparedStatement = connection.prepareStatement(SQL);
            for (int i = 0; i < product.size(); i++) {
                preparedStatement.setInt(1, product.get(i).getProId());
                preparedStatement.setString(2, product.get(i).getSku());
                preparedStatement.setString(3, product.get(i).getTitle());

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
        return product;
    }
}

