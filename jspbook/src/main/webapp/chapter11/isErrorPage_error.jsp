<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage = "true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception</title>
</head>
<body>
	<p>오류가 발생했습ㄴ다
	<p> 예외 유형 : <%= exception.getClass().getName() %>
	<p> 오류 메세지 : <%= exception.getMessage() %>
</body>
</html>