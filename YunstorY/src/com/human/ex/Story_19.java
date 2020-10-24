package com.human.ex;

public class Story_19 {
	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		/*
	
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=i; j++) {  //여기서 7을 찍으면 7개반복후 처음으로 가지만 j<=i로 맞춰 준 지금은 
				System.out.print("*"); // i값이 1일때 1번반복 2일땐 2번반복~ 7일땐 7번반복 이렇게 따라가준다.
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		System.out.println("숫자입력");
		int i = Integer.parseInt(scanner.nextLine());
		for(int a=1; a<=i; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("o");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		

		for(int a=7; a>=1; a--) {
			for( i=1; i<=a; i++) {
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println();
		
		
		
		System.out.println("숫자입력");
		int x=Integer.parseInt(scanner.nextLine());
		
		for(int a=x; a>=1; a--) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		*/
		
		
		for(int i=1;i<8;i++) {
			for(int j=7;j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//뭔진 모르겠는데 신기하네 
		// 반복되는 구간을 찾기 ! 총a줄 b공백 c개의 *
		
		for(int a=1; a<=5; a++) {

			for(int c=a; c<=5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=1; a<=5; a++) {

			for(int c=1; c<=a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=1; a<=5; a++) {
			for(int b=a; b<=5; b++) {
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=1; a<=5; a++) {
			for(int b=0; b<=a-1; b++) {
				System.out.print(" ");
			}
			for(int c=a; c<=5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		for(int k=1;k<10;k++) { 

	        for(int i=1;i<10;i++) {

	             for(int j=k;j<k+3;j++) {

	                   int sum=i*j;

	                   System.out.print(j+" × "+i+" = "+sum);

	                   System.out.print("\t\t");

	             }

	             System.out.println();

	         }

	         System.out.println("\n");

	         k+=2;

	 }	

		*/	
	
	
	
	
	
	
	
	
	}
}