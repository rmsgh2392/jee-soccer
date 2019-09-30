<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/head.jsp"/>
<div></div>
<div>
	<img id="soccer_intro" src="${img}/soccer_intro.jpg" alt="" />
</div>
<div></div>
<div></div>
<div>
<h2 style="width: 300px;margin:0 auto">축구협회 관리 시스템</h2>
	<form id="login_form">
		<div id="login_tab">
			
				<div id="login_tab_item_1">
					ID <input id="id" class="input_text" type="text" name="playerId"/>
				</div>
				
				<div id="login_tab_item_2">
					<input id="login_button" type="button" value="로그인"/>
				</div>
			
			
				<div id="login_tab_item_3">
					PW <input id="pw" class="input_text" type="text" name="solar"/>
				</div>
			
		</div>
		<input type="hidden" name="action"value="login"/>
		<input type="hidden" name="page" value="home"/>
	</form>
</div>
	<div></div>
	<div></div>
	<div>
		<h3 id="join_a"><a id="a_create" href="#">회원가입</a></h3>
	</div>
	<div></div>
<jsp:include page="../common/foot.jsp"/>
<script>
app.init('${ctx}');
</script>

