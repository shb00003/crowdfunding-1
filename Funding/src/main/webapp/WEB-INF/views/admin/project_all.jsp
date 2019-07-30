<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@  include file="../include/main_header.jsp" %>
<title>Insert title here</title>
</head>
<body>
<br>
<%@  include file="../include/menu.jsp" %>
<table><tr><td height="30px"></td></tr></table>

<table>
<c:forEach var="row" items="${mav}">
<c:if test="${row.pro_type_progress != '1'}">
<tr>
<td>${row.pro_idx}</td>
<td>${row.pro_name}</td>
<td>${row.pro_summary}</td>
<td>${row.pro_content}</td>
<td>${row.pro_type_progress}</td>
</tr>
</c:if>
</c:forEach>
</table>

</body>
</html>