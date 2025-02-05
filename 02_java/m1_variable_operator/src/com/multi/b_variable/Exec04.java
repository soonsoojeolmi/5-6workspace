package com.multi.b_variable;

public class Exec04 {
    public static void main(String[] args) {
        // 1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
        int age = 30;
        // int age = 25; // 동일한 변수명을 사용할 수 없으므로 에러 발생

        // 1-2. 예약어는 변수명으로 사용할 수 없다.
        // int true = 1;  // 예약어를 변수명으로 사용할 수 없으므로 에러 발생
        // int for = 10;  // 예약어 사용 불가

        // 1-3. 변수명은 대/소문자를 구분한다.
        int Age = 25;   // 'age'와 'Age'는 서로 다른 변수로 인식된다.
        int TrueValue = 5; // 예약어와 대소문자가 다르므로 사용 가능

        // 1-4. 변수명은 숫자로 시작할 수 없다.
        // int 1age = 20;  // 숫자로 시작하는 변수명은 에러 발생
        int age1 = 20;  // 숫자가 뒤에 있는 것은 허용됨

        // 1-5. 특수기호는 '_'와 '$'만 사용 가능하다.
        // int sh@rp = 20;  // 특수기호 '@'는 변수명에 사용할 수 없음
        int _age = 20;  // 언더스코어는 변수명에 사용 가능
        int $harp = 30; // '$'도 사용 가능

        // 2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙

        // 2-1. 변수명의 길이 제한은 없다. 하지만 적당한 길이를 유지하는 것이 좋다.
        int reallyLongVariableNameThatDescribesAge = 25; // 너무 긴 변수명은 가독성을 해친다.

        // 2-2. 합성어로 이루어진 변수명은 camel-case를 사용한다.
        int maxAge = 35;   // 첫 단어는 소문자, 이후 단어는 대문자로 시작
        int minAge = 18;   // camel-case 규칙을 따르는 변수명

        // 2-3. 단어 사이에 언더스코어(_)를 사용하지 않는다.
        String user_name;  // 언더스코어 사용 권장하지 않음
        String userName;   // camel-case가 권장됨

        // 2-4. 한글 변수명을 사용하는 것을 피한다.
        int 나이;  // 한글 변수명 사용은 가능하지만 권장하지 않음
        int ageOfUser; // 영어로 변수명을 작성하는 것이 좋다.

        // 2-5. 변수명은 의미를 명확하게 표현해야 한다.
        String s;  // 의미가 모호한 변수명
        String phoneNum;  // 의미가 명확한 변수명

        // 2-6. 전형적인 변수 이름을 사용하는 것이 좋다.
        int sum = 0;   // 전형적인 변수명 사용
        int count = 1; // 반복문 등에서 자주 사용되는 변수명

        // 2-7. 변수명은 명사형으로 작성하는 것이 좋다.
        String goHome;  // 동사형 변수명은 피하는 것이 좋다.
        String home;    // 명사형 변수명 사용이 권장됨

        // 2-8. boolean 변수는 의문문 형태로 긍정적으로 작성한다.
        boolean isAlive = true;  // 긍정적인 의문문 형태로 네이밍 //살아 있는가?
        boolean hasPermission = false;  // 긍정적인 형태로 변수명을 작성 //권한이 있는가?

    }

}
