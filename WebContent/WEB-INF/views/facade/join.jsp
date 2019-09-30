<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/head.jsp"/>

<div></div>
<div id="title_join"><h1>회원가입 화면</h1></div>
<div></div>
<div></div>
<div>
	<form id="join_form">
			playerId<input class="text_class" type="text" name="playerId"/>
			playerName<input class="text_class" type="text" name="playerName"/>
			ePlayerName<input class="text_class" type="text" name="ePlayerName"/>
			nickName<input class="text_class" type="text" name="nickName"/>
			joinYear<input class="text_class" type="text" name="joinYear"/>
			position<input class="text_class" type="text" name="position"/>
			teamId<input class="text_class" type="text" name="teamId"/>
			backNo<input class="text_class" type="text" name="backNo"/>
			nation<input class="text_class" type="text" name="nation"/>
			birthDate<input class="text_class" type="text" name="birthDate" />
			solar<input class="text_class" type="text" name="solar"/>
			height<input class="text_class" type="text" name="height"/>
			weight<input class="text_class" type="text" name="weight"/>
			<div><input  type="submit" value="회원가입"/><a id="a_back" href="#">취소</a></div>
			
		</div>
	</form>





<script>
app.init('${ctx}');
</script>
<jsp:include page="../common/foot.jsp"/>