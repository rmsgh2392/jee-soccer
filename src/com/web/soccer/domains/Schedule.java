package com.web.soccer.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class Schedule implements Serializable{
	private static final long serialVersionUID = 1L;
	private String stadiumId,scheDate,gubun;
	private String hometeamId,awayteamId,homeScore,awayScore;
}
