<%--
  Created by IntelliJ IDEA.
  User: sunsu
  Date: 2025-03-07
  Time: 오전 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int view = (int) session.getAttribute("view");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    저장된 세션값 <%=view%>
    <a href="count.jsp">조회 수 증가</a>
</body>
</html>
