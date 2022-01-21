<%--
  Created by IntelliJ IDEA.
  User: dyobi
  Date: 1/14/22
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>사원 한명 보기</h1>
<hr>
<form action="updateTelinfo.do" method="post">
    <table border="2">
        <tr>
            <td>사번</td>
            <td><input type="text" name="id" value="${mTelinfo.id}"</td>
        </tr>
        <tr>
            <td>이름</td>
            <td>${mTelinfo.name}</td>
        </tr>
        <tr>
            <td>전화번호</td>
            <td><input type="text" name="tel" value="${mTelinfo.tel}"</td>
        </tr>
        <input type="hidden" name="name" value="${mTelinfo.name}">
        <tr>
            <td colspan="2"><input type="submit" value="가자 수정"></td>
        </tr>
    </table>
</form>
<table border="0">
    <tr>
        <td><a href="getAlltelinfo.do">[모두보기]</a></td>
        <td><a href="deleteTelinfo.do?name=${mTelinfo.name}">[삭제]</a></td>
    </tr>
</table>
</body>
</html>
