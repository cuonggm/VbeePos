<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="col-3 leftpane maximum">
	<c:if test="${not empty userProfile}">
		<div class="user-profile">
			<h1 id="profile-title">My Profile</h1>
			<hr />
			<p id="profile-name">Full Name: ${userProfile.name}</p>
			<p id="profile-id">ID: ${userProfile.accountId}</p>
			<p id="profile-email">Email: ${userProfile.email}</p>
			<p id="profile-gender">Gender: ${userProfile.gender}</p>
			<p id="profile-role">Role: ${userProfile.role}</p>
			<p id="profile-birthday">Birthday: ${userProfile.birthday}</p>
			<p id="profile-department">Department: ${userProfile.department}</p>
			<p id="profile-branch">Branch: ${userProfile.branch}</p>
		</div>
	</c:if>

	<hr />

	<c:if
		test="${not empty userProfile && userProfile.role.equals('admin')}">
		<div id="admin-pane">
			<h1 id="admin-title">Admin</h1>
			<hr />
			<a id="btn-reset-points" class="btn btn-block" href="#">Reset
				Points</a>
		</div>
	</c:if>
</div>