<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>사원관리</title>
</head>
<body>
<h1>사원 추가 하기</h1>
<hr>
<form action="insertUser.do" method="post">
  <table border="2">
    <tr>
      <td>사번</td>
      <td><input type="text" name="id" required></td>
    </tr>
    <tr>
      <td>이름</td>
      <td><input type="text" name="name" required></td>
    </tr>
    <tr>
      <td>전화번호</td>
      <td><input type="text" name="tel" required></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="추가하기">
        <input type="reset" value="리셋하기">
      </td>
    </tr>
  </table>
</form>
<table border="0">
  <tr>
    <td><a href="getAll.do">[모두보기]</a></td>
  </tr>
</table>
</body>
</html>