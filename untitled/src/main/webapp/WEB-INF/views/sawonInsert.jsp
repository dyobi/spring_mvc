<%--
  Created by IntelliJ IDEA.
  User: dyobi
  Date: 1/14/22
  Time: 5:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="insertTelinfo.do" method="post">
        <table border="2">
            <tr>
                <td>사번</td><td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>이름</td><td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>전화번호</td><td><input type="text" name="tel"></td>
            </tr>
            <tr><td colspan="2"><input type="submit" value="추가"></td></tr>
        </table>
        <table border="0">
            <tr><td><a href="getAllTelinfo.do>">[모두보기]</a></td></tr>
        </table>
    </form>
</body>
</html>
