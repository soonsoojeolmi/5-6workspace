package com.multi.d_app.view;

import com.multi.d_app.controller.ProductController;
import com.multi.d_app.dto.Product;

import java.util.Scanner;

public class ProductMenu {
    private Scanner sc= new Scanner(System.in);
    private ProductController productController = new ProductController();

    public void mainMenu(){
        System.out.println("제품명 : ");
        String name = sc.nextLine();

        System.out.println("브랜드명 : ");
        String brand= sc.nextLine();

        System.out.println("가격 : ");
        int price = sc.nextInt();

        productController.insertProduct(name, brand, price);

        while(true){
            System.out.println("=====메인메뉴=====");
            System.out.println("1.제품정보조회");
            System.out.println("2.제품정보수정");
            System.out.println("9.프로그램종료");

            int num = sc.nextInt();

            sc.nextLine();

            switch(num){
                case 1 :
                    Product p = productController.selectPro();
                    System.out.println(p.toString());
                    //System.out.println(productController.selectPro().toString());
                    break;

                case 2 :
                    updatePrice();
                    break;

                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default :
                    System.out.println("다시 입력해주세요");
                    break;

            }
        }
    }

    private  void updatePrice(){
        System.out.println("수정할 가격을 입력하세요 ");
        int newPrice = sc.nextInt();
        productController.updatePrice(newPrice);
    }
}
