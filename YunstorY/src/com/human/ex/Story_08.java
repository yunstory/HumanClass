package com.human.ex;

public class Story_08 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
	
		
		
/*		if(true) {
			System.out.println("1-true�϶� ���");
		}else {
			System.out.println("1-false�϶� ���");
		}
		
		if(false) {
			System.out.println("2-true�϶� ���");
		}else {
			System.out.println("2-false�϶� ���");
		}
		
		if(10>5) {
			System.out.println("10�� 5���� ũ��");
		}else {
			System.out.println("10�� 5���� ũ�� �ʴ�.");
		}
		
		if(10 ? 5) {
			System.out.println("10�� 5���� ũ��");
		}else {
			//�� �κ��� ��µǷ��� ?�� ������ ���� �ϴ°�
			System.out.println("10�� 5���� ũ�� �ʴ�.");
		}

	}
*/
		System.out.println("a�� ���");
		int a=Integer.parseInt(scanner.nextLine());
		System.out.println("b�� ���");
		int b=Integer.parseInt(scanner.nextLine());
		
		
		if(a>b) {
			System.out.println("a��ũ��");
		}else {
			System.out.println("b��ũ��");
		}
		
		//
		
		
		System.out.println("z�� ���");
		int z=Integer.parseInt(scanner.nextLine());
		
		if(z>10) {
			System.out.println("z��10����ŭ ");
		}else {
			System.out.println("z��10��������");
		}
		
		//
		
		
		
		System.out.println("d�� ���>>");
		int d=Integer.parseInt(scanner.nextLine());
		
		
		if(d>0) {
			if(d==0) {
				System.out.println("0");
			}else {
				System.out.println("���");
			}
		}else {
			System.out.println("����");
		}
		

		
		
		//
		

		System.out.println("e�� ���>>");
		int e=Integer.parseInt(scanner.nextLine());
		System.out.println("f�� ���>>");
		int f=Integer.parseInt(scanner.nextLine());
		System.out.println("g�� ���>>");
		int g=Integer.parseInt(scanner.nextLine());
		
		if(e>f) {
			if(e>g) {
					System.out.println("ū����e");
				}else {
					System.out.println("ū����g");
				}
		}else{
			if(f>g) {
				System.out.println("ū����f");
			}else {
				System.out.println("ū����g");
			}
		}
		

		
		
		

}}
