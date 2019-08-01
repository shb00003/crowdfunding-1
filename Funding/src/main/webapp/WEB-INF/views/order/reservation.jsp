<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/views/include/script.jsp"%>

<meta charset="UTF-8">
<title>order 완료 화면입니다.</title>
</head>
<body>
	<table class="reward_list" id ="reward_list">
		<c:forEach items="${rewards}" var="reward">
			<tr>
				<td>  ${reward.pro_id}</td>
				<td> ${reward.reward_id}</td>
				<td>  ${reward.mem_idx}</td>
				<td> ${reward.reward_title}</td>
				<td><fmt:formatNumber pattern="###,###,###" value="${reward.reward_price}"/>원 </td>
				<td> ${reward.reward_sell_count}</td>
				<td>
					<input type="checkbox" name="reward_id" value="${reward.reward_id}" class="check_box_js"
					data-toggle="checkbox">
						<!-- <span class="numberUpDown">1</span>  -->
				</td>	
	
			</tr>
		</c:forEach>
	</table>

</body>


</html>