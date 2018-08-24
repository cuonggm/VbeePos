<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<div class="col-3 leftpane maximum">
	<c:if test="${not empty userProfile}">
		<div class="user-profile">
			<h1 id="profile-title">My Profile</h1>
			<hr />
			<p id="profile-name">
				Full Name: <span class="badge badge-light pull-right">${userProfile.name}</span>
			</p>
			<p id="profile-id">
				ID: <span class="badge badge-light pull-right">${userProfile.accountId}</span>
			</p>
			<p id="profile-email">
				Email: <span class="badge badge-light pull-right">${userProfile.email}</span>
			</p>
			<p id="profile-gender">
				Gender: <span class="badge badge-light pull-right">${userProfile.gender}</span>

			</p>
			<p id="profile-role">
				Role: <span class="badge badge-light pull-right">${userProfile.role}</span>
			</p>
			<p id="profile-birthday">
				Birthday: <span class="badge badge-light pull-right">${userProfile.birthday}</span>

			</p>
			<p id="profile-department">
				Department: <span class="badge badge-light pull-right">${userProfile.department}</span>

			</p>
			<p id="profile-branch">
				Branch: <span class="badge badge-light pull-right">${userProfile.branch}</span>

			</p>
			<p>
				Points: <span id="profile-points"
					class="badge badge-danger pull-right">${userProfile.points}</span>
			</p>
		</div>
	</c:if>

	<c:if
		test="${not empty userProfile && userProfile.role.equals('admin')}">
		<div id="admin-pane">
			<h1 id="admin-title">Admin</h1>
			<hr />
			<a id="btn-reset-points" class="btn btn-block"
				href="${context}/admin/resetpoints/">Reset Points</a>
		</div>
	</c:if>
</div>