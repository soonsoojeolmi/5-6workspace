package com.multi.a_constructor;

import com.multi.b_static.NonStaticMethod;

public class Run {
    public static void main(String[] args) {
        Account acc = new Account();

        Account acc1 = new Account("제니");

        System.out.println(acc1);

        Account acc2 = new Account("제니", "예금", 100000);
        System.out.println(acc2);

        //MemberDTO m1 = new MemberDTO(1, "제니", 10);
        //System.out.println(m1);

        NonStaticMethod ns= new NonStaticMethod();
       // ns.updateMember(m1);
        //System.out.println(m1);
    }
}
