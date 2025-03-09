package com.multi.d_dbcp.run;

//              jdbc                                        dbcp
//     개념       Java에서 데이터베이스와 통신하는 표준 API       커넥션을 미리 생성하여 재사용하는 풀링 기법
//     접속 방식  매 요청마다 새로운 커넥션 생성              일정 개수의 커넥션을 유지하며 재사용
//     속도       매번 DB 연결/해제 필요 → 속도 느림          커넥션을 재사용 → 속도 빠름
//     리소스 관리 커넥션 개수가 많아질수록 부담 증가             최대 커넥션 개수를 제한하여 리소스 관리 가능
//     주요 사용처 간단한 테스트, 단일 요청 처리              대규모 트래픽이 필요한 웹 애플리케이션

import com.multi.d_dbcp.view.MemberMenu;

public class App {
    public static void main(String[] args) {
        new MemberMenu().mainMenu();
    }
}
