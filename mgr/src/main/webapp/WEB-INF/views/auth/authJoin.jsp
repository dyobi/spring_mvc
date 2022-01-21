<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>사원관리</title>
</head>
<body>
<h1>회원 가입</h1>
<form action="authJoin.do" method="post">
    <table border="1">
        <tr>
            <td>아이디</td>
            <td><input type="text" name="id" required></td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type="password" name="pwd" required></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="회원가입">
                <a href="authLoginPage.do">[로그인창으로]</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>

