package com.human.ex;

public class Story_07 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		//
		
		System.out.print("width>");
		int a=Integer.parseInt(scanner.nextLine());
		System.out.println("����>>"+a);
		
		System.out.print("lenght>>");
		int b=Integer.parseInt(scanner.nextLine());
		System.out.println("����>>"+b);
		
		
		System.out.println("�簢���� ����>>"+(a*b));
		
		//
		
		System.out.print("width>>");
		int c=Integer.parseInt(scanner.nextLine());
		System.out.println("����>>"+c);
		
		System.out.print("length>>");
		int d=Integer.parseInt(scanner.nextLine());
		System.out.println("����>>"+d);
		
		System.out.print("height>>");
		int e=Integer.parseInt(scanner.nextLine());
		System.out.println("����>>"+e);
		
		System.out.println("�簢����� ����>>"+(c*d*e));
		
		
		//
		
		System.out.print("f�ǰ�>>");
		int f=Integer.parseInt(scanner.nextLine());
		
		System.out.println("m>>");
		System.out.println(f/100 );

		System.out.println("cm>>");
		System.out.println(f%100 );
		
		
		
		//
		
		int sum=0;

		System.out.print("����>>");
		int g = Integer.parseInt(scanner.nextLine()); 
		System.out.println("������>>"+g); 
		
		System.out.print("�Ʒ��� >>");
		int h = Integer.parseInt(scanner.nextLine()); 
		System.out.println("�Ʒ�����>>"+h); 
		
		System.out.print("���� >>");
		int i = Integer.parseInt(scanner.nextLine());
		System.out.println("���̰�>>"+i);
		
		sum=(g+h)*i/2;
		
		System.out.println("����>>"+sum);
			
			
		

		

		

		
		
		

		
		
		
		
		
		
		
		
	}

}
