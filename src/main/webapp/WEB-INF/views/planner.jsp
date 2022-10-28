<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>플래너 내용</title>
</head>
<body>
	<table id="plannerMainTable">
		<tr>
			<td id="toDoTd" rowspan="2" valign="top">
				<table id="toDoTable">
					<tr class="contentTitleTr">
						<td class="contentTitleTd">
							<span>할 일</span>
							<button>수정하기</button>
						</td>
					</tr>
					<tr>
						<td valign="top">내용</td>
					</tr>
				</table>
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
						<td valign="top">내용</td>
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
						<td valign="top">내용</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>

</body>
</html>