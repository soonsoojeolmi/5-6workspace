package com.multi.a_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* 1.Connection 객체연결하기
 * 2.Statement 객체 생성하기
 * 3.ResultSet 객체 생성하기
 * 4.Sql작성하기
 * 5.ResultSet  결과담기
 * 6.list 에 객체 하나씩 담기
 * 7.close 하기 (자원반납 - 생성의 역순)
 */
public class DBConnectMysql {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("드라이버로드성공");

            String user = "scott";
            String password = "tiger";
            String url = "jdbc:mysql://localhost:3306/scott?";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("db 연결성공");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
