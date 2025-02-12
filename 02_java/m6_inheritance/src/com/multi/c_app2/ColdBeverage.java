package com.multi.c_app2;

public class ColdBeverage extends Beverage { // Beverage를 상속받음

    private int iceLevel; // 얼음의 양 (0: 없음, 1: 적게, 2: 보통, 3: 많이)
    private boolean isCarbonated; // 탄산 여부

    @Override
    public void describe() {
        super.describe(); // 부모 클래스의 describe() 호출
        System.out.println("이 음료는 차가운 상태로 제공됩니다.");

        // 얼음의 양에 따른 설명
        System.out.println(switch (iceLevel) {
            case 0 -> "얼음 없이 제공됩니다.";
            case 1 -> "얼음이 적게 들어갑니다.";
            case 2 -> "얼음이 보통으로 들어갑니다.";
            case 3 -> "얼음이 많이 들어갑니다.";
            default -> "얼음 양을 알 수 없습니다.";
        });

        // 탄산 여부에 따른 설명
        if (isCarbonated) {
            System.out.println("이 음료는 탄산이 포함되어 있습니다.");
        } else {
            System.out.println("이 음료는 탄산이 포함되어 있지 않습니다.");
        }
    }

    public ColdBeverage(String name, int price, int iceLevel, boolean isCarbonated) {
        super(name, price,false); // 부모 생성자 호출 (Beverage 클래스 확인 필요)
        this.iceLevel = iceLevel;
        this.isCarbonated = isCarbonated;
    }

    public Boolean isCarbonated(){
    return isCarbonated;
    }
}
