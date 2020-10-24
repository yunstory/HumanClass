package com.human.ex;

public class test {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		
		
		
		
////		int i=7;
////		int sum=0;
////		while(i<=21) {
////			sum += i;
////			i++;
////		}
////		System.out.println(sum);
////		
////		
////		for(int j=7; i<=21; i++) {
////			sum += i; 
////		}
////		System.out.print(sum);
////		
////		
////		
////		System.out.println("1숫자입력");
////		int a = Integer.parseInt(scanner.nextLine());
////		System.out.println("숫자입력");
////		int b = Integer.parseInt(scanner.nextLine());
////		System.out.println("숫자입력");
////		int c = Integer.parseInt(scanner.nextLine());
////		
////		int temp=0;
//		
//		
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=4-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		int a=3; 
//		int b=6; 
//		
//		for(a=3; a<=7; a+=2)  
//			for(b=6; b<=10; b+=2) {
//			System.out.print("(" + a + "," + b +")" );
//		}
//		
//		
//		
//		for (int i=0; i<=10; i++) {
//			if(i%3==0) 
//				System.out.println("3의배수:" + i);
//				if(i%2==0) {
//				System.out.println("2의배수:" + i);
//			}
//		}
		

		
		
		
		for(int i=1; i<=5; i++){
			for(int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();

		
		
		for(int i=1; i<=5; i++) {
			for (int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			for (int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		System.out.println();
		System.out.println();
		
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		
		for(int i=1; i<=5;i++) {
			for(int j=1;j<5-i+1;j++) {
				System.out.print(" "); 
				}
			for(int x=1;x<=i*2-1;x++) {
				System.out.print("*");  
				}
			System.out.println();
		}

		
		
		System.out.println();
		System.out.println();

		
		
	
		for(int i=0; i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
				}
			for(int x=0;x<(5-i)-1;x++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		System.out.println();
		
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5*2-i; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.print(" ");
			System.out.print(" ");
			for(int j=1; j<=5+i; j++) {
				System.out.print(" ");
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5+i; j++) {
				System.out.print(" ");
				for(int k=i; k<=i-1; k++) {
					System.out.print("*");
				}
			}
			System.out.print(" ");
			System.out.print(" ");
			for(int j=1; j<=5; j++) {
				System.out.print(" ");
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println();
		
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.print(" ");
			System.out.print(" ");
			for(int k=0; k<=7; k++) {
				System.out.print("*");
			}
			System.out.print(" ");
			System.out.print(" ");
			for(int x=i; x<=7; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
	}}


