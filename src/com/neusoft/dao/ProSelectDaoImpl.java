package com.neusoft.dao;

import com.neusoft.entity.Product;
import com.neusoft.util.DButil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProSelectDaoImpl {
    private final String URL = "jdbc:mariadb://localhost:3306/mysqldb";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";

    public void selectProduct(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DButil.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            final String SQL = "select * from mysqldb.product;";
            resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1)+","
                        +resultSet.getString(2)+","+ resultSet.getString(3));
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
    }
}

