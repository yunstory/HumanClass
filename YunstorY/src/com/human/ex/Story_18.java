package com.human.ex;

public class Story_18 {
	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		
		//
		for(int a=3; a<=5; a++) {
			for(int b=6; b<=8; b++) {
				System.out.print("(" + a + "," + b + ")");
			}
		}
		
		
		
		
		
		
		
		System.out.println("\n");
		//
		for(int a=1; a<=3; a++) {
			for(int b=4; b<=8; b++) {
				if(b%2 == 0)
				System.out.print("(" + a + "," + b + ")");
			}
		}
		
		
		
		
		
		
		System.out.println("\n");
		//
		for(int a=2; a<=6; a++) {
			if(a%2==0)
				for(int b=1; b<=3; b++) {
					System.out.print("(" + a + "," + b + ")");
				}
			
		}
		
		
		
		
		
		
		System.out.println("\n");
		//
		for(int x=2; x<=9; x++) {
			System.out.print("단 입력 >> ");
			x = Integer.parseInt(scanner.nextLine());
			
			System.out.println( x + "단");
			
			for(int y=1; y<=9; y++) {
				System.out.println( x + "x" + y + "=" + (x*y));
			}
		}
		
		
		
		
		
		
		
		
		
		System.out.println("\n");
		//
		int a=3, b=6; 
		
		for(a=3; a<=5; a++) {
			for(b=6; b<=8; b++) {
				System.out.print("(" + a + "," + b + ")");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n");
		//
		for(int c=2; c<=9; c++) {
			System.out.println( c + "단");
			for(int d=2; d<=9; d++) {
				System.out.println(c + " * " + d + " = " + (c*d));
			}
		}
		
		
		
		
		
		
		
		
		System.out.println("\n");
		//
		for(int e=1; e<=9; e++) {
			for(int f=1; f<=9; f++) { 
				System.out.print(f + "*" + e + "=" + (e*f) + "\t");
				}
				System.out.println(" ");	
			}
			
	
		
		
		
		
		
		
		
		
		System.out.println("\n");
		//
		for(int e=1; e<=9; e++) {
			for(int f=1; f<=3; f++) { 
				System.out.print(f + " X " + e + " = " + (e*f) + "\t\t");
				}
				System.out.println(" ");	
			}

		System.out.println("\n");
		
		for(int e=1; e<=9; e++) {
			for(int f=4; f<=6; f++) { 
				System.out.print(f + " X " + e + " = " + (e*f) + "\t\t");
				}
				System.out.println(" ");	
			}
		
		System.out.println("\n");
		
		for(int e=1; e<=9; e++) {
			for(int f=7; f<=9; f++) { 
				System.out.print(f + " X " + e + " = " + (e*f) + "\t\t");
				}
				System.out.println(" ");	
			}
		
		
		
		
}
}
