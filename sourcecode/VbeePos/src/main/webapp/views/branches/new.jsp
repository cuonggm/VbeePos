<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="container">
	<h1>Create Branch</h1>
	<hr />
	<form action="/vbeepos/branches/" method="post">
		<div class="form-group">
			<label for="branch-name">Name</label> <input type="text"
				class="form-control" id="branch-name"
				placeholder="Enter branch name" name="branch-name">
		</div>
		<div class="form-group">
			<label for="branch-address">Address</label> <input type="text"
				class="form-control" id="branch-address"
				placeholder="Enter branch address" name="branch-address">
		</div>
		<button type="submit" class="btn btn-primary">Create branch</button>
	</form>
</div>