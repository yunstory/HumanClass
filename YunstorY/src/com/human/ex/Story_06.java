package com.human.ex;

public class Story_06 {

	public static void main(String[] args) {
		
		//java.util.Scanner = int, scanner=new = a (int a; )

		java.util.Scanner scanner=new java.util.Scanner(System.in); //�ּ�ǰ
		
//		System.out.print("ù��° ���� �Է�>>");	
//		int i=Integer.parseInt(scanner.nextLine());
//		System.out.print("ù��° �Է� ����>>");
//		System.out.println(i);
		
//		System.out.print("�ι�° ���� �Է�>>");
//		i=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° �Է� ����>>");
//		System.out.println(i);
		
		
		
		
		System.out.print("ù��° ���� �Է�>>");
		int a=Integer.parseInt(scanner.nextLine());
		System.out.println("ù��° ���� ���>>"+a);
		
		System.out.print("�ι�° ���� �Է�>>");
		int b=Integer.parseInt(scanner.nextLine());
		System.out.println("�ι�° ���� ���>>"+b);
		
		System.out.println("a+b="+(a+b));
		
		//
		
		int sum=0;
		int i=0;
		
		System.out.print("���� �Է�>>");
		i=Integer.parseInt(scanner.nextLine());
		System.out.println("���� ���>>"+i);
		sum=sum+i;
		
		System.out.print("���� �Է�>>");
		i=Integer.parseInt(scanner.nextLine());
		System.out.println("���� ���>>"+i);
		sum=sum+i;
		
		System.out.println("��� ���>>"+sum);
		
	}

}
