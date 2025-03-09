package com.multi.b_basic.view;

import com.multi.b_basic.model.dao.MemberDAO;
import com.multi.b_basic.model.dto.MemberDTO;

import java.util.ArrayList;

public class MemberTest7 {
    public static void main(String[] args) {
        MemberDAO dao = new MemberDAO();
        ArrayList<MemberDTO> list = dao.selectAll();

        for(MemberDTO memberDTO:list){
            System.out.println(memberDTO);
        }
    }
}
