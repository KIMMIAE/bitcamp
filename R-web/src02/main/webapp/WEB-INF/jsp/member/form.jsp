<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
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

<h1>회원 가입</h1>
<form action="add" method='post'>
<div class='form-group row'>
<label for='nickname' class='col-sm-2 col-form-label'>닉네임</label>
<div class='col-sm-10'>
<input class='form-control' id='nickname' type='text' name='nickname'>
</div>
</div>
<div class='form-group row'>
<label for='email' class='col-sm-2 col-form-label'>이메일</label>
<div class='col-sm-10'>
<input class='form-control' id='email' type='email' name='email'>
</div>
</div>
<div class='form-group row'>
<label for='password' class='col-sm-2 col-form-label'>암호</label>
<div class='col-sm-10'>
<input class='form-control' id='password' type='password' name='password'>
</div>
</div>

<div class='form-group row'>
<label for='password' class='col-sm-2 col-form-label'>회원유형</label>
<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="type1" name="type" class="custom-control-input" value="관리자">
  <label class="custom-control-label" for="type1">관리자</label>
</div>
<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="type2" name="type" class="custom-control-input" value="일반회원">
  <label class="custom-control-label" for="type2">일반회원</label>
</div>
<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="type3" name="type" class="custom-control-input" value="아티스트">
  <label class="custom-control-label" for="type3">아티스트</label>
</div>
</div>

<div class='form-group row'>
<label for='password' class='col-sm-2 col-form-label'>메시지수신</label>
<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="messageFlag1" name="messageFlag" class="custom-control-input" value="0">
  <label class="custom-control-label" for="messageFlag1">동의</label>
</div>
<div class="custom-control custom-radio custom-control-inline">
  <input type="radio" id="messageFlag2" name="messageFlag" class="custom-control-input" value="1">
  <label class="custom-control-label" for="messageFlag2">거부</label>
</div>
</div>
<div class='form-group row'>
<label for='messageId' class='col-sm-2 col-form-label'>메시지수신 아이디</label>
<div class='col-sm-10'>
<input class='form-control' id='messageId' type='text' name='messageId'>
</div>
</div>

<div class='form-group row'>
<label for='password' class='col-sm-2 col-form-label'>해지여부</label>
<div class="custom-control custom-radio">
  <input type="radio" id="cancleFlag" name="cancleFlag" class="custom-control-input" value="1" checked="checked">
  <label class="custom-control-label" for="cancleFlag">선택</label>
</div>
</div>


<div class='form-group row'>
<label for='photo' class='col-sm-2 col-form-label'>사진</label>
<div class='col-sm-10'>
<input type="file" class="form-control-file" id="photo" name="photo">
</div>
</div>

<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>등록</button>
</div>
</div>
</form>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>