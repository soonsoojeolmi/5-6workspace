package com.multi.c_add.dto;

import java.lang.reflect.Member;

public class Run {
    public static void main(String[] args) {
        //DTO(Data Transfer Object)

        MemberDTO member = new MemberDTO();

        member.setNumber(1);
        member.setName("제니");
        member.setAge(1);
        member.setGender('F');
        member.setHeight(170.3);
        member.setWeight(55.5);
        member.setActivated(true);

        System.out.println(member);
    }
}
