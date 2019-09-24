package com.web.soccer.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class StadiumBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String stadiumId,stadiumName,homeTeamId;
	private String seatCount,address,ddd,tel;	
	
}
