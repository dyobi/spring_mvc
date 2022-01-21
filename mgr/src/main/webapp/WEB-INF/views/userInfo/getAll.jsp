<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="users" scope="request" type="java.util.List"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>사원관리</title>
</head>
<body>
<h1>사원 전체 보기</h1>
<table border="1">
    <tr>
        <td>사번</td>
        <td>이름</td>
        <td>전화번호</td>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td><a href="getOne.do?id=${user.id}&name=${user.name}&tel=${user.tel}">${user.name}</a></td>
            <td>${user.tel}</td>
        </tr>
    </c:forEach>
    <table border="0">
        <tr>
            <td><a href="insertUserPage.do">[입력]</a></td>
            <td><a href="getAll.do">[모두보기]</a></td>
        </tr>
    </table>
</table>
</body>
</html>
