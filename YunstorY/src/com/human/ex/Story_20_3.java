package com.human.ex;

//사용자 정의 데이터 클래스 정의 


public class Story_20_3 {
	public static void main(String[] args) {
		
		
		
		// 사용을 위한 클래스 선언
		Humans h1 = new Humans();
		// 클래스의 데이터 값 할당
		h1.name = "yuns";
		h1.age = 23;
		h1.height = 154.7;
		
		//클랙스의 데이터 출력
		System.out.println("name:" + h1.name);
		System.out.println("age:" + h1.age);
		System.out.println("height:" + h1.height);
		
		
		System.out.println();
		
		
		
		Humans h2 = new Humans();
		// 클래스의 데이터 값 할당
		h2.name = "yunz";
		h2.age = 24;
		h2.height = 168;
		
		//클랙스의 데이터 출력
		System.out.println("name:" + h2.name);
		System.out.println("age:" + h2.age);
		System.out.println("height:" + h2.height);
		
		
		
		System.out.println();
	}

}
