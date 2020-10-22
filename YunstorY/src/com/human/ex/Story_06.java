package com.human.ex;

public class Story_06 {

	public static void main(String[] args) {
		
		//java.util.Scanner = int, scanner=new = a (int a; )

		java.util.Scanner scanner=new java.util.Scanner(System.in); //주석품
		
//		System.out.print("첫번째 숫자 입력>>");	
//		int i=Integer.parseInt(scanner.nextLine());
//		System.out.print("첫번째 입력 값은>>");
//		System.out.println(i);
		
//		System.out.print("두번째 숫자 입력>>");
//		i=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 입력 값은>>");
//		System.out.println(i);
		
		
		
		
		System.out.print("첫번째 숫자 입력>>");
		int a=Integer.parseInt(scanner.nextLine());
		System.out.println("첫번째 숫자 출력>>"+a);
		
		System.out.print("두번째 숫자 입력>>");
		int b=Integer.parseInt(scanner.nextLine());
		System.out.println("두번째 숫자 출력>>"+b);
		
		System.out.println("a+b="+(a+b));
		
		//
		
		int sum=0;
		int i=0;
		
		System.out.print("숫자 입력>>");
		i=Integer.parseInt(scanner.nextLine());
		System.out.println("숫자 출력>>"+i);
		sum=sum+i;
		
		System.out.print("숫자 입력>>");
		i=Integer.parseInt(scanner.nextLine());
		System.out.println("숫자 출력>>"+i);
		sum=sum+i;
		
		System.out.println("모두 출력>>"+sum);
		
	}

}
