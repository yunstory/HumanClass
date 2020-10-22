package com.human.ex;

import java.util.Scanner;

public class Story_13_쌤풀이 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		// 자판기 풀이 2
		
		
		int input = 10; 
		int mTotal = 0;
		
		
		
		
		System.out.print("투입금액 : ");
		int money = Integer.parseInt(sc.nextLine());

		
		
		while(input != 6) {
			
			
			
			System.out.print("\n1.사이다 400원  2.콜라 500원 3.커피 600원 4.500원투입 5.100원 투입 6.반환 종료 : ");
			input = Integer.parseInt(sc.nextLine());
			
			/*
			if(input == 1) {
				System.out.print("선택 메뉴 > 사이다 > 400원");				
				if(money < 400 ) {
					System.out.println("\n < < ! ! ! 금액부족 ! ! ! > >  금액을 추가해 주세요.");
				}
				money -= 400;
				System.out.print("\t남은금액은 " + money + "원 입니다.\n");	
			}else if(input == 2) {
				System.out.print("선택 메뉴 > 콜라 > 500원");
				if(money < 500 ) {
					System.out.println("\n < < ! ! ! 금액부족 ! ! ! > >! 금액을 추가해 주세요.");
				}
				money -= 500;
				System.out.print("\t남은금액은 " + money + "원 입니다.\n");
			}else if(input == 3) {
				System.out.print("선택 메뉴 > 커피 > 600원");
				
				if(money < 600 ) {
					System.out.println("\n < < ! ! ! 금액부족 ! ! ! > > 금액을 추가해 주세요.");
				}
				money -= 600;
				System.out.print("\t남은금액은 " + money + "원 입니다.\n");
			}else if(input == 4) {
				System.out.print("500원투입");
				money += 500;
				System.out.print("\t남은금액은 " + money + "원 입니다.\n");
				
			}else if(input == 5) {
				System.out.print("100원투입");
				money += 100;
				System.out.print("\t남은금액은 " + money + "입니다.\n");
			}
			
		}
		int a = money/500;
		int b = (money%500)/100;
		
		if ( money < 0) {
			System.out.println("반환불가 요금미납 112");
		}else {
		System.out.printf("반환액 = 500원짜리 %d개, 100원짜리 %d개", a, b);
		*/
			
		//switch 문 사용 
			switch (input){
			case 1:
				System.out.print("선택 메뉴 > 사이다 > 400원");				
				if(money < 400 ) {
					System.out.println("\n < < ! ! ! 금액부족 ! ! ! > >  금액을 추가해 주세요.");
				}
				money -= 400;
				System.out.print("\t남은금액은 " + money + "원 입니다.\n");
				break;
			case 2:
				System.out.print("선택 메뉴 > 콜라 > 500원");
				if(money < 500 ) {
					System.out.println("\n < < ! ! ! 금액부족 ! ! ! > >! 금액을 추가해 주세요.");
				}
				money -= 500;
				System.out.print("\t남은금액은 " + money + "원 입니다.\n");
				break;
			case 3:
				System.out.print("선택 메뉴 > 커피 > 600원");
				
				if(money < 600 ) {
					System.out.println("\n < < ! ! ! 금액부족 ! ! ! > > 금액을 추가해 주세요.");
				}
				money -= 600;
				System.out.print("\t남은금액은 " + money + "원 입니다.\n");
				break;
			case 4:
				System.out.print("500원투입");
				money += 500;
				System.out.print("\t남은금액은 " + money + "원 입니다.\n");
				break;
			case 5:
				System.out.print("100원투입");
				money += 100;
				System.out.print("\t남은금액은 " + money + "입니다.\n");
				break;
			default:
				int a = money/500;
				int b = (money%500)/100;
				
				if ( money < 0) {
					System.out.println("반환불가 요금미납 112");
				}else {
				System.out.printf("반환액 = 500원짜리 %d개, 100원짜리 %d개", a, b);
				}
				
				
			}
		}
		
		System.out.println("\n 프로그램 종료");
		
		
}}

