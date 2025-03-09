package com.multi.b_basic.view;

import com.multi.b_basic.model.dao.MemberDAO;
import com.multi.b_basic.model.dto.MemberDTO;

import javax.swing.*;

public class MemberTest5 {
    public static void main(String[] args) {
        // 로그인 , id, pw
        String id = JOptionPane.showInputDialog("아이디 입력");
        String pw = JOptionPane.showInputDialog("패스워드 입력");

        MemberDAO dao = new MemberDAO();

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(id);
        memberDTO.setPw(pw);

        MemberDTO resultDTO = dao.login(memberDTO);

// 로그인 성공, 실패 출력
        if (resultDTO != null) {
            System.out.println("로그인 성공: " + resultDTO.getName() + "님 환영합니다.");
        } else {
            System.out.println("로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다.");
        }

    }
}
