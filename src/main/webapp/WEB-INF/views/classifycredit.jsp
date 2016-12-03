<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>이수 구분 별 학점 조회</title>
</head>
<body>
	<table align="center" border="1">
		<tr>
			<c:forEach var="coursesClass" items="${coursesClass}">
				<th width="60px">${coursesClass.classify}</th>
			</c:forEach>
		</tr>
		<tr>
			<c:forEach var="coursesClass" items="${coursesClass}">
				<td width="60px">${coursesClass.credit}</td>
			</c:forEach>
		</tr>
	</table><br/>
	
	<div align="center">
		<a href="${pageContext.request.contextPath}/">홈으로 가기</a>
	</div>
</body>
</html>