package com.human.ex;

public class Story_12 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);

		
		
		
		
		// 총 금액이 1000원이 넘으면 더이상 입금할 수 없다는 메세지출력 
		// 출금이 음수가 되면 출금되지 않도록 구현 ( 구현 추가풀이 )
		
		
		
		
		
		int input=10;
		
		System.out.println("금액 입력");
		int account=Integer.parseInt(scanner.nextLine());
		
		while(input != 0) {
			System.out.println("\n전체메뉴: 1.입금 2.출금 3.조회 0.종료");
			System.out.print("메뉴선택 : ");
			input=Integer.parseInt(scanner.nextLine());
			
			//else if 문 형식 풀이 
			if(input==1) {
				System.out.println("현금을 넣어주세요");	
				int cash=Integer.parseInt(scanner.nextLine());
				account += cash;
				System.out.printf("금액=%d" , account);
				if( account > 1000) {
					System.out.println("\n입금한도초과");
					break;
				}
			}else if(input==2) {
				System.out.print("출금 할 금액입력:");
				int cash=Integer.parseInt(scanner.nextLine());
				account -= cash;
				System.out.printf("출금액= %d", account);
				if( account < 0) {
					System.out.println("\n잔고부족 \t거래종료");
					break;
				}
			}else if(input==3) {
				System.out.print("통장조회");
				System.out.printf("조회결과 %d:",account);
			}else{ 
				
			}
		}
		
			
		//switch문 사용
			/*
		switch(input) {
		case 1: 
			System.out.println("현금을 넣어주세요");	
			int cash=Integer.parseInt(scanner.nextLine());
			account += cash;
			System.out.printf("금액=%d" , account);
				if( account > 1000) {
					System.out.println("\n입금한도초과");
					break;
				}
			break;
		case 2: 
			System.out.print("출금 할 금액입력:");
			cash=Integer.parseInt(scanner.nextLine());
			account -= cash;
			System.out.printf("출금액= %d", account);
				if( account < 0) {
					System.out.println("\n잔고부족 \t거래종료");
					break;
				}
			break;
		case 3: 
			System.out.print("통장조회");
			System.out.printf("조회결과 %d:",account);
			break;
		default:
		
			System.out.print("거래종료");	
		}
		*/
	}
		
	}

