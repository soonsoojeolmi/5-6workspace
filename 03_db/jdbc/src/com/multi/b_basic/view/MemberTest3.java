package com.multi.b_basic.view;

import com.multi.b_basic.model.dao.MemberDAO;
import com.multi.b_basic.model.dto.MemberDTO;

import javax.swing.*;

public class MemberTest3 {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("아이디 입력");
        String pw = JOptionPane.showInputDialog("패스워드 입력");
        String name = JOptionPane.showInputDialog("이름 입력");
        String tel = JOptionPane.showInputDialog("전화번호 입력");

        MemberDAO dao = new MemberDAO();

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(id);
        memberDTO.setPw(pw);
        memberDTO.setName(name);
        memberDTO.setTel(tel);

        int result =  dao.insert(memberDTO);

        System.out.println(result);
    }
}
