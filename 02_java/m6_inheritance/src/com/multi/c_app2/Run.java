package com.multi.c_app2;

public class Run {
    public static void main(String[] args) {
        HotBeverage coffee = new HotBeverage("뜨아",  4000);
        System.out.println(coffee);
        coffee.describe();

        System.out.println("--------------------------------------------------------");

        ColdBeverage lemonade = new ColdBeverage("레몬에이드", 4500, 2, true);
        System.out.println(lemonade);
        lemonade.describe();

        System.out.println("--------------------------------------------------------------------");

        MainDish pasta = new MainDish("봉골레", 20000);
        System.out.println(pasta);

        System.out.println("--------------------------------------------------------------------");

        Dessert desserts1 = new Dessert("초코", 5000, "아이스크림");
        System.out.println(desserts1);

        System.out.println("--------------------------------------------------------------------");

        Dessert desserts2 = new Dessert("초코", 5000, "아이스크림");
        System.out.println(desserts2);

        System.out.println("--------------------------------------------------------------------");

        //parent 타입으로 객체 생성(Food 타입으로 Dessert 객체 생성)
        Dessert desserts3 = new Dessert("초코", 5000, "아이스크림");
        System.out.println(desserts3);
        //Food 타입에 있는 toString() 호출 , 컴파일시 정적 바인딩
        //->실행 시 Dessert의 toString()  메서드가 호출됨(런타임시, 동적 바인딩)

        System.out.println("--------------------------------------------------------------------");
        /* 동적바인딩
         * 컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가.
         * 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것을 의미한다.
         * */

        Beverage cola2 = new ColdBeverage("콜라", 4500, 2, true);
        System.out.println(cola2);
        cola2.describe();

        MenuItem cola3 = new ColdBeverage("콜라", 4500, 2, true);
        System.out.println(cola2);

        Object cola4 = new ColdBeverage("콜라", 4500, 2, true);
        System.out.println(cola2);
        String str = "11";

        //다운캐스팅, 자식 클래스 타입으로 형변환, 자식클래스 메소드를 모두 사용 가능
        //명시적 형변환 해줘야 한다. Beverage -> ColdBeverage 다운
        ColdBeverage cola5= (ColdBeverage) cola2;
        cola5.describe();
        cola5.isCarbonated();

        ColdBeverageEnum  cold1 = new ColdBeverageEnum("콜라", 4500,IceLevel.LOW, true);
        System.out.println(cold1);
        cold1.describe();
    }
}
