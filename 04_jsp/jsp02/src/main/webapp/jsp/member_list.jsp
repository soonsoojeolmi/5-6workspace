<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.multi.jsp.member.MemberDTO"%>
<%@page import="com.multi.jsp.member.MemberDAO"%>
<%@page import="java.util.ArrayList"%>

<%

    MemberDAO dao = new MemberDAO();
    ArrayList<MemberDTO> result = dao.list();

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		background: lime;
	}
	*{
		font-size: 20px;
		text-align: center;
	}
	.left {

		width: 100px;
		background: blue;
		color: white;
	}
	.data {
		width: 100px;
		background: white;
		color: blue;
	}
	#bottom {
		background: red;
		color: yellow;
	}
	input{
		background: greenyellow;
	}
</style>
</head>
<body bgcolor="skyblue">
<!-- 반복문(for)문 필요! -->
<table border="1" align="center">
<tr>
	<td class="left">아이디</td>
	<td class="left">패스워드</td>
	<td class="left">이름</td>
	<td class="left">전화번호</td>
	<td>상세정보</td>
</tr>
<% //스크립트릿
	for(MemberDTO bag: result){ //{bag, bag, bag, ...}
%>
	<tr>
		<td class="data"><%= bag.getId() %></td>
		<td class="data"><%= bag.getPw() %></td>
		<td class="data"><%= bag.getName() %></td>
		<td class="data"><%= bag.getTel()%></td>
		<td>
			<a  href="member_one.jsp?id=<%= bag.getId() %>">
				<button style="background: gold">상세정보보기</button>
			</a>
		</td>
	</tr>
<% } //for %>
</table>
</body>
</html>