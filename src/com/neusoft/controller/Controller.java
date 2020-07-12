package com.neusoft.controller;

import com.neusoft.entity.Product;
import com.neusoft.service.ProductInsertService;
import com.neusoft.service.ProductInsertServiceImpl;

import java.sql.SQLException;
import java.util.List;
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
                    ProductInsertService service = new ProductInsertServiceImpl() {
                        @Override
                        public List<Product> insertProduct() throws SQLException {
                            return insertProduct();
                        }
                    };
                    break;
                case 2:
                    System.out.println("开始删除商品数据：");

                    break;
                case 3:
                    System.out.println("开始查询商品数据：");

                    break;
                case 4:
                    System.out.println("添加促销商品的信息：");

                    break;
                case 5:
                    System.out.println("删除促销商品的信息：");

                    break;
                case 6:
                    System.out.println("修改促销商品的信息");

                    break;
                case 7:
                    System.out.println("查询促销商品的信息");

                    break;
                default:
                    System.out.println("操作结束！");
                    break;
            }
        }
    }
}
