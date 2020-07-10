package com.neusoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String DB, String URL, String USER, String PASSWORD) throws SQLException {
        return DriverManager.getConnection(URL + DB + "?user=" + USER + "&password=" + PASSWORD);
    }

    public static Connection getConnection(String URL, String USER, String PASSWORD) throws SQLException {
        return DriverManager.getConnection(URL + "?user=" + USER + "&password=" + PASSWORD);
    }

    public static Connection getConnection(String url) throws SQLException {
        return DriverManager.getConnection(url);
    }
}
