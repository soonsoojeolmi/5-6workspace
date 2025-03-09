package com.multi.b_basic.view;

import com.multi.b_basic.model.dao.MemberDAO;
import com.multi.b_basic.model.dto.MemberDTO;

import javax.swing.*;

public class MemberTest4 {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("아이디  입력");

        MemberDAO dao = new MemberDAO();

        MemberDTO memberDTO = dao.selectOne(id);

        System.out.println(memberDTO);
    }
}
