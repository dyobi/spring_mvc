<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>사원관리</title>
</head>
<body>
<h1>로그인</h1>
<form action="authLogin.do" method="post">
    <table border="2">
        <tr>
            <td><input type="text" name="id" placeholder="아이디를 입력하시오"></td>
            <td rowspan="3"><input type="submit" value="로그인"></td>
        </tr>
        <tr>
            <td><input type="password" name="pwd" placeholder="비밀번호를 입력하시오"></td>
        </tr>
    </table>
</form>
<table border="0">
    <tr>
        <td><a href="authJoinPage.do">[회원가입]</a></td>
    </tr>
</table>
</body>
</html>
