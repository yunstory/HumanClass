package com.human.ex;

public class Story_07 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		//
		
		System.out.print("width>");
		int a=Integer.parseInt(scanner.nextLine());
		System.out.println("가로>>"+a);
		
		System.out.print("lenght>>");
		int b=Integer.parseInt(scanner.nextLine());
		System.out.println("세로>>"+b);
		
		
		System.out.println("사각형의 넓이>>"+(a*b));
		
		//
		
		System.out.print("width>>");
		int c=Integer.parseInt(scanner.nextLine());
		System.out.println("가로>>"+c);
		
		System.out.print("length>>");
		int d=Integer.parseInt(scanner.nextLine());
		System.out.println("세로>>"+d);
		
		System.out.print("height>>");
		int e=Integer.parseInt(scanner.nextLine());
		System.out.println("높이>>"+e);
		
		System.out.println("사각기둥의 부피>>"+(c*d*e));
		
		
		//
		
		System.out.print("f의값>>");
		int f=Integer.parseInt(scanner.nextLine());
		
		System.out.println("m>>");
		System.out.println(f/100 );

		System.out.println("cm>>");
		System.out.println(f%100 );
		
		
		
		//
		
		int sum=0;

		System.out.print("윗변>>");
		int g = Integer.parseInt(scanner.nextLine()); 
		System.out.println("윗변값>>"+g); 
		
		System.out.print("아랫변 >>");
		int h = Integer.parseInt(scanner.nextLine()); 
		System.out.println("아랫변값>>"+h); 
		
		System.out.print("높이 >>");
		int i = Integer.parseInt(scanner.nextLine());
		System.out.println("높이값>>"+i);
		
		sum=(g+h)*i/2;
		
		System.out.println("가격>>"+sum);
			
			
		

		

		

		
		
		

		
		
		
		
		
		
		
		
	}

}
