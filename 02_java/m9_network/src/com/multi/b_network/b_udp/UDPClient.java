package com.multi.b_network.b_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds  = new DatagramSocket();

        InetAddress ip = InetAddress.getByName("localhost");

        String  str = "2025 롯데 우승";

        byte[] data = str.getBytes();

        DatagramPacket dp = new DatagramPacket(data, data.length, ip, 9999);

        ds.send(dp);
        ds.close();
    }
}
