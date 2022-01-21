<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="mAllTelinfo" scope="request" type="java.util.List"/>

<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
  <h1>사원 전체 보기</h1>
  <table border="1">
    <tr>
      <td>사번</td>
      <td>이름</td>
      <td>전화번호</td>
    </tr>
    <c:forEach var="alltelinfo" items="${mAllTelinfo}">
      <tr>
        <td>${alltelinfo.id}</td>
        <td><a href="getTelinfo.do?name=${alltelinfo}">${alltelinfo.name}</a></td>
        <td>${alltelinfo.tel}</td>
      </tr>
    </c:forEach>
    <table border="0">
      <tr>
        <td><a href="sawonInsertTelinfo.jsp">[입력]</a> </td>
        <td><a href="getAllTelinfo.do">[모두보기]</a></td>
      </tr>
    </table>
  </table>
</body>
</html>
