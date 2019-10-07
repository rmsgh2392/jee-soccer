<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/head.jsp"/>
포지션은 ${positions}입니다.
<a id="back_search" href="#">뒤로가기</a>
<jsp:include page="../common/foot.jsp"/>
<script>
app.init('${ctx}');
</script>