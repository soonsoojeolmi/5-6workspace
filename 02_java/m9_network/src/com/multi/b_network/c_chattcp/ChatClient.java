package com.multi.b_network.c_chattcp;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    String chatName;


    public static void main(String[] args) {


        try {
            ChatClient chatClient = new ChatClient();
            chatClient.connect();

            Scanner scanner = new Scanner(System.in);
            System.out.println("대화명 입력: ");
            chatClient.chatName = scanner.nextLine();

            // JSON 객체 생성 (입장 메시지)
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("command", "incoming");  // 입장 알림
            jsonObject.put("data", chatClient.chatName); // 사용자의 닉네임 포함
            String json = jsonObject.toString();
            chatClient.send(json); // 서버에 전송

            chatClient.receive(); // 서버에서 오는 메세지 받기



            // 안내 메시지 출력
            System.out.println("--------------------------------------------------");
            System.out.println("보낼 메시지를 입력하고 Enter");
            System.out.println("채팅을 종료하려면 'q'를 입력하고 Enter");
            System.out.println("--------------------------------------------------");

            // 채팅 메시지 입력 및 전송
            while (true) {
                String message = scanner.nextLine(); // 사용자 입력 받기
                if (message.toLowerCase().equals("q")) { // 'q' 입력 시 종료
                    break;
                } else {
                    jsonObject = new JSONObject();
                    jsonObject.put("command", "message"); // 일반 메시지 전송
                    jsonObject.put("data", message); // 입력한 메시지 포함
                    json = jsonObject.toString();
                    chatClient.send(json); // 서버에 전송
                }
            }

            // 채팅 종료
            scanner.close();
            chatClient.unconnect(); // 서버 연결 해제

        } catch (IOException e) {
            System.out.println("[클라이언트] 서버 연결 안됨");
        }
    }

    private void unconnect() throws IOException {
        socket.close(); // 소켓 종료
    }

    // 서버로 부터 메세지 수신받기
    private void receive() {

        Thread thread = new Thread(()->{

            while (true){
                try {
                    String json = dis.readUTF();
                    JSONObject root = new JSONObject(json);

                    String clientIp = root.getString("clientIp");
                    String chatName = root.getString("chatName");
                    String message = root.getString("message");


                    System.out.println("<" + chatName + "@" + clientIp + "> " + message);


                } catch (IOException e) {
                    System.out.println("[클라이언트] 서버 연결 끊김");
                    System.exit(0); // 클라이언트 종료
                }
            }


        });


        thread.start();


    }

    private void send(String json) throws IOException {

        dos.writeUTF(json);
        dos.flush();
    }

    // 서버연결
    private void connect() throws IOException {
        socket = new Socket("localhost", 10000);
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
        System.out.println("[클라이언트] 서버에 연결됨");
    }
}
