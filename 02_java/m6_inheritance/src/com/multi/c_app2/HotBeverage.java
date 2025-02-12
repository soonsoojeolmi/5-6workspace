package com.multi.c_app2;

/**
 * packageName    : com.multi.c_app2
 * fileName       : HotBeverage
 * author         : uni
 * date           : 2025-02-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-12        uni       최초 생성
 */
public class HotBeverage extends Beverage {


    public HotBeverage(String name, int price) {
        super(name, price, true);
    }


    @Override
    public void describe() {
        super.describe();
        System.out.println("HotBeverage 제공 ");
    }
}
