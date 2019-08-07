<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/main_header.jsp"%>
</head>
<body>
	<%@ include file="../include/admin_menu.jsp"%>
<<<<<<< HEAD
<br>
<a href="${path}/admin/managerList.do">관리자 리스트</a> |
=======
>>>>>>> refs/remotes/origin/master

	<form name="adLogin" method="post">
		<table>
			<tr>
				<td><input type="text" name="ad_id" placeholder="아이디"></td>
			</tr>
			<tr>
				<td><input type="password" name="ad_pw" placeholder="비밀번호"></td>
			</tr>
			<td colspan="2"><input type="button" id="adLogbtn" value="로그인">
				<%-- <c:if test="${param.message=='error'}">
                     아이디 또는 비밀번호가 일치하지 않습니다. </c:if> 
                <c:if test="${messagge=='logout'}">
                     로그인 시간이 만료되었습니다. </c:if> --%>
            </td>
		</table>
	</form>
</body>
</html>
