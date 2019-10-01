var app = (()=>{
	return{
		init : (ctx)=>{
			playerService.login(ctx);
			playerService.join(ctx);
			playerService.moveJoin(ctx);
			playerService.backJoin(ctx);
			
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
		login : (ctx)=>{
			$('#login_button').click(()=>{
				if($('#id').val()==='' || $('#pw').val()===''){
					alert('값이 없음');
				}else{
					alert('입력한 아이디'+$('#id').val());
					$('#login_form').attr('action',ctx+'/player.do');
					$('#login_form').submit();
				}
				
			
			});
		},
		join : (ctx)=>{
			$('#join_button').click(()=>{
					alert('도메인 명'+ctx);
					if($('#join_id').val()==='' || $('#join_pw').val()===''){
						alert('필수 값이 없음');
					}else{
						$('#join_form').attr('action',ctx+'/player.do');
						$('#join_form').submit();
						
						
					}
			});
		},
		moveJoin : (ctx)=>{
			$('#a_create').click(()=>{
				location.assign(ctx+'/facade.do?action=move&page=join');
				
			});
		},
		backJoin : (ctx)=>{
			$('#a_back').click(()=>{
				location.assign(ctx+'/facade.do?action=move&page=login');
			});
		}
	};
})();

