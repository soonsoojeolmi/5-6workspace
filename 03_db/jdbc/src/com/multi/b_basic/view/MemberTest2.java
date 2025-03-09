package com.multi.b_basic.view;

import com.multi.b_basic.model.dao.MemberDAO;

import javax.swing.*;

public class MemberTest2 {
    public static void main(String[] args) {

        String id = JOptionPane.showInputDialog("아이디 입력");

        MemberDAO dao = new MemberDAO();

        int result = dao.delete(id);
        System.out.println(result);
    }
}
