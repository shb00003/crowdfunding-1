<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<html>
<head>
<%@ include file="/WEB-INF/views/include/script.jsp"%>
<title>Home</title>
</head>
<body>
	<h1>펀딩하기 화면 시작</h1>
	<button type="button" class="fbtn">펀딩하기</button>
	<form role="form" id="send_pro_id" method="get"
		action="${path}/reward/step10">
		<!--<input type="hidden" value="${project.pro_id}">  -->
		<input type="hidden" name="pro_id" value="2">
	</form>
	<script>
		$(document).ready(function() {

			var formObj = $("form[role='form']");
			console.log(formObj);
			
			$(".fbtn").on("click", function() {
				formObj.submit();
			});
		});
	</script>
</body>

</html>
