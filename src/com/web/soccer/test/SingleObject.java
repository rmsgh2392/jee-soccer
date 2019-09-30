package com.web.soccer.test;

public class SingleObject {
	private static SingleObject instance = new SingleObject();

	public static SingleObject getInstance() {
		return instance;
	}
	public SingleObject() {}
		
	public void showMessage() {
		System.out.println("싱글턴 패턴 테스트 시험");
	}
	
}
