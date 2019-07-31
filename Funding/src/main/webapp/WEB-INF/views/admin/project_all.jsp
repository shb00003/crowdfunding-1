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

<table align="center">
<td height="" valign="buttom">
 <select name="proList" id="proList">
 <option value="pro_name">프로젝트명</option>
 <option value="pro_idx">프로젝트 번호</option>
 <option value="maker_name">메이커명</option>
 <option value="maker_idx">메이커 번호</option>
 </select></td>
<td><input type="text" neme="pro_search" id="pro_search"></td>
<td>
<input type="button" name="pro_bnt1" value="조회">
</td>
</tr>
</table>

<table>
<tr>
<td>No</td>
<td >프로젝트명</td>
<td>메이커</td>
<td>프로젝트 시작일</td>
<td>상태</td>
<c:forEach var="row" items="${list}" varStatus="status">
<%-- <c:if test="${row.pro_type_progress != '1'}"> --%>
<tr>
<td>${row.pro_idx}</td>
<td>${row.pro_name}</td>
<td>${row.maker_name}</td>
<td>${row.pro_start}</td>
<td>${row.pro_type1}</td>
</tr>
<%-- </c:if> --%>
</c:forEach>
</table>

</body>
</html>