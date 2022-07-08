<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>MyBatis List</title>
</head>
<body>
<table>
    <tr>
        <c:forEach var="view" items="${ viewAll }">
            <td>
                <b>${ view.cnt }</b>
                <b>${ view.content }</b>
                <b>${ view.regDate }</b>
                <b>${ view.seq }</b>
                <b>${ view.title }</b>
                <b>${ view.writer }</b>
            </td>
        </c:forEach>
    </tr>
</table>
</body>
</html>
