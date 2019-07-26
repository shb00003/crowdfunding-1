<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리워드 step10 화면입니다.</title>
</head>
<body>
<table>
	<c:forEach items="${articles}" var="article">
		<tr>
			<td>${article.pro_id}</td>
			<td>${article.reward_id}</td>
			<td>${article.mem_id}</td>
			<td>${article.reward_title}</td>
			<td>${article.reward_price}</td>
			<td>${article.reward_sell_count}</td>
		</tr>
	</c:forEach>
</table>
	<!-- int reward_id; //order_reward_T의 키 값
 	 int pro_id; // project_T의 키 값
	 int mem_id; // member_T의 키값
	 String reward_title; // 리워드 상품 이름
	 int reward_price; // 리워드 개당 금액
	 int reward_sell_count; // 판매가능 갯수 -->
</body>
</html>