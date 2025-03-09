<%--
  Created by IntelliJ IDEA.
  User: sunsu
  Date: 2025-03-05
  Time: 오후 1:07
  To change this template use File | Settings | File Templates.
--%>

<%-- 1. 페이지 지시자 태그 directive page : 페이지 지시자 태그 (페이지에 대한 설정)
    errorPage = "errorPage.jsp"--%>
<!-- HTML 주석 : 개발자도구 탭에 노출됨(클라이언트에게 전달됨)-->
<%-- JSP 주석 : 개발자도구 탭에 노출안됨(클라이언트에게 전달안됨) --%>

<!--
JSP는 표면상으로는 HTML문서와 유사하다.
하지만 JSP 컨테이너가 최초 JSP를 요청할 시 JSP를 서블릿으로 변환시킨 후, 서블릿 컨테이너가 변환된 서블릿을 이용해 인스턴스를 생성하고 호출한다.
JSP는 매 요청 시 마다 기존 JSP파일이 변환되었는지를 확인하여 변경이 없는 경우 기존에 생성해둔 인스턴스를 사용하고,
변경이 있는 경우 translate 과정을 거쳐 인스턴스를 다시 생성한다.
jsp는 translate -> compile -> instance 생성 -> run 이 되는 순서이다.
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%---- 3. 선언 태그 <%! %> --%>
<!-- 서블릿으로 변환 시 선언 태그 내에 작성한 내용을필드로 선언해준다. -->
<%!
    private String name;
    private int age;
%>
<%-- 4. scriptlet 태그 <%  %> --%>

<%
    //간단한 자바 코드를 작성할 수 있는 부분이다.
    /* 스크립틀릿 태그 내애서의 주석은 자바 주석과 동일하다. */
    /* 선언 태그에서 작성한 내용을 초기화 하고 출력할 수 도 있으며, 간단한 로직 처리도 가능하다. */
    /* 여기서 작성하는 코드는 자바 코드이기 때문에 ;(세미콜론)을 작성하지 않으면 compile 과정에서 에러가 발생한다. */



    String id = request.getParameter("id");
    String pw = request.getParameter("pw");

    String dbId = "root";
    String dbPw = "1234";

    String result = "로그인 실패";

    if (id.equals(dbId) && pw.equals(dbPw)) {
        result = "로그인 성공";
    }
%>

<%-- 5. expression 태그: <%=  %>--%>

<!-- PrintWriter 를 이용하여 브라우저에 값을 내보내기하여 브라우져에서 보여지게 한다. -->
<!--
    자바 코드로 변환 시 out.print(); 괄호 안에 expression 태그 내애 작성한 내용이 들어가게 된다.
    정상적으로 출력하 값을 작성한느 경우 out.print(name); 이런식으로 되는데
     따라서 expression 태그 내에 세미콜론을 작성하게 되면 out.print(name;); 형태가 되기 때문에 compile 에러가 발생한다.
  -->
    <%= result%>
</body>

</html>
