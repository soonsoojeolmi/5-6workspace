package com.multi.b_network.d_udpchat;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Messenger {

    private MyFrame myFrame; // 변수명 수정
    private DatagramSocket socket;
    private InetAddress address;
    private final int myPort;
    private final int otherPort;

    public Messenger(int myPort, int otherPort) {
        this.myPort = myPort;
        this.otherPort = otherPort;

        try {
            address = InetAddress.getByName("localhost");
            socket = new DatagramSocket(myPort);

            // 변수명 수정
            myFrame = new MyFrame(address, otherPort, socket);

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    // 올바른 Getter 메서드명 수정
    public MyFrame getMyFrame() {
        return myFrame;
    }

    public MyFrame getMyframe() {
        return  myFrame;
    }
}
