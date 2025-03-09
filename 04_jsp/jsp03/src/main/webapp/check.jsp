<%--
  Created by IntelliJ IDEA.
  User: sunsu
  Date: 2025-03-06
  Time: 오후 1:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");

    String dbId = "root";
    String dbPw = "1234";

    String result = "로그인 실패";

    if(id.equals(dbId) && pw.equals(dbPw)){
        result = "로그인 성공";
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
