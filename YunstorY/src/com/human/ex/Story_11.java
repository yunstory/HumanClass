package com.human.ex;

public class Story_11 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
	

		
		int inputString = 9;
		
		while(inputString == 0) {
			System.out.println("전체메뉴: 1.1번메뉴 2.2번메뉴 3.3번메뉴 0.종료");
			inputString=Integer.parseInt(scanner.nextLine());
		if(inputString == 1) {
			System.out.println("1번메뉴");
		}else if(inputString == 2) {
			System.out.println("2번메뉴");
		}else if(inputString == 3) {
			System.out.println("3번메뉴");
		}else if(inputString == 0) {
			System.out.println("메뉴 종료");
		}else {
			System.out.println("잘못 입력");
		}
		
		
		}
		
	}
}


