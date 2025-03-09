<%@ page import="com.multi.jsp02.member.MemberDTO" %>
<%@ page import="com.multi.jsp02.member.MemberDAO" %><%--
  Created by IntelliJ IDEA.
  User: sunsu
  Date: 2025-03-05
  Time: 오후 1:26
  To change this template use File | Settings | File Templates.
--%>

<!--
jsp에서 해야하는 작업 3가지
1) form안에 입력한 데이터 받아서 저장해두자. ==> java
2) 받은 데이터를 DAO에게 주자.  ==> java
3) 결과를 html로 만들자. ==> html
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String id = request.getParameter("id");//input 태그의 name
        String pw = request.getParameter("pw");
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");

        MemberDAO dao = new MemberDAO();
        MemberDTO dto = new MemberDTO();

        dto.setId(id);
        dto.setPw(pw);
        dto.setName(name);
        dto.setTel(tel);
        int result =dao.insert(dto);

        String resultText = "회원가입실패";

        if(result ==1){
            resultText = "회원가입성공";
        }

    %>

<%= resultText%>
</body>
</html>
