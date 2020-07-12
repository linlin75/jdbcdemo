package com.neusoft.controller;

import com.neusoft.service.*;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("欢迎使用本系统，很开心为您服务！");
        System.out.println("============商品管理系统============");
        System.out.println("*   1.商品管理                    *");
        System.out.println("*   2.退出系统                    *");
        System.out.println("==================================");
        System.out.println("请选择一个功能（数字即可）：");

        boolean flag = true;
        while (flag) {
            if ("1".equals(sc.nextLine())) {
                manageProduct();
            } else {
                return;
            }
        }
    }

    private static void manageProduct() {
        while (true) {
            System.out.println("=================================");
            System.out.println("*   1.添加商品                    *");
            System.out.println("*   2.删除商品                    *");
            System.out.println("*   3.查询商品                    *");
            System.out.println("*   4.添加促销商品的信息            *");
            System.out.println("*   5.删除促销商品的信息            *");
            System.out.println("*   6.修改促销商品的信息            *");
            System.out.println("*   7.查询促销商品的信息            *");
            System.out.println("*   8.退出并返回主页面              *");
            System.out.println("==================================");
            System.out.println("请选择一个功能（数字即可）：");

            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("开始添加商品数据：");
                    ProductInsertService ps = new ProductInsertServiceImpl();
                    try {
                        ps.insertProduct();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("开始删除商品数据：");
                    ProductDeleteService p = new ProductDeleteServiceImpl();
                    try {
                        p.deleteProduct();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("开始查询商品数据：");
                    ProductSelectService s = new ProductSelectServiceImpl();
                    try {
                        System.out.println(s.selectProduct());
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("添加促销商品的信息：");
                    OfpInsertService is = new OfpInsertServiceImpl();
                    try {
                        is.insertOfferPrice();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("删除促销商品的信息：");
                    OfpDeleteService os = new OfpDeleteServiceImpl();
                    try {
                        os.selectOfferPrice();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 6:
                    System.out.println("修改促销商品的信息");
                    OfpUpdateService ou = new OfpUpdateServiceImpl();
                    try {
                        ou.updateOfp();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case 7:
                    System.out.println("查询促销商品的信息");
                    OfpSelectService l = new OfpSelectServiceImpl();
                    try {
                        l.selectOfferPrice();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("操作结束！");
                    break;
            }
        }
    }
}
