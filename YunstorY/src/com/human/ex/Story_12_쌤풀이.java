package com.human.ex;

public class Story_12_쌤풀이 {

	public static void main(String[] args) {
		java.util.Scanner sr=new java.util.Scanner(System.in);
		
		
		// 총 금액이 1000원이 넘으면 더이상 입금할 수 없다는 메세지출력 
		// 출금이 음수가 되면 출금되지 않도록 구현 
		
		int account = 0; //1.입금 2.출금 3.조회 (1-3반복)4.종료(끝)
		int input = 9; // while문 진행하는동안 계속 사용하려면 while문 밖에 선언
		
		while(input != 4) { //4가 아닌 값이 들어오면 반복
			System.out.println("현재금액:" + account); // 입력에 따라 달라지게 출력하기
			System.out.println("1.입금 2.출금 3.조회 4.종료");
			input=Integer.parseInt(sr.nextLine());//사용자 입력 받아오기
			
			/*if(input == 1) {
				System.out.println("입금할 금액");
				account = account + Integer.parseInt(sr.nextLine()); //일회성이라 변수에 넣어 따로 관리해주기
				if(account > 1000) {
					System.out.println(" 입금한도 초과  ");
					break;
				}
			}else {
				if(input == 2) {
					System.out.println("출금할 금액");
					account = account - Integer.parseInt(sr.nextLine()); //일회성이라 변수에 넣어 따로 관리해주기
					if(account < 0) {
						System.out.println(" 잔고부족 ");
						break;
					}
				}else {
					if(input == 3) {
						System.out.println("조회결과>>" + account);
					}else {
						
					}
				}
			}*/	
			
		//switch문 사용 
		/*	switch(input) {
			case 1:
				System.out.println("입금할 금액");
				account = account + Integer.parseInt(sr.nextLine()); //일회성이라 변수에 넣어 따로 관리해주기
				if(account > 1000) {
					System.out.println(" 입금한도 초과  ");
				}
				break;
			case 2:
				System.out.println("출금할 금액");
				account = account - Integer.parseInt(sr.nextLine()); //일회성이라 변수에 넣어 따로 관리해주기
				if(account < 0) {
					System.out.println(" 잔고부족 ");
				}
				break;
			case 3:
				System.out.println("조회결과>>" + account);
				break;
			default:
				
					
			}*/
			
			//else if 사용 
			if (input == 1) {
				System.out.println("입금할 금액");
				account = account + Integer.parseInt(sr.nextLine()); //일회성이라 변수에 넣어 따로 관리해주기
					if(account > 1000) {
						System.out.println(" 입금한도 초과  ");
						break;
					}
			}else if (input == 2) {
				System.out.println("출금할 금액");
				account = account - Integer.parseInt(sr.nextLine()); //일회성이라 변수에 넣어 따로 관리해주기
					if(account < 0) {
						System.out.println(" 잔고부족 ");
						break;
					}
			}else if (input == 3) {
				System.out.println("조회결과>>" + account);
			}else {
				
			}
			
		}
		
		System.out.println("프로그램 종료"); 
		
	}

}
