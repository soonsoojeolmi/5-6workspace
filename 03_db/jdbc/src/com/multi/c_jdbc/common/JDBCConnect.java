package com.multi.c_jdbc.common;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCConnect {
    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            if ((conn == null) || conn.isClosed()) {

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}