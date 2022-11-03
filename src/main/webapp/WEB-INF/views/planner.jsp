<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>플래너 내용</title>
<script type="text/javascript">
	
</script>
</head>
<body>
	<table id="plannerMainTable">
		<tr>
			<td id="toDoTd" rowspan="2" valign="top">
				<form action="dailyboard.insertschedule" method="post">
				<table id="toDoTable">
					<tr class="contentTitleTr">
						<td class="contentTitleTd">
							<span>할 일</span>
							<button>수정하기</button>
						</td>
					</tr>
					<tr>
						<td valign="top">
							<textarea name="scheduleText">${viewDailyBoard.d_schedule }</textarea> 
						</td>
					</tr>
				</table>
				</form>
			</td>
			<td valign="top">
				<table id="checkListTable">
					<tr class="contentTitleTr">
						<td class="contentTitleTd" valign="top">
							<span>체크리스트</span>
							<button>수정하기</button>
						</td>
					</tr>
					<tr>
						<td valign="top">${viewDailyBoard.d_to_do_list }</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td valign="top">
				<table id="reviewTable">
					<tr class="contentTitleTr">
						<td class="contentTitleTd" valign="top">
							<span>리뷰</span>
							<button>수정하기</button>
						</td>
					</tr>
					<tr>
						<td valign="top">${viewDailyBoard.d_review }</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>

</body>
</html>