<%--
  Created by IntelliJ IDEA.
  User: sunsu
  Date: 2025-03-07
  Time: 오전 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    저장된 세션값 <%session.getAttribute("view");%>
    <a href="session_get.jsp">세션 설정 보기</a>
</body>
</html>
