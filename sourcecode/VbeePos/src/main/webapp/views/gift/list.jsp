<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<div class="timeline">
	<div>
		<h1 class="timeline-title">Timeline</h1>
		<hr />
	</div>
	<div class="timeline-body">
		<nav aria-label="">
			<ul class="pagination">
				<c:forEach var="i" begin="1" end="${maxPage}">
					<c:if test="${currentPage == i}">
						<li class="page-item active"><a class="page-link"
							href="${context}/gifts/?page=${i}">${i}</a></li>
					</c:if>
					<c:if test="${currentPage != i}">
						<li class="page-item"><a class="page-link"
							href="${context}/gifts/?page=${i}">${i}</a></li>
					</c:if>
				</c:forEach>
			</ul>
		</nav>
		<div class="cards">
			<c:forEach items="${gifts}" var="gift">
				<div class="card">
					<div class="card_header">
						<span class="card_sender">From: <c:out
								value="${gift.sender}"></c:out></span> <span class="card_senderId"><c:out
								value="${gift.senderEmail}"></c:out></span> <span class="card_receiver">To:
							<c:out value="${gift.receiver}"></c:out>
						</span> <span class="card_receiverId"><c:out
								value="${gift.receiverEmail}"></c:out></span> <span class="card_time"><c:out
								value="${gift.sentTime}"></c:out></span>
					</div>
					<div class="card_body">
						#
						<c:out value="${gift.hashTag}"></c:out>
						<c:out value="${gift.message}"></c:out>
					</div>
					<div class="card_footer">
						<img class="img-fluid" alt="Points" id="points"
							src="${pageContext.request.contextPath}/assets/images/points.png">
						<c:out value="${gift.points}"></c:out>
						<img class="zoom img-fluid" alt="Clap" id="claps"
							src="${pageContext.request.contextPath}/assets/images/clap.png"
							onclick="clap(${gift.id});">
						<p id="clap-count-${gift.id}" class="d-inline">
							<c:out value="${gift.claps}"></c:out>
						</p>

					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</div>

<script src="<c:url value="/assets/js/clap.js" />"></script>
