package com.human.ex;

public class Story_13 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		
		
		
		/* 거스름돈 
		System.out.println("상품가격 = ");
		int price=Integer.parseInt(scanner.nextLine());
		
		System.out.println("지급 액 = ");
		int moneyinput=Integer.parseInt(scanner.nextLine());
		
		System.out.println("거스름돈 = "+ (moneyinput - price));
		
		
		int i = moneyinput;
		int change1000 = i/1000;
		int change500 = (i%1000)/500; 
		int change100 = (i%500)/100;
		int change50 = (i%100)/50;
		int change10 = (i%50)/10;
		
		if(i<=10) {
			System.out.println("10원 이하는 입력받지 않습니다.");
		}
		
		System.out.println("천원짜리" + change1000 + "개, 오백원짜리 " + change500 + "개, 백원짜리" + change100 
				+ "개, 오십원짜리" + change50 + "개, 십원짜리" + change10 + "개");
*/
		
		
		int inputString=10;
		int moneyTotal=0;
		int money=0;
		int moneyInput=0;
		
		
		while(inputString!=0) {
			System.out.println("\n메뉴번호 < 1.사이다 700원 2.콜라 500원 3.환타 350원 4.투입 5.반환>");
			System.out.print("메뉴선택 = ");
			inputString=Integer.parseInt(scanner.nextLine());
			
			if(inputString==1) {
				System.out.println("선택메뉴 = 사이다");
				money += 700;
				
			}else if(inputString==2) {
				System.out.println("선택메뉴 = 콜라");
				money += 500;
				
			}else if(inputString==3) {
				System.out.println("선택메뉴 = 환타");
				money += 350;
				
			}else if(inputString==4) {
				System.out.println("총금액 = " + (moneyTotal = money));
				
				System.out.print("투입액 = ");
				moneyInput=Integer.parseInt(scanner.nextLine());
				
			}else if(inputString==5) {
				System.out.println("반환액 = " + (moneyInput-moneyTotal));
				
				int i = moneyInput-moneyTotal;
				int change1000 = i/1000;
				int change500 = (i%1000)/500; 
				int change100 = (i%500)/100;
				int change50 = (i%100)/50;
				int change10 = (i%50)/10;
				
				System.out.println("천원짜리" + change1000 + "개, 오백원짜리 " + change500 + "개, 백원짜리" + change100 
						+ "개, 오십원짜리" + change50 + "개, 십원짜리" + change10 + "개");
			}
		
		}
		
		

}
}
