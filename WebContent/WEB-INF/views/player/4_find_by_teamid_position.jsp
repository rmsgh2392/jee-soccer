<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 4.팀아이디로 해당 팀의 포지션별 션수 검색기능) 수원팀 (ID: K02),골키퍼-->
<h3>4.팀아이디와 포지션 입력하면 해당 선수 정보 출력</h3>
<form id="player" action="${ctx}/player.do">
	팀아이디<input type="text" name="teamId"/></br>
	<!-- name은 빈클래스의 속성의 이름과 같아야 한다. 확인 필수 !! -->
	포지션<input type="text" name="position"/><br />
	<input type="submit" value="팀아이디,포지션 전송"/>
	<input type="hidden" name="action" value="player"/>
	<input type="hidden" name="page" value="4_find_by_teamid_position"/>
</form>

<!-- 4번 결과  -->
<h1>파인드 인덱스 들어옴</h1>
해당 ID가 ${players.teamId} 팀의 포지션${players.position}이 일치하는 선수는 홍길동입니다.
