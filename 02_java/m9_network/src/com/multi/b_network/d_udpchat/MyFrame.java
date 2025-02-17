package com.multi.b_network.d_udpchat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MyFrame extends JFrame implements ActionListener {

    private DatagramSocket socket;
    private DatagramPacket packet;
    private JTextField textField;
    private JTextArea textArea;
    private InetAddress address;
    private int otherPort;

    public MyFrame(InetAddress address, int otherPort, DatagramSocket socket) {
        this.address = address;
        this.otherPort = otherPort;
        this.socket = socket;

        textField = new JTextField(30);
        textField.addActionListener(this);

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);// textArea 수정방지

        this.add(textField , BorderLayout.PAGE_END);
        this.add(textArea, BorderLayout.CENTER);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String str = textField.getText();

        byte[] buffer = str.getBytes();

        DatagramPacket sendpk =  new DatagramPacket(buffer, buffer.length, address, otherPort);

        try {
            socket.send(sendpk);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        textArea.append("SENT : "+str+"\n");
        textField.selectAll();
    }

    public void process(){
        while(true){
            byte[] buf = new byte[256];
            packet = new DatagramPacket(buf, buf.length);

            try {
                socket.receive(packet);
                textArea.append("REEIVE : "+new String(buf));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
