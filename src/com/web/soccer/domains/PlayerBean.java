package com.web.soccer.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class PlayerBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private String playerId,playerName,ePlayerName;
	private String nickName,joinYear,position,teamId;
	private String backNo,nation,birthDate,solar;
	private String height,weight;

}
