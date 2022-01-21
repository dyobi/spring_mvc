<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>사원 전체 명단</h1>
<table border="2">
    <thead>
    <tr>
        <th>번호</th>
        <th>이름</th>
        <th>전화</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="tmp" items="${arr}">
            <tr>
                <td>${tmp.id}</td>
                <td>${tmp.name}</td>
                <td>${tmp.tel}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
