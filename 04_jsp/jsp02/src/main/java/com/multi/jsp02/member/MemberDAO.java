package com.multi.jsp02.member;


import com.multi.jsp02.common.DBConnectionMgr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	// DAO : db access object

	Connection con = null;
	//전역변수(글로벌 변수)
	DBConnectionMgr dbcp; //null

	public MemberDAO() {

		try {
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();//임대 
            System.out.println(con);

		} catch (Exception e) {
			System.out.println("에러발생!!");
		}
	}
	
	
	public ArrayList<com.multi.jsp02.member.MemberDTO> list() {
		ArrayList<com.multi.jsp02.member.MemberDTO> list = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from member";
			ps = con.prepareStatement(sql); //
			System.out.println("3. sql문 생성 성공!!");

			rs = ps.executeQuery();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			while(rs.next()) {

				com.multi.jsp02.member.MemberDTO bag = new com.multi.jsp02.member.MemberDTO();
				bag.setId(rs.getString("id"));
				bag.setPw(rs.getString("pw"));
				bag.setName(rs.getString("name"));
				bag.setTel(rs.getString("tel"));
				list.add(bag);
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}finally {
			dbcp.freeConnection(con, ps, rs);
		}

		return list;
	} // list

	public com.multi.jsp02.member.MemberDTO one(String id) {
//		int result = 0;
		com.multi.jsp02.member.MemberDTO bag = new com.multi.jsp02.member.MemberDTO();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from member where id = ? ";
			ps = con.prepareStatement(sql); //
			ps.setString(1, id);
			System.out.println("3. sql문 생성 성공!!");

			rs = ps.executeQuery();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			if (rs.next()) {
				String id2 = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
			} else {
				System.out.println("검색결과가 없음.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}finally {
			dbcp.freeConnection(con, ps, rs);//반납 
		}
		return bag;
	} // one

	public int delete(String id) {
		PreparedStatement ps = null;
		int result = 0;
		try {
			String sql = "delete from member where id = ? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. sql문 생성 성공!!");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			dbcp.freeConnection(con, ps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}finally {
			dbcp.freeConnection(con, ps);
		}
		return result;
	} // delete

	public int insert(com.multi.jsp02.member.MemberDTO memberDTO) {
		PreparedStatement ps = null;


		int result = 0;
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into member values (null,?, ?, ?, ? , now())";

			ps = con.prepareStatement(sql);
			ps.setString(1, memberDTO.getId());
			ps.setString(2, memberDTO.getPw());
			ps.setString(3, memberDTO.getName());
			ps.setString(4, memberDTO.getTel());
			System.out.println("3. sql문 생성 성공!!");


			result = ps.executeUpdate();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}finally {
			dbcp.freeConnection(con, ps);//반납 
		}
		return result;
	} // insert

	public int update(String id, String tel) {
		PreparedStatement ps = null;

		int result = 0;
		try {
			String sql = "update member set tel = ? where id = ? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);
			System.out.println("3. sql문 생성 성공!!");


			result = ps.executeUpdate();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생함.!!!!");
		}finally {
			dbcp.freeConnection(con, ps);
		}
		return result;
	}

}
