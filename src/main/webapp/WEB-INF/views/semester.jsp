<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>학기 별 이수 학점 조회</title>
</head>
<body>
	<table align="center" border="1">
		<tr>
			<th width="80px">년도</th>
			<th>학기</th>
			<th width="80px">이수학점</th>
			<th>상세보기</th>
		</tr>
		<c:forEach var="coursesSemester" items="${coursesSemester}">
			<tr>
				<td><c:out value="${coursesSemester.year}"></c:out></td>
				<td><c:out value="${coursesSemester.semester}"></c:out></td>
				<td><c:out value="${coursesSemester.credit}"></c:out></td>
				<td>
				<a href="${pageContext.request.contextPath}/semesterdetail?year=${coursesSemester.year}&semester=${coursesSemester.semester}">링크</a>
				</td>
			</tr>
		</c:forEach>
	</table><br/>
	
	<div align="center">
		<a href="${pageContext.request.contextPath}/">홈으로 가기</a>
	</div>
</body>
</html>