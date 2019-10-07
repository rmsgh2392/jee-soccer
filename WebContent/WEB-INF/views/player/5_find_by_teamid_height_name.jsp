<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 5.Query -->
<h5>5.팀코드와 키,이름 선수 정보 출력</h5>
<form id="team" action="${ctx}/player.do">
	팀아이디 <input type="text" name="teamId"/><br />
	키 <input type="text" name="height"/></br>
	선수이름 <input type="text" name="playerName"/></br>
	<input type="submit" value="전송"/>
	<input type="hidden" name="action" value="team"/>
	<input type="hidden" name="page" value="5_find_by_teamid_height_name"/>
</form>
<!-- 5.번 결과 -->

