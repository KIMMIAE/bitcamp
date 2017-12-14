<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
        
</head>
<body>
<h1>스크립트릿(scriptlet element)</h1>
<h2>JSP 스크립 트릿</h2>
<%
int a = 10;
int b = 20;
out.println(a+b);
%>
<p>스크립트릿이 선언된 그 위치, 그 순서 그대로 자바 소스파일에 복사된다.



</body>
</html>