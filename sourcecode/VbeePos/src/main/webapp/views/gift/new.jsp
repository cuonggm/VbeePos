<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<div style="margin: auto; width: 500px;">
	<h1>New Gift</h1>
	<hr />

	<form method="post">
		<div class="form-group">
			<label for="hashtag">Hash Tag</label> <select name="hashtag"
				class="form-control" id="hashtag">
				<option>HashTag 1</option>
				<option>HashTag 2</option>
				<option>HashTag 3</option>
				<option>HashTag 4</option>
				<option>HashTag 5</option>
			</select>
		</div>
		<div class="form-group">
			<label for="points">Points</label> <select name="points"
				class="form-control" id="points">
				<option>50</option>
				<option>100</option>
				<option>200</option>
				<option>300</option>
				<option>400</option>
			</select>
		</div>
		<div class="form-group">
			<label for="receiver">Receiver</label> <input type="text"
				class="form-control" id="receiver" aria-describedby="account name"
				placeholder="Ex: Vũ Thị Trần Vân" autocomplete="off"> <input
				type="hidden" id="receiver_id" name="receiver_id">
		</div>
		<div class="form-group">
			<label for="message">Message</label>
			<textarea class="form-control" id="message" rows="3" name="message"></textarea>
		</div>
		<button type="submit" class="btn btn-primary">Send gift</button>
	</form>
</div>

<script src="<c:url value="/assets/js/searchaccountbox.js" />"></script>
