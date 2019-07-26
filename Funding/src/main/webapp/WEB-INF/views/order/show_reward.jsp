<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/views/include/script.jsp"%>

<meta charset="UTF-8">
<title>리워드 step10 화면입니다.</title>
</head>
<body>
	<form role="form" id="send_to_reward20" method="post" action="${path}/reward/step20">
	<table>
		<c:forEach items="${rewards}" var="reward">
			<tr>
				<td>${reward.pro_id}</td>
				<td>${reward.reward_id}</td>
				<td>${reward.mem_id}</td>
				<td>${reward.reward_title}</td>
				<td>${reward.reward_price}</td>
				<td>${reward.reward_sell_count}</td>
				<td><input type="checkbox" class="check_box_js" name="check_box"
					data-toggle="checkbox"></td>
				<td>
					<div class="number">
						<!-- <span class="numberUpDown">1</span>  -->
						<input type="text" name="order_count" class="numberUpDown"
							value="1"> <a href="#" class="increaseQuantity">수량 올림</a>
						<a href="#" class="decreaseQuantity">수량 내림</a>
					</div>
				</td>
			</tr>
		</c:forEach>
		<tr>
		</tr>
	</table>
	후원금 더하기 : <input type="text" value=0 name="sub_money">
	<table>
		<tr>
			<td>이름비공개 : <input type="checkbox" name="close_name"></td>
			<td>펀딩금액 비공개 : <input type="checkbox" name="close_money"></td>
		</tr>
	</table>
	<button type="submit"> 다음 단계로 </button>
	
	</form>
	
	<!-- int reward_id; //order_reward_T의 키 값
 	 int pro_id; // project_T의 키 값
	 int mem_id; // member_T의 키값
	 String reward_title; // 리워드 상품 이름
	 int reward_price; // 리워드 개당 금액
	 int reward_sell_count; // 판매가능 갯수 -->
	<script>
	// 수량 감소 증가 

	 $(function() {		 
		   $('.check_box').change(function(e){
			     var checkbox = $(e.target.parentNode);
		         var check = checkbox.children(".check_box_js");
			     if(check.is(":checked")){
			          alert("체크");
			     }else{
			         alert("체크 해제");
		     	 }
	     	});
	 		$('.decreaseQuantity').click(function(e) {
	 			e.preventDefault();
	 			var btn = $(e.target.parentNode);
	 			/* console.log(btn.children('#numberUpDown').text());
	 			console.log(btn); */
	 			var stat = btn.children('.numberUpDown').val();
	 			var num = parseInt(stat, 10);
	 			num--;
	 			if (num <= 0) {
	 				alert('더이상 줄일수 없습니다.');
	 				num = 1;
	 			}
	 			btn.children('.numberUpDown').val(num);
	 		});
	 		$('.increaseQuantity').click(function(e) {
	 			e.preventDefault();
	 			var btn = $(e.target.parentNode);
	 			var stat = btn.children('.numberUpDown').val();
	 			var num = parseInt(stat, 10);
	 			num++;

	 			if (num > 5) {
	 				alert('더이상 늘릴수 없습니다.');
	 				num = 5;
	 			}
	 			btn.children('.numberUpDown').val(num);
	 		});
	 		
	 		
	 	});
	 </script>

</body>


</html>