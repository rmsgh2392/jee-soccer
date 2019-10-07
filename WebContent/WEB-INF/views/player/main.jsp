<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/head.jsp"/>
<div class="container">
<div></div> <div>원하시는 검색 결과</div> <div></div>
<div></div>
<div class="content">
<m:choose>
	<m:when test="${page eq '2_positions'}">
		<jsp:include page="2_positions_q.jsp"/>
	</m:when>
	<m:when test="${page eq '2_position_r'}">
		<jsp:include page="2_position_r.jsp"/>
	</m:when>
	<m:when test="${page eq '2_position_r'}">
		<jsp:include page="2_positions_q.jsp"/>
	</m:when>
	
	
	
</m:choose>
</div>
<div></div> <div></div> <div></div>
<div></div>
</div>
<jsp:include page="../common/foot.jsp"/>
<script>
app.init('${ctx}');
</script>