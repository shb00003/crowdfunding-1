<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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

<table align="center">
<td height="" valign="buttom">
 <select name="mem0" id="mem0">
 <option value="mem_name">회원이름</option>
 <option value="mem_idx">회원번호</option>
 </select></td>
<td><input type="text" neme="mem_search" id="mem_search"></td>
<td>
<input type="button" name="mem" value="조회">
</td>
</tr>
</table>

<table align="center" border="1" >
<tr>
<td>이름</td>
<td>이메일</td>
<td>연락처</td>
<td>생년월일</td>
<td>성별</td>
</tr>
<c:forEach var="row" items="${member}">
<tr>
<td>${row.mem_name}</td>
<td>${row.mem_email}</td>
<td>${row.mem_phone}</td>
<td>${row.mem_birth}</td>
<td>${row.mem_sex}</td>
</tr>
</c:forEach>
</table>
</body>
</html>