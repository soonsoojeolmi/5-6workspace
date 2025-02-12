package com.multi.f_app4;

public class Run {
    public static void main(String[] args) {
        com.multi.f_app4.Person p = new com.multi.f_app4.Person();
        com.multi.f_app4.Person e = new com.multi.f_app4.Employee();
        com.multi.f_app4.Person m = new com.multi.f_app4.Manager();
        com.multi.f_app4.Person d = new com.multi.f_app4.Director();

        p.work();
        e.work();
        m.work();
        d.work();
    }
}
