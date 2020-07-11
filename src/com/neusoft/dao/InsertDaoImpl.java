package com.neusoft.dao;

import com.neusoft.entity.Product;
import com.neusoft.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDaoImpl {
    private final String STATICURL = "jdbc:mariadb://localhost:3306/mysqldb?user=root&password=mariadb";
    private final String DBURL = "jdbc:mariadb://localhost:3306/";
    private final String URL = "jdbc:mariadb://localhost:3306/mysqldb";
    private final String DB = "mysqldb";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";
    //用list把要插入的数据存起来
   /* List<Product> getAllProduct() {

        return product;
    }*/


    public void Test() {
        List<Product> product = new ArrayList<Product>();
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
        //System.out.println(getAllProduct());          //打印出插入的数据
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        //List<Product> product = getAllProduct();
        int num = 0;
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
    }
}

