<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>학기 별 이수 학점 조회 상세보기</title>
</head>
<body>
	<table align="center" border="1">
		<tr>
			<th width="80px">년도</th>
			<th>학기</th>
			<th width="120px">교과코드</th>
			<th width="250px">교과목명</th>
			<th width="50px">구분</th>
			<th>학점</th>
		</tr>

		<c:forEach var="coursesSemesterDetail" items="${coursesSemesterDetail}">
			<tr>
				<td><c:out value="${coursesSemesterDetail.year}"></c:out></td>
				<td><c:out value="${coursesSemesterDetail.semester}"></c:out></td>
				<td><c:out value="${coursesSemesterDetail.code}"></c:out></td>
				<td><c:out value="${coursesSemesterDetail.name}"></c:out></td>
				<td><c:out value="${coursesSemesterDetail.classify}"></c:out></td>
				<td><c:out value="${coursesSemesterDetail.credit}"></c:out></td>
			</tr>
		</c:forEach>
	</table><br/>
	<div align="center">
		<a href="${pageContext.request.contextPath}/">홈으로 가기</a>
	</div>
	
</body>
</html>