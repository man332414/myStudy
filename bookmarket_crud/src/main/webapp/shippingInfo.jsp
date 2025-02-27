<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="UTF-8">
	<title>배송정보</title>
</head>
<body>
	<div class = "container py-4">
		<%@ include file = "menu.jsp" %>
		
		<div class = "p-5 mb-4 bg-body-tertiary rounded-3">
			<div class = "container-fluid py-5">
				<h1 class = "display-5 fw-bold">배송정보</h1>
				<p class = "col-md-8 fs-4">Shipping Info</p>
			</div>
		</div>
		
		<div class = "row align-items-md-stretch">
			<form action="shippingInfo" method = "post">
				<input type = "hidden" name = "cartId" value = "<%=request.getParameter("cartId")%>">
				<div class = "mb-3 row">
					<label class = "col-sm-2">성명</label>
					<div class = "col-sm-3">
						<input type = "text" name = "name" class = "form-control">
					</div>
				</div>
				<div class = "mb-3 row">
					<label class = "col-sm-2">배송일</label>
					<div class = "col-sm-3">
						<input type = "text" name = "shippingDate" placeholder = "yyyy/mm/dd" class = "form-control">
					</div>
				</div>
				<div class = "mb-3 row">
					<label class = "col-sm-2">국가명</label>
					<div class = "col-sm-3">
						<input type = "text" name = "country" class = "form-control">
					</div>
				</div>
				<div class = "mb-3 row">
					<label class = "col-sm-2">우편번호</label>
					<div class = "col-sm-3">
						<input type = "text" name = "zipCode" class = "form-control">
					</div>
				</div>
				<div class = "mb-3 row">
					<label class = "col-sm-2">주소</label>
					<div class = "col-sm-3">
						<input type = "text" name = "addressName" class = "form-control">
					</div>
				</div>
				<div class = "mb-3 row">
					<div class = "col-sm-offset-2 col-sm-10">
						<a href = "cart?cartId=<%=request.getParameter("cartId") %>" class = "btn btn-secondary" role = "button">이전</a>
						<input type = "submit" value = "등록" class = "btn btn-primary">
						<a href = "checkOutCancelled" class = "btn btn-secondary" role = "button">취소</a>
						
					</div>
				</div>
			</form>	
		</div>
		<%@include file = "footer.jsp" %>
	</div>
</body>
</html>