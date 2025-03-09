package com.multi.a_conn;

public class DBCPUser {
    public static void main(String[] args) {
        DBCP dbcp = DBCP.getInstance();

        System.out.println(dbcp);

        DBCP dbcp2 = DBCP.getInstance();

        System.out.println(dbcp2);
    }
}
