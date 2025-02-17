package com.multi.b_network.d_udpchat;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        int myPort = Integer.parseInt(JOptionPane.showInputDialog("당신의 포트를 입력하세요."));
        int otherPort = Integer.parseInt(JOptionPane.showInputDialog("상대방의 포트를 입력하세요."));

        Messenger a = new Messenger(myPort, otherPort);

        MyFrame f =a.getMyframe();
    }
}
