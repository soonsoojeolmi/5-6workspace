package com.multi.collection.d_mvc.view;

import com.multi.collection.d_mvc.controller.CafeController;
import com.multi.collection.d_mvc.model.dto.MenuItem;

import java.util.List;
import java.util.Scanner;

public class CafeMenu {
    private static final Scanner sc = new Scanner(System.in); // ✅ 클래스 멤버로 선언
    private final CafeController cc = new CafeController(); // ✅ 클래스 멤버로 선언

    public void mainMenu() {
        while (true) {
            System.out.println("===== 카페 메뉴 관리 프로그램 =====");
            System.out.println("1. 메뉴 추가");
            System.out.println("2. 메뉴 전체 조회");
            System.out.println("3. 메뉴 가격 수정");
            System.out.println("4. 특정 메뉴 조회");
            System.out.println("5. 메뉴 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            int choice = sc.nextInt();
            sc.nextLine(); // 개행문자 처리

            switch (choice) {
                case 1:
                    addMenuItem();
                    break;
                case 2:
                    findAllMenuItems();
                    break;
                case 3:
                    updateMenuItemPrice();
                    break;
                case 4:
                    findMenuItem();
                    break;
                case 5:
                    deleteMenuItem();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");
                    break;
            }
        }
    }

    private void deleteMenuItem() {
        System.out.println("삭제할 메뉴명: ");
        String name = sc.nextLine();

        boolean isDelete = cc.deleteMenuItem(name); // ✅ 삭제 결과 변수를 추가하여 사용

        if(!isDelete){
            System.out.println("메뉴 삭제 실패");
        }else{
            System.out.println("메뉴 삭제 성공");
        }
    }

    private void findMenuItem() {
        System.out.println("조회할 메뉴명: ");
        String name = sc.nextLine();

        MenuItem item = cc.findMenuItem(name); // ✅ 변수명 수정 (Item → item)
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("해당 메뉴를 찾을 수 없습니다.");
        }
    }

    private void updateMenuItemPrice() {
        System.out.println("수정할 메뉴명: ");
        String name = sc.nextLine();
        System.out.println("새로운 가격: ");
        int newPrice = sc.nextInt();
        sc.nextLine(); // 개행문자 처리

        boolean isUpdate = cc.updatePrice(name, newPrice);
        if(!isUpdate){
            System.out.println("가격 수정 실패");
        }else{
            System.out.println("가격 수정 성공");
        }
    }

    private void findAllMenuItems(){
        System.out.println("=== 전체메뉴조회 ===");
        List<MenuItem> menuItemList = cc.getMenuList();
        for(MenuItem menuItem: menuItemList){
            System.out.println(menuItem);
        }
    }

    private void addMenuItem() {
        System.out.println("메뉴명: ");
        String name = sc.nextLine();
        System.out.println("카테고리: ");
        String category = sc.nextLine();
        System.out.println("가격: ");
        int price = sc.nextInt();
        sc.nextLine(); // 개행문자 처리

        cc.addMenuItem(name, category, price);
        System.out.println("메뉴가 추가되었습니다.");
    }
}
