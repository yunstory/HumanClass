package com.human.ex22;

public class ¿Ã¿±¡÷ {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		
		
		
		

		

		
		
		
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

		
		
		
	}
}


