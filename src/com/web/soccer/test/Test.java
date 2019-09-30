package com.web.soccer.test;


import com.web.soccer.serviceImpl.PlayerServiceImpl;

public class Test {
	public static void main(String[] args) {
		SingleObject o = SingleObject.getInstance();
		o.showMessage();
		
		PlayerServiceImpl s = PlayerServiceImpl.getInstance();
		s.show();
	}
	

	
}

