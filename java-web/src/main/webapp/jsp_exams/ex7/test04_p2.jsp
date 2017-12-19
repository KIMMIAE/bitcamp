<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>
<p>안녕하세요, <%=session.getAttribute("name")%>님!</p>

그러나 같은 브라우저를 여러 개 띄우고 웹서버에 접속한다면,<br>
같은 클라이언트로 인식하여 세션한 한 개만 생성된다.<br>
 
<%
session.setAttribute("name", "홍길동");
%>
<hr>
<p>
<jsp:include page="test04_p2.jsp"></jsp:include>
</p>
<hr>
<%=session.getAttribute("name")%>

</body>
</html>



