package com.neusoft.test;

import com.neusoft.dao.InsertDaoImpl;
import com.neusoft.dao.ProDelectDaoImpl;
import com.neusoft.dao.ProSelectDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1:给表Product插入数据：");
            System.out.println("2:删除表Product的数据：");
            System.out.println("3:查找表Product的数据：");
            System.out.println("5:输入5退出");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("开始插入数据");
                    new InsertDaoImpl().Test();
                    break;
                case 2:
                    System.out.println("开始删除数据：");
                    new ProDelectDaoImpl().delectProduct();
                    break;
                case 3:
                    System.out.println("开始查找数据：");
                        new ProSelectDaoImpl().selectProduct();
                    break;
                case 5:
                default:
                    System.out.println("欢迎使用");
                    System.exit(0);
                    break;
            }
        }
    }
}
