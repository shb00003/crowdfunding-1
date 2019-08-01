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
<%@  include file="../include/admin_menu.jsp" %>
<table><tr><td height="30px"></td></tr></table>
<%@  include file="../include/project_search.jsp" %>
<br>
<table border="1" >
<tr>
<td>No</td>
<td colspan="2">프로젝트명</td>
<td>메이커</td>
<td>프로젝트 시작일</td>
<td>상태</td>
<c:forEach var="ad" items="${list}">
<tr>
<td>${ad.pro_idx}</td>
<td><img src="${path}/images/${ad.pro_image}"
         width="100px" height="100px"></td>
<td><a href="${path}/admin/project_detail/${ad.pro_idx}">
       ${ad.pro_name}</a></td>
<td><a href="${path}/admin/mem_view/${ad.maker_idx}">
       ${ad.maker_name}</a></td>
<td><fmt:formatDate value="${ad.pro_start}" pattern="yyyy-MM-dd"/></td>
<td><c:choose>
         <c:when test="${ad.pro_type1 == '2'}">승인대기</c:when>
         <c:when test="${ad.pro_type1 == '3'}">오픈예정</c:when>
         <c:when test="${ad.pro_type1 == '4'}">진행</c:when>
         <c:when test="${ad.pro_type1 == '5'}">마감</c:when>
         </c:choose></td>
</tr>

</c:forEach>
</table>

</body>
</html>