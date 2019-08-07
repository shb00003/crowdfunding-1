<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@  include file="../include/main_header.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<br>
	
	<%@  include file="../include/admin_menu.jsp"%>
	<table>
		<tr>
			<td height="30px"></td>
		</tr>
	</table>

	<table>
		<tr>
			<td>관리자 아이디</td>
			<td>관리자 이름</td>
			<td>관리자 이메일</td>
			<td>관리자 권한</td>
		<tr>
			<c:forEach var="mana" items="${list}">
				<td>${mana.admin_id}</td>
				<td>${mana.admin_name}</td>
				<td>${mana.admin_email}</td>
				<td><c:choose>
						<c:when test="${mana.admin_type=='1'}">최고관리자</c:when>
						<c:when test="${mana.admin_type=='2'}">관리자</c:when>
					</c:choose></td>
			</c:forEach>
			
		</tr>
	</table>
</body>
</html>