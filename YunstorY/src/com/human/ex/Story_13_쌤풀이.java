package com.human.ex;

import java.util.Scanner;

public class Story_13_��Ǯ�� {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		// ���Ǳ� Ǯ�� 2
		
		
		int input = 10; 
		int mTotal = 0;
		
		
		
		
		System.out.print("���Աݾ� : ");
		int money = Integer.parseInt(sc.nextLine());

		
		
		while(input != 6) {
			
			
			
			System.out.print("\n1.���̴� 400��  2.�ݶ� 500�� 3.Ŀ�� 600�� 4.500������ 5.100�� ���� 6.��ȯ ���� : ");
			input = Integer.parseInt(sc.nextLine());
			
			/*
			if(input == 1) {
				System.out.print("���� �޴� > ���̴� > 400��");				
				if(money < 400 ) {
					System.out.println("\n < < ! ! ! �ݾ׺��� ! ! ! > >  �ݾ��� �߰��� �ּ���.");
				}
				money -= 400;
				System.out.print("\t�����ݾ��� " + money + "�� �Դϴ�.\n");	
			}else if(input == 2) {
				System.out.print("���� �޴� > �ݶ� > 500��");
				if(money < 500 ) {
					System.out.println("\n < < ! ! ! �ݾ׺��� ! ! ! > >! �ݾ��� �߰��� �ּ���.");
				}
				money -= 500;
				System.out.print("\t�����ݾ��� " + money + "�� �Դϴ�.\n");
			}else if(input == 3) {
				System.out.print("���� �޴� > Ŀ�� > 600��");
				
				if(money < 600 ) {
					System.out.println("\n < < ! ! ! �ݾ׺��� ! ! ! > > �ݾ��� �߰��� �ּ���.");
				}
				money -= 600;
				System.out.print("\t�����ݾ��� " + money + "�� �Դϴ�.\n");
			}else if(input == 4) {
				System.out.print("500������");
				money += 500;
				System.out.print("\t�����ݾ��� " + money + "�� �Դϴ�.\n");
				
			}else if(input == 5) {
				System.out.print("100������");
				money += 100;
				System.out.print("\t�����ݾ��� " + money + "�Դϴ�.\n");
			}
			
		}
		int a = money/500;
		int b = (money%500)/100;
		
		if ( money < 0) {
			System.out.println("��ȯ�Ұ� ��ݹ̳� 112");
		}else {
		System.out.printf("��ȯ�� = 500��¥�� %d��, 100��¥�� %d��", a, b);
		*/
			
		//switch �� ��� 
			switch (input){
			case 1:
				System.out.print("���� �޴� > ���̴� > 400��");				
				if(money < 400 ) {
					System.out.println("\n < < ! ! ! �ݾ׺��� ! ! ! > >  �ݾ��� �߰��� �ּ���.");
				}
				money -= 400;
				System.out.print("\t�����ݾ��� " + money + "�� �Դϴ�.\n");
				break;
			case 2:
				System.out.print("���� �޴� > �ݶ� > 500��");
				if(money < 500 ) {
					System.out.println("\n < < ! ! ! �ݾ׺��� ! ! ! > >! �ݾ��� �߰��� �ּ���.");
				}
				money -= 500;
				System.out.print("\t�����ݾ��� " + money + "�� �Դϴ�.\n");
				break;
			case 3:
				System.out.print("���� �޴� > Ŀ�� > 600��");
				
				if(money < 600 ) {
					System.out.println("\n < < ! ! ! �ݾ׺��� ! ! ! > > �ݾ��� �߰��� �ּ���.");
				}
				money -= 600;
				System.out.print("\t�����ݾ��� " + money + "�� �Դϴ�.\n");
				break;
			case 4:
				System.out.print("500������");
				money += 500;
				System.out.print("\t�����ݾ��� " + money + "�� �Դϴ�.\n");
				break;
			case 5:
				System.out.print("100������");
				money += 100;
				System.out.print("\t�����ݾ��� " + money + "�Դϴ�.\n");
				break;
			default:
				int a = money/500;
				int b = (money%500)/100;
				
				if ( money < 0) {
					System.out.println("��ȯ�Ұ� ��ݹ̳� 112");
				}else {
				System.out.printf("��ȯ�� = 500��¥�� %d��, 100��¥�� %d��", a, b);
				}
				
				
			}
		}
		
		System.out.println("\n ���α׷� ����");
		
		
}}

