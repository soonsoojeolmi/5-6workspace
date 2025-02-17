package com.multi.b_network.a_tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    /*
     *  * Socket
     *  - 프로세스간의 통신을 담당
     *  - input / outputStream을 보유(이 스트림을 통해 프로세스간의 통신(입/출력)이 이루어짐)
     *
     *  * ServerSocket
     *  - 포트와 연결(Bind)되어 외부의 연결 요청을 기다리다 연결요청이 들어오면
     *    Socket을 생성하여 소켓과 소켓간의 통신이 이루어 지도록 함
     *  - 한 포트에 하나의 ServerSocket만 연결할 수 있다.
     */
    /*
     * 서버용 TCP 소켓 프로그래밍 순서
     *
     * 1) 서버의 포트번호 정함
     * 2) 서버용 소켓 객체 생성 시 포트와 결합
     * 3) 클라이언트 쪽에서 접속 요청이 오길 기다림
     * 4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
     * 5) 연결된 클라이언트와 입출력 스트림 생성
     * 6) 보조스트림을 통해 성능 개선
     * 7) 스트림을 통해 읽고 쓰기
     * 8) 통신 종료
     */

    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(9090);//0~65535 ---> 0~1023을 피해서 사용
            System.out.println("서버소켓 시작");
            System.out.println("클라이언트의 요청을 기다리는 중");

            int count=0;
            while(true){
                Socket socket = serverSocket.accept();

                count++;

                System.out.println("클라이언트 연결됨 "+count + " 접속");

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                out.print("안녕!!");

                out.close();
                socket.close();
            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
