package com.multi.b_basic.view;

import com.multi.b_basic.model.dao.MemberDAO;

import javax.swing.*;

public class MemberTest1 {
    public static void main(String[] args) {

        String id = JOptionPane.showInputDialog("아이디 입력");
        String pw = JOptionPane.showInputDialog("패스워드 입력");
        String name = JOptionPane.showInputDialog("이름 입력");
        String tel = JOptionPane.showInputDialog("전화번호 입력");

        MemberDAO dao = new MemberDAO();

        int result = dao.insert(id, pw, name, tel);
        System.out.println(result);
    }
}