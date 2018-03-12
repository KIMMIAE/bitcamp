<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>공연 정보</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>공연 등록</h1>

<form action="add" method='post' enctype="multipart/form-data">

<div class='form-group row'>
<label for='performance' class='col-sm-2 col-form-label'>공연정보</label>
<div class='col-sm-10'>
<input class='form-control' id='performance' type="number" name='performance.no'>
</div>
</div>

<div class='form-group row'>
<label for='reviewDescription' class='col-sm-2 col-form-label'>후기내용</label>
<div class='col-sm-10'>
<input class='form-control' id='reviewDescription' type='text' name='reviewDescription'>
</div>
</div>

<div class='form-group row'>
<label for='medias1' class='col-sm-2 col-form-label'>공연사진/영상</label>
<div class='col-sm-10'>
<input type="file" class="form-control-file" id="medias1" name="medias">
</div>
</div>

<div class='form-group row'>
<label for='medias2' class='col-sm-2 col-form-label'>공연사진/영상</label>
<div class='col-sm-10'>
<input type="file" class="form-control-file" id="medias2" name="medias">
</div>
</div>

<div class='form-group row'>
<label for='medias3' class='col-sm-2 col-form-label'>공연사진/영상</label>
<div class='col-sm-10'>
<input type="file" class="form-control-file" id="medias3" name="medias">
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
    