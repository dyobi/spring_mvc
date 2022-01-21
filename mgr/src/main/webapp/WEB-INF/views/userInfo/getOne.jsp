<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="user" scope="request" type="com.mgr.dto.User"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>사원관리</title>
</head>
<body>
<h1>사원 한명 보기</h1>
<hr>
<form action="updateUser.do" method="post">
    <table border="2">
        <tr>
            <td>사번</td>
            <td><input type="text" name="id" value="${user.id}"></td>
        </tr>
        <tr>
            <td>이름</td>
            <td>${user.name}</td>
            <input type="hidden" name="name" value="${user.name}">
        </tr>
        <tr>
            <td>전화번호</td>
            <td><input type="text" name="tel" value="${user.tel}"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="수정하기"></td>
        </tr>
    </table>
</form>
<table border="0">
    <tr>
        <td><a href="getAll.do">[모두보기]</a></td>
        <td><a href="deleteUser.do?name=${user.name}">[삭제]</a></td>
    </tr>
</table>
</body>
</html>