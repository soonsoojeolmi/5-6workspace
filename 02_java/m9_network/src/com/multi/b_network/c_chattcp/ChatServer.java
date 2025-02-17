package com.multi.b_network.c_chattcp;

import org.json.JSONObject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {

    ServerSocket serverSocket;
    ExecutorService threadPool = Executors.newFixedThreadPool(100);
    Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());

    public static void main(String[] args) {

        ChatServer chatServer = new ChatServer();
        try {
            chatServer.start();

            System.out.println("----------------------------------------------------");
            System.out.println("서버를 종료하려면 q 를 입력하고 Enter.");
            System.out.println("----------------------------------------------------");

            // 사용자 입력을 통해 서버 종료 명령(q)을 받음
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String key = scanner.nextLine();
                if (key.equals("q")) break; // q 입력 시 종료
            }
            scanner.close();
            chatServer.stop(); // 서버 종료
        } catch (IOException e) {

            System.out.println("[서버 ]" + e.getMessage());
        }


    }

    private void stop() throws IOException {
        serverSocket.close(); // 서버 소켓 종료
        threadPool.shutdownNow(); // 스레드 풀 종료
        chatRoom.values().stream().forEach(sc -> sc.close());
        System.out.println("[서버 종료 ]");


    }

    public void start() throws IOException {

        serverSocket = new ServerSocket(10000);

        System.out.println("[서버 시작됨 ]");

        Thread thread = new Thread(() -> {
            try {
                while (true) {


                    Socket socket = serverSocket.accept();

                    SocketClient socketClient = new SocketClient(this, socket); // 접속한 클라이언트 객체를 생성

                }
            } catch (IOException e) {
            }
        });

        thread.start();

    }

    // 모든 클라이언트 한테 메세지 전송
    public void sendToALL(SocketClient sender, String message) {

        JSONObject root = new JSONObject();
        root.put("clientIp", sender.clientIp);
        root.put("chatName", sender.chatName);
        root.put("message", message);


        String jsonS = root.toString();

        Collection<SocketClient> socketClients = chatRoom.values();
        for (SocketClient sc : socketClients) {
            if (sc == sender) continue;
            ;
            sc.send(jsonS);
        }


    }

    public void addSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp; // 클라이언트 식별 키 생성 (이름@IP)
        chatRoom.put(key, socketClient); // 채팅방에 추가
        System.out.println("입장: " + key);
        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
    }

    public void removeSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp; // 클라이언트 식별 키 생성
        chatRoom.remove(key); // 채팅방에서 제거
        System.out.println("나감: " + key);
        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
    }
}
