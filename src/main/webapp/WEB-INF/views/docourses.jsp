<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>수강 신청 하기</title>
</head>
<body>
	<form method="get" action="${pageContext.request.contextPath}/registercourses" >
		<table class="formtable" align="center">
			<tr>
				<td class="label">수강년도:</td>
				<td class="control">2017</td>
			</tr>
			<tr>
				<td class="label">학기:</td>
				<td class="control">1</td>
			</tr>
			<tr>
				<td class="label">교과코드:</td>
				<td class="control"><input type="text" name="code" /></td>
			</tr>
			<tr>
				<td class="label">교과목명:</td>
				<td class="control"><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td class="label">구분:</td>
				<td class="control">
				<select name="classify">
					<option value="전선">전선</option>
					<option value="전기">전기</option>
					<option value="전지">전지</option>
					<option value="일교">일교</option>
					<option value="핵교A">핵교A</option>
					<option value="핵교B">핵교B</option>
					<option value="교필">교필</option>
				</select>
				</td>
			</tr>
			<tr>
				<td class="label">학점:</td>
				<td class="control"><input type="text" name="credit" /></td>
			</tr>
			<tr>
				<td colspan="2"><input value="create subject" type="submit" /></td>
			</tr>
		</table>
	</form> <br/>
	<div align="center">
		<a href="${pageContext.request.contextPath}/">홈으로 가기</a>
	</div>
</body>
</html>