
package com.multi.jsp02.common;

import java.sql.*;

public class DBConnectionMgr {
    private static DBConnectionMgr instance;
    private String jdbcDriver;
    private String jdbcUrl;
    private String dbUser;
    private String dbPassword;

    private DBConnectionMgr() {
        // MySQL 설정 (기본)
        this.jdbcDriver = "com.mysql.cj.jdbc.Driver"; // MySQL JDBC 드라이버
        this.jdbcUrl = "jdbc:mysql://localhost:3306/scott"; // MySQL URL
        this.dbUser = "scott"; // MySQL 사용자 이름
        this.dbPassword = "tiger"; // MySQL 비밀번호

        // Oracle 설정 (필요시 주석 해제)
        // this.jdbcDriver = "oracle.jdbc.driver.OracleDriver"; // Oracle JDBC 드라이버
        // this.jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe"; // Oracle URL
        // this.dbUser = "username"; // Oracle 사용자 이름
        // this.dbPassword = "password"; // Oracle 비밀번호

        try {
            Class.forName(jdbcDriver); // 드라이버 로드
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static DBConnectionMgr getInstance() {
        if (instance == null) {
            synchronized (DBConnectionMgr.class) {
                if (instance == null) {
                    instance = new DBConnectionMgr();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
    }


    // 데이터베이스 연결 해제 메소드
    public void freeConnection(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Statement와 Connection을 해제하는 메소드
    public void freeConnection( Connection con, Statement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
            freeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ResultSet, Statement, Connection을 모두 해제하는 메소드
    public void freeConnection( Connection con , Statement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            freeConnection( con, stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
