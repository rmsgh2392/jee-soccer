<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<style id="text/css">
 	*{font-famliy:맑은 고딕; font-size:26px;}
</style>
</head>
<body>
<h2><a id="position" href="#">2.포지션 종류 보기</a></h2>
<!-- 4.팀아이디로 해당 팀의 포지션별 션수 검색기능) 수원팀 (ID: K02),골키퍼-->
<h3>4.팀아이디와 포지션 입력하면 해당 선수 정보 출력</h3>
<form id="player" action="<%=request.getContextPath()%>/player.do">
	팀아이디<input type="text" name="teamId"/></br>
	<!-- name은 빈클래스의 속성의 이름과 같아야 한다. 확인 필수 !! -->
	포지션<input type="text" name="position"/><br />
	<input type="submit" value="팀아이디,포지션 전송"/>
	<input type="hidden" name="action" value="player"/>
	<input type="hidden" name="page" value="4_find_by_teamid_position"/>
</form>

<h4>6.선수이름과 키,몸무게 입력하면 해당 선수 정보 출력</h4>
<form id="bit1" action="<%=request.getContextPath()%>/player.do">
	<input type="text" name="playerName"/>
	<input type="text" name="height"/>
	<input type="text" name="weight"/>
	<input type="hidden" name="action" value="search"/>
	<input type="hidden" name="page" value="6_find_by_playername_height_weight"/>
	<input type="submit" value="전송"/>
</form>
<h5>5.팀코드와 키,이름 선수 정보 출력</h5>
<form id="team" action="<%=request.getContextPath()%>/player.do">
	팀아이디 <input type="text" name="teamId"/><br />
	키 <input type="text" name="height"/></br>
	선수이름 <input type="text" name="playerName"/></br>
	<input type="submit" value="전송"/>
	<input type="hidden" name="action" value="team"/>
	<input type="hidden" name="page" value="5_find_by_teamid_height_name"/>
</form>
<script>
$('#position').click(function(){
	alert('연결 성공?');
	location.assign('<%=request.getContextPath()%>/player.do?action=move&page=2_positions');
});
$('#player').submit(function(){
	alert('팀아이디,포지션 보냄');
	
});
$('#bit1').submit(function(){
	alert('bit1연결');
});
$('#team').submit(function(){
	alert('teamform 연결');
});
</script>
</body>
</html>