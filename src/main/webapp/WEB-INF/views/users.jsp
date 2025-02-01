<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>사용자 목록</title>
</head>
<body>
    <h1>사용자 목록</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>이름</th>
            <th>이메일</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="/users/add">새 사용자 추가</a>
</body>
</html>
