package com.multi.c_add;

public class Run3 {
    public static void main(String[] args) {
        Employee member1 = new Employee("m01", "p01345", "제니",10, 10000, 'F',  "m1@test.com");

        System.out.println(member1);

        Employee member2 = new Employee("m02", "p0245678", "닝닝",10, 20000, 'F',  "m2@test.com");

        System.out.println(member2);

        Employee member3 = new Employee("m03", "p03456789", "당언",10, 30000, 'F',  "m3@test.com");

        System.out.println(member3);

        System.out.println(Employee.getTotalMembers());

        System.out.println(Employee.getAvgSalary());

        member3.setSalary(40000);

        System.out.println(Employee.getTotalMembers());

        System.out.println(Employee.getAvgSalary());
    }
}
