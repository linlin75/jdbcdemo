package com.haha;
import com.neusoft.util.DButil;
import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws SQLException {
        final String URL = "jdbc:mariadb://localhost:3306/mysqldb";
        final String USER = "root";
        final String PASSWORD = "mariadb";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DButil.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            final String SQL = "select e1.empno,rpad(e1.ename,6,' '),rpad(truncate(e1.sal,0),4,' '),e1.mgr,rpad(e2.ename,6,' '),d.loc from emp e1 left join emp e2 on e1.mgr=e2.empno left join dept d on e1.deptno = d.deptno where d.loc='chicago';";
            resultSet = statement.executeQuery(SQL);
            System.out.println("empno | ename |   sal |  mgr  | mname |  loc  |");
            while (resultSet.next()) {
                System.out.printf("%d\t%s\t%s\t%d\t%s\t%s%n", resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getString(5), resultSet.getString(6));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        }
    }
}