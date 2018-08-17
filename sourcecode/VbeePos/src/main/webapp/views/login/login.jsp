<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<div class="login-background">
	<div class="login">
		<form action="${context}/login/" method="post">
			<div class="login-title">
				<h1>Login</h1>
				<p>VbeePos | Trao gửi yêu thương</p>
			</div>
			<hr class="white-line" />
			<div class="form-group">
				<label for="email">Email address</label> <input type="email"
					class="form-control" id="email" placeholder="Enter email"
					name="email">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password" placeholder="Password"
					name="password">
			</div>
			<hr class="white-line" />
			<button type="submit" class="btn btn-primary btn-block btn-login">Login</button>
		</form>
	</div>
</div>
