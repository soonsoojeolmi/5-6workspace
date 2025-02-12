package com.multi.c_app2;

/**
 * packageName    : com.multi.c_app2
 * fileName       : Beverage
 * author         : uni
 * date           : 2025-02-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-12        uni       최초 생성
 */
public class Beverage extends MenuItem{

    private boolean isHot;


    public Beverage(String name, int price, boolean isHot) {
        super(name, price);
        this.isHot = isHot;


    }

    public void describe() {
        System.out.println("이 음료는 " + (isHot ? "뜨겁습니다." : "차갑습니다."));
    }



}
