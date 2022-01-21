<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, com.Employee.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% List<EmployeeVo> list = EmployeeDao.employeeAllData(); %>
<c:set var="list" value="<%=list%>"/>
<html>
<head>
    <meta charset="UTF-8">
    <title>전체출력</title>
</head>
<body>
    <table border="2">
        <tr>
            <th>사번</th><th>이름</th><th>전화번호</th>
        </tr>
        <c:forEach var="vo" items="${list}">
            <tr>
                <td>${vo.id}</td>
                <td>${vo.name}</td>
                <td>${vo.tel}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
