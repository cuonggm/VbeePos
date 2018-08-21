<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<nav
	class="navbar navbar-expand-lg navbar-light bg-primary-color maximum-width custom-header">
	<a class="navbar-brand" href="/vbeepos" style="color: white;">VbeePos</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="btn btn-light"
				href="${context}/gifts/new/">Send Gift</a></li>
			<c:if test="${not empty userProfile}">
				<li class="nav-item pl-3"><a class="btn btn-light" href="#">Received
						Gifts <span class="badge badge-danger">
							${userProfile.receivedGiftCount} </span>
				</a></li>
				<li class="nav-item pl-3"><a class="btn btn-light" href="#">Sent
						Gifts <span class="badge badge-danger">
							${userProfile.sentGiftCount} </span>
				</a></li>
			</c:if>
		</ul>
		<form class="form-inline ml-auto mr-3 pull-right"
			action="${context}/logout/" method="post">
			<button class="btn btn-danger" type="submit">Logout</button>
		</form>
	</div>
</nav>