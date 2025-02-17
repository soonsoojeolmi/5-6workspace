package com.multi.b_network.b_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket ds;

        {
            try {
                ds = new DatagramSocket(9999);

                byte[] data = new byte[256];

                DatagramPacket packet = new DatagramPacket(data, data.length);

                ds.receive(packet);

                System.out.println(new String(data));

                ds.close();
            } catch (SocketException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
