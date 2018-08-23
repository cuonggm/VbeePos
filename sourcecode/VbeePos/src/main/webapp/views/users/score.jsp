<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="user-score">
	<h1>Users Ranking</h1>
	<hr />
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Rank</th>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Points</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty users}">
				<c:forEach items="${users}" var="user">
					<tr>
						<th scope="row">${user.score}</th>
						<td>${user.accountId}</td>
						<td>${user.name}</td>
						<td>${user.email}</td>
						<td>${user.points}</td>
					</tr>
				</c:forEach>
			</c:if>

		</tbody>
	</table>
</div>
