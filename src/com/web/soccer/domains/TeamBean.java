package com.web.soccer.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class TeamBean implements Serializable{
	private static PlayerBean t = new PlayerBean();
	private static final long serialVersionUID = 1L;
	
	private String teamId,regionName,teamName,eTeamName;
	private String originYear,stadiumId,zipCode1,zipCode2;
	private String address,ddd,tel,fax,homePage,owner;
	
}
