<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="maximum">
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="<c:url value="/assets/css/font-awesome.min.css" />" />
<script src="<c:url value="/assets/js/autocomplete.js" />"></script>
<link rel="stylesheet" href="<c:url value="/assets/css/main.css" />" />
<c:if test="${not empty title}">
	<title>${title}</title>
</c:if>
<c:if test="${empty title}">
	<title>VbeePos | Trao gửi yêu thương</title>
</c:if>
</head>
<body class="maximum">
	<div class="container-fluid grey-bg maximum custom-container">
		<div class="maximum">
			<!-- Flash -->
			<c:if test="${not empty message}">
				<div class="alert alert-${flash} m-0" role="alert">${message}</div>
			</c:if>
			<tiles:insertAttribute name="body"></tiles:insertAttribute>
		</div>
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>
</body>
</html>