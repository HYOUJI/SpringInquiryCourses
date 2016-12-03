<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Home</title>
</head>
<body>

<p><a href="${pageContext.request.contextPath}/semester">학기별 이수 학점 조회</a>
<p><a href="${pageContext.request.contextPath}/classification">이수 구분 별 학점 조회</a>
<p><a href="${pageContext.request.contextPath}/docourses">수강 신청 하기</a>
<p><a href="${pageContext.request.contextPath}/menu">수강 신청 조회 메뉴</a>

</body>
</html>
