package com.multi.b_basic.model.dao;

import com.multi.b_basic.model.dto.MemberDTO;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
    public int insert(String id, String pw, String name, String tel) {
        int result = 0;
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

            con.setAutoCommit(false);
            System.out.println("오토커밋 비활성화");


            String sql = "insert into MEMBER values(null, ?,?,?,?,now())";

            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pw);
            ps.setString(3, name);
            ps.setString(4, tel);

            result = ps.executeUpdate();

            if (result > 0) {
                con.commit();
            } else {
                con.rollback();
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return result;
    }

    public int delete(String id) {
        int result = 0;
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

            con.setAutoCommit(false);
            System.out.println("오토커밋 비활성화");

            String sql = "delete  from  MEMBER where id = ?";

            ps = con.prepareStatement(sql);
            ps.setString(1, id);

            result = ps.executeUpdate();

            if (result > 0) {
                con.commit();
            } else {
                con.rollback();
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return result;
    }

    public int insert(MemberDTO memberDTO) {
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("드라이버로드성공");

            String user = "scott";
            String password = "tiger";
            String url = "jdbc:mysql://localhost:3306/scott?";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("db 연결성공");

            con.setAutoCommit(false);
            System.out.println("오토커밋 비활성화");

            String sql = "insert into MEMBER values (null, ?, ?, ?, ?,  now())";

            ps = con.prepareStatement(sql);
            ps.setString(1, memberDTO.getId());
            ps.setString(2, memberDTO.getPw());
            ps.setString(3, memberDTO.getName());
            ps.setString(4, memberDTO.getTel());

            result = ps.executeUpdate();

            if (result > 0) {
                con.commit();
            } else {
                con.rollback();
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return result;
    }

    public MemberDTO selectOne(String id) {
        MemberDTO memberDTO = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("드라이버로드성공");

            String user = "scott";
            String password = "tiger";
            String url = "jdbc:mysql://localhost:3306/scott?";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("db 연결성공");

            con.setAutoCommit(false);
            System.out.println("오토커밋 비활성화");

            String sql = "select * from member where id = ?";

            ps = con.prepareStatement(sql);
            ps.setString(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("검색결과 있음");
                String id2 = rs.getString("id");
                String pw = rs.getString("pw");
                String name = rs.getString(4);
                String tel = rs.getString("tel");

                memberDTO = new MemberDTO();
                memberDTO.setId(id2);
                memberDTO.setPw(pw);
                memberDTO.setName(name);
                memberDTO.setTel(tel);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return memberDTO; // 반환 값 수정 (result → memberDTO)
    }

    public MemberDTO login(MemberDTO memberDTO) {
        MemberDTO memberDTO2 = null; // null로 초기화
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버로드성공");

            String user = "scott";
            String password = "tiger";
            String url = "jdbc:mysql://localhost:3306/scott?";

            con = DriverManager.getConnection(url, user, password);
            System.out.println("db 연결성공");

            con.setAutoCommit(false);
            System.out.println("오토커밋 비활성화");

            String sql = "SELECT * FROM member WHERE id = ? AND pw = ?"; // 비밀번호 확인 추가

            ps = con.prepareStatement(sql);
            ps.setString(1, memberDTO.getId());  // id 사용
            ps.setString(2, memberDTO.getPw());  // pw 사용

            rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("검색결과 있음");
                String id2 = rs.getString("id");
                String pw = rs.getString("pw");
                String name = rs.getString("name");
                String tel = rs.getString("tel");

                memberDTO2 = new MemberDTO();
                memberDTO2.setId(id2);
                memberDTO2.setPw(pw);
                memberDTO2.setName(name);
                memberDTO2.setTel(tel);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (rs != null) rs.close(); // ResultSet 닫기 추가
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return memberDTO2; // 로그인 성공 시 객체 반환, 실패 시 null 반환
    }

    public int update(MemberDTO memberDTO) {
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로드 성공");

            String user = "scott";
            String password = "tiger";
            String url = "jdbc:mysql://localhost:3306/scott?";

            con = DriverManager.getConnection(url, user, password);
            System.out.println("db 연결 성공");

            con.setAutoCommit(false);
            System.out.println("오토커밋 비활성화");

            String sql = "update MEMBER set tel = ? where id = ?";

            ps = con.prepareStatement(sql);
            ps.setString(1, memberDTO.getTel());
            ps.setString(2, memberDTO.getId());

            result = ps.executeUpdate();

            if (result > 0) {
                con.commit();
            } else {
                con.rollback();
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return result;  // 반환값을 int로 수정
    }

    public ArrayList<MemberDTO> selectAll() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<MemberDTO> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버로드성공");

            String user = "scott";
            String password = "tiger";
            String url = "jdbc:mysql://localhost:3306/scott?";

            con = DriverManager.getConnection(url, user, password);
            System.out.println("db 연결성공");

            con.setAutoCommit(false);
            System.out.println("오토커밋 비활성화");

            String sql = "select * from member";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("검색결과 있음");
                String id2 = rs.getString("id");
                String pw = rs.getString("pw");
                String name = rs.getString("name");
                String tel = rs.getString("tel");

                MemberDTO memberDTO = new MemberDTO();
                memberDTO.setId(id2);
                memberDTO.setPw(pw);
                memberDTO.setName(name);
                memberDTO.setTel(tel);

                list.add(memberDTO);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }
}