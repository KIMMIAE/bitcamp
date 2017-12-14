<%@page import="java.util.List"%>
<%@page import="java100.app.domain.Score"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<%
ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(
        ScoreDao.class);
%>

<!DOCTYPE html>
<html>
<head>
<title>성적관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<%
out.flush();

RequestDispatcher rd = request.getRequestDispatcher("/header");
rd.include(request, response);
%>

<header>
<nav class='navbar navbar-expand-lg navbar-light bg-light'>
<a class='navbar-brand' href='../index.html'>
  <img src='../images/bootstrap-solid.svg' width='30' height='30' class='d-inline-block align-top' alt=''>
  비트캠프
</a>
<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarNav' aria-controls='navbarNav' aria-expanded='false' aria-label='Toggle navigation'>
<span class='navbar-toggler-icon'></span>
</button>
<div class='collapse navbar-collapse' id='navbarNav'>
<ul class='navbar-nav'>
<li class='nav-item'>
<a class='nav-link' href='../score/list'>성적관리</a>
</li>
<li class='nav-item'>
<a class='nav-link' href='../member/list'>회원</a>
</li>
<li class='nav-item'>
<a class='nav-link' href='../board/list'>게시판</a>
</li>
<li class='nav-item'>
<a class='nav-link' href='../room/list'>강의실</a>
</li>
</ul>
</div>
</nav>
</header>
<h1>성적 목록</h1>
<%

try {
    List<Score> list = scoreDao.selectList();
    
    for (Score score : list) {
        out.printf("<tr><td>%d</td><td>"
                + "<a href='view?no=%d'>%s</a>"
                + "</td><td>%d</td><td>%3.1f</td></tr>\n",
                score.getNo(),
                score.getNo(),
                score.getName(), 
                score.getSum(), 
                score.getAver());
    }
    
} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user
}


%>

<p><a href='form.jsp' class='btn btn-primary btn-sm'>추가</a></p>
<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>이름</th><th>합계</th><th>평균</th>
</tr>
</thead>
<tbody>
<tr><td>4</td><td><a href='view?no=4'>졸려</a></td><td>300</td><td>100.0</td></tr>
<tr><td>5</td><td><a href='view?no=5'>눈아파</a></td><td>280</td><td>93.3</td></tr>
<tr><td>12</td><td><a href='view?no=12'>으앙</a></td><td>280</td><td>93.3</td></tr>
<tr><td>15</td><td><a href='view?no=15'>뀨</a></td><td>210</td><td>70.0</td></tr>
<tr><td>16</td><td><a href='view?no=16'>욤욤</a></td><td>250</td><td>83.3</td></tr>
<tr><td>18</td><td><a href='view?no=18'>끄으으으앙</a></td><td>320</td><td>106.7</td></tr>
<tr><td>19</td><td><a href='view?no=19'>지울거33</a></td><td>300</td><td>100.0</td></tr>
</tbody>
</table>
<%
        rd = request.getRequestDispatcher("/footer");
        rd.include(request, response);
%>

<footer>
    비트캠프 자바100기@2017
</footer>
</div>
<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>
<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>
<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>
</body>
</html>
