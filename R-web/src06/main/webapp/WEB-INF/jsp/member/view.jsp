<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

<h1>회원 상세 정보</h1>
<c:if test="${not empty member}">
        <form action='update' method='post'>
        <div class='form-group row'>
        <label for='no' class='col-sm-2 col-form-label'>번호</label>
        <div class='col-sm-10'>
        <input class='form-control' readonly id='no' type='number' 
                name='no' value='${member.no}'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='nickname' class='col-sm-2 col-form-label'>닉네임</label>
        <div class='col-sm-10'>
        <input class='form-control' id='nickname' type='text' 
                name='nickname' value='${member.nickname}'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='email' class='col-sm-2 col-form-label'>이메일</label>
        <div class='col-sm-10'>
        <input class='form-control' id='email' type='text' 
                name='email' value='${member.email}'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='password' class='col-sm-2 col-form-label'>암호</label>
        <div class='col-sm-10'>
        <input class='form-control' id='password' type='password' name='password'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='type' class='col-sm-2 col-form-label'>회원유형</label>
        <div class='col-sm-10'>
        <input class='form-control' id='type' type='text' 
                name='type' value='${member.type}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='artistName' class='col-sm-2 col-form-label'>아티스트명/팀명</label>
        <div class='col-sm-10'>
        <input class='form-control' id='artistName' type='text' 
                name='artistName' value='${member.artist.artistName}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='artistMember' class='col-sm-2 col-form-label'>구성원</label>
        <div class='col-sm-10'>
        <input class='form-control' id='artistMember' type='text' 
                name='artistMember' value='${member.artist.artistMember}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='profile' class='col-sm-2 col-form-label'>프로필</label>
        <div class='col-sm-10'>
        <input class='form-control' id='profile' type='text' 
                name='profile' value='${member.artist.profile}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='joinDate' class='col-sm-2 col-form-label'>팀결성일</label>
        <div class='col-sm-10'>
        <input class='form-control' id='joinDate' type='text' 
                name='joinDate' value='${member.artist.joinDate}'>
        </div>
        </div>
        
        
        <div class='form-group row'>
        <label for='messageFlag' class='col-sm-2 col-form-label'>메시지수신</label>
        <div class='col-sm-10'>
        <input class='form-control' id='messageFlag' type='text' 
                name='messageFlag' value='${member.messageFlag}'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='messageId' class='col-sm-2 col-form-label'>메시지수신 아이디</label>
        <div class='col-sm-10'>
        <input class='form-control' id='messageId' type='text' 
                name='messageId' value='${member.messageId}'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='cancleFlag' class='col-sm-2 col-form-label'>해지 여부</label>
        <div class='col-sm-10'>
        <input class='form-control' id='cancleFlag' type='text' 
                name='cancleFlag' value='${member.cancleFlag}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='regdate' class='col-sm-2 col-form-label'>등록일</label>
        <div class='col-sm-10'>
        <input class='form-control' readonly id='regdate' type='date' 
                value='${member.regDate}'>
        </div>
        </div>
        <div class='form-group row'>
        <div class='col-sm-10'>
        <button class='btn btn-primary btn-sm'>변경</button>
        <a href='delete?no=${member.no}' class='btn btn-danger btn-sm'>삭제</a>
        </div>
        </div>
        </form>
</c:if>
<c:if test="${empty member}">
        <p>'${param.no}'번 회원 정보가 없습니다.</p>
</c:if>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
    