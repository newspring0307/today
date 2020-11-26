<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>boardList.jsp</title>
</head>
<body>
<center>
<p style="width:500px; border:1px solid #000">
<table>
<thead>
	<th>글번호</th>
	<th>제목</th>
	<th>작성자</th>
	<th>작성일</th>
</thead>
<c:forEach var="e" items="${boardList}">
<tbody>
<tr>
	<td>${e.no}</td>
	<td><a href=?${e.subject}/>${e.subject}</td>
	<td>${e.writer}</td>
	<td><fmt:formatDate value="${e.regdate}" pattern="yyyy-MM-dd"/></<td>
</tr>
</tbody>
</p>
</c:forEach>
</table>
<a href="boardInsert">작성하러 가기</a>
</center>
</body>
</html>