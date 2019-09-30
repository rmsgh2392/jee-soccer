var app = (()=>{
	return{
		init : (ctx)=>{
			playerService.login();
			$('#a_back').click(()=>{
				alert('조인화면 나옴');
				location.assign(ctx+'/player.do?action=move&page=login');
			});
			$('#a_create').click(()=>{
				alert('회원가입 화면으로 이동');
				location.assign(ctx+'/player.do?action=move&page=join');
				
			});
			
		}
	};
})();
/*playerId,playerName,ePlayerName;
private String nickName,joinYear,position,teamId;
private String backNo,nation,birthDate,solar;
private String height,weight;*/
/*
 * 자바 스크립트에 Bean객체 !! (아래 내용) 오리지날 자바스크립트 문법
 */
var player = (()=>{
	var _playerId, _playerName, _ePlayerName, _nickName
		, _joinYear, _position, _teamId, _backNo, _nation, _birthDate, _solar
		, _height, _weight;
	var setPlayerId = (playerId)=>{this._playerId = playerId;}//캡슐화 중 set
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}//캡슐화 중 get
	var getSolar = ()=>{return this._solar;}
	return {
		setPlayerId : setPlayerId,
		setSolar : setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar
	};
})();

var playerService=(()=>{
	return{
		login : ()=>{
			$('#login_button').click(()=>{
				if($('#id').val()==='' || $('#pw').val()===''){
					alert('필수 값이 없습니다.');
				}else{
					alert('입력한 아이디 값::'+$('#id').val());
					alert('입력한 비밀번호 값 ::'+$('#pw').val());
					$('#login_form').attr('action','/jee-soccer/player.do');
					$('#login_form').submit();
				}
				
			
			});
		}
	};
})();

