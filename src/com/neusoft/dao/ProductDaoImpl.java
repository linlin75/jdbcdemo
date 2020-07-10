package com.neusoft.dao;

import com.haha.util.DBUtil;
import com.neusoft.entity.Product;
import com.neusoft.util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    private final String URL = "jdbc:mariadb://localhost:3306/mysqldb";
    private final String USER = "root";
    private final String PASSWORD = "mariadb";

    public List<Product> selectProByName(String title) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        List<Product> emps=new ArrayList<>();

        try {
            connection = DBUtil.getConnection(URL, USER, PASSWORD);
            final String SQL = "select empno,ename,sal from mysqldb.emp where sal>?;";
            preparedStatement=connection.prepareStatement(SQL);
            preparedStatement.setString(1,title);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                emps.add(new Product(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        }
        return emps;
    }
}

