<%@page import="java100.app.domain.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>회원 목록</h1>

<jsp:include page="../listToolbar.jsp"/>

<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>닉네임</th><th>이메일</th><th>메시지 수신</th><th>해지여부</th><th>등록일</th>
</tr>
</thead>
<tbody>

<c:forEach items="${list}" var="member">

        <tr>
        <td>${member.no}</td>
        <td><a href='${member.no}'>${member.nickname}</a></td>
        <td>${member.email}</td>
        <td>${member.messageFlag}</td>
        <td>${member.cancleFlag}</td>
        <td>${member.regDate}</td>
        </tr>
</c:forEach>

</tbody>
</table>

<jsp:include page="../paging.jsp"/>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
    
