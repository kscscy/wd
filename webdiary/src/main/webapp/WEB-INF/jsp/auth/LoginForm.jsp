<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<body>
<h1>로그인</h1>
<a href='../user/add.do'>회원 등록</a><br>
<form action="login.do" method="post">
<div class="form-group">
  <label for="id">id:</label>
  <input type="text" class="form-control" name="id">
</div>
<div class="form-group">
  <label for="password">Password:</label>
  <input type="password" class="form-control" name="password">
</div>
<!-- <div class="form-group">
  <label for="id">id:</label>
  <input type="text" class="form-control" id="id">
</div>
<div class="form-group">
  <label for="password">Password:</label>
  <input type="password" class="form-control" id="password">
</div> -->
<%-- 아이디: <input type="text" name="id" value="${cookie.id.value}"><br>
암호: <input type="password" name="password"><br>--%>
<input type="submit" value="로그인"><br>
<input type="checkbox" name="saveId" 
 ${(empty cookie.id)?"":"checked"}>아이디 저장<br>
</form>
</body>
</html>