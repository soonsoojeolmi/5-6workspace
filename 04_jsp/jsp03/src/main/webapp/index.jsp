
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<h2 align="center">1.서블릿요청 테스트 </h2>


	<h4>1.get방식 </h4>
	<a href="hi">Hi 서블릿 </a> <br>
	<!-- a태그는 무조건 get요청, 단순한 요청  -->
	<a href="hi?q=안녕">Hi 서블릿 Get요청</a>
	<br><br>

	<!-- form태그는 get/post중 선택할 수 있음. -->

	<h4>2.get / post방식 </h4>
	<form action="hi" method="post"> <!-- 기본값은 get!  -->

		 id : <input name="id" value="apple"><br>
		 pw : <input name="pw" value="1234"><br>
		 <button>서버로 제출</button>
	</form>
	<br><br>


	<h2 align="center">2.라이프사이클 테스트</h2>
	<a href="xmllifecycle">라이프사이클 테스트(xml)</a>
	<br>
	<a href="annolifecycle">라이프사이클 테스트(annotation)</a>
	<br>
	<a href="hi2">Hi2 서블릿 initparam test xml 방식 </a> <br>
	<a href="hi2anno?tel=010&email=test@uni.com">Hi2 서블릿 어노테이션 test </a> <br>
	<br><br>

	<!-- 확인문제 anno jsp02_48ppt-->
    <a href="bye2?name=hong&message=goodbye">확인문제1 - anno </a>
    <br>
    <!-- 확인문제 web.xml <init-param>  jsp02_99ppt--->
    <a href="monday2.do">확인문제2 -  xml </a>
    <br>
    <a href="check.html">확인문제3 jsp02_63ppt</a>

    <br><br>


	<h2 align="center">3. forward  </h2>

	<form action="insert.do" method="post"> <!-- 기본값은 get!  -->
		 id : <input name="id" value="apple"><br>
		 pw : <input name="pw" value="1234"><br>
		 <button>서버로 제출</button>
	</form>


	<br><br>


	<h2 align="center"> 4. redirect  </h2>

	<a href="othercite">다른 웹 사이트로 redirect 테스트</a></li>
	<br><br>
	<form action="insert2.do" method="post"> <!-- 기본값은 get!  -->
		 id : <input name="id" value="apple"><br>
		 pw : <input name="pw" value="1234"><br>
		 <button>서버로 제출</button>
	</form>

   <br><br>
    <h2 align="center">5.회원가입 화면 jsp</h2>
  	<a href="member.html">회원가입화면연결</a>

  	<br><br>
	<h2 align="center">6.MVC1 -> MVC2 로 변경 연습 </h2>

	<!-- MVC1 , MVC2 로 변경 연습  -->
    <a href="member2.html">회원가입form -> servlet -> 결과 form 연습 </a>

</body>
</html>