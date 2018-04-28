<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 28.04.2018
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--Library for working with table--%>
<html>
<head>
    <title>My Spring app</title>
</head>
<body>
<h1 align="center"><b> All Books</b></h1>
<table align="center" border="2">
    <tr>
        <th> ID </th>
        <th> TITLE </th>
        <th> AUTHOR </th>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
