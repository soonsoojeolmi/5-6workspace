package com.multi.b_network.c_chattcp;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClient {

    ChatServer chatServer;
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    String clientIp;
    String chatName;

    public SocketClient(ChatServer chatServer, Socket socket) {


        try {
            this.chatServer = chatServer;
            this.socket = socket;
            this.dis = new DataInputStream(socket.getInputStream());
            this.dos = new DataOutputStream(socket.getOutputStream());

            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            this.clientIp = isa.getHostName();

            receive();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void receive() {
        chatServer.threadPool.execute(() -> {
            try {
                while (true) {

                    String rjson = dis.readUTF();

                    JSONObject jsonObject = new JSONObject(rjson);

                    String command = jsonObject.getString("command");

                    switch (command) {

                        case "incoming":
                            this.chatName = jsonObject.getString("data");
                            chatServer.sendToALL(this, "들어오셨습니다");
                            chatServer.addSocketClient(this);
                            break;
                        case "message":
                            String message = jsonObject.getString("data");
                            chatServer.sendToALL(this, message);
                            break;


                    }


                }


            } catch (IOException e) {
                chatServer.sendToALL(this, "나가셨습니다.");
                chatServer.removeSocketClient(this);
            }


        });
    }

    public void send(String jsonS) {
        try {
            dos.writeUTF(jsonS);
            dos.flush();

        } catch (IOException e) {
        }
    }

    public void close() {
        try {
            socket.close();
        } catch (IOException e) {
        }
    }
}
