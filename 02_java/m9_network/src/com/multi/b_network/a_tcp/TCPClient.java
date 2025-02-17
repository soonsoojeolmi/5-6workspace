package com.multi.b_network.a_tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    //        서버는 accept()를 호출한 상태에서 대기
//        클라이언트가 연결 요청(SYN)
//        서버가 SYN + ACK 응답
//        클라이언트가 ACK 전송 → TCP 3-way handshake 완료
//        서버는 accept()에서 클라이언트의 연결을 받아들임
//        새로운 Socket 객체를 반환하고, 이후 데이터 통신 가능

    public static void main(String[] args) {
        for(int i= 0 ; i < 100 ; i++){
            try {
                Socket socket = new Socket("localhost", 9090);

                System.out.println("클라이언트가 접속 함 >> "+i);

                BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String data = bufferedReader.readLine();
                System.out.println(data);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
