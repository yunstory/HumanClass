package com.human.ex;

public class Story_12 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);

		
		
		
		
		// �� �ݾ��� 1000���� ������ ���̻� �Ա��� �� ���ٴ� �޼������ 
		// ����� ������ �Ǹ� ��ݵ��� �ʵ��� ���� ( ���� �߰�Ǯ�� )
		
		
		
		
		
		int input=10;
		
		System.out.println("�ݾ� �Է�");
		int account=Integer.parseInt(scanner.nextLine());
		
		while(input != 0) {
			System.out.println("\n��ü�޴�: 1.�Ա� 2.��� 3.��ȸ 0.����");
			System.out.print("�޴����� : ");
			input=Integer.parseInt(scanner.nextLine());
			
			//else if �� ���� Ǯ�� 
			if(input==1) {
				System.out.println("������ �־��ּ���");	
				int cash=Integer.parseInt(scanner.nextLine());
				account += cash;
				System.out.printf("�ݾ�=%d" , account);
				if( account > 1000) {
					System.out.println("\n�Ա��ѵ��ʰ�");
					break;
				}
			}else if(input==2) {
				System.out.print("��� �� �ݾ��Է�:");
				int cash=Integer.parseInt(scanner.nextLine());
				account -= cash;
				System.out.printf("��ݾ�= %d", account);
				if( account < 0) {
					System.out.println("\n�ܰ���� \t�ŷ�����");
					break;
				}
			}else if(input==3) {
				System.out.print("������ȸ");
				System.out.printf("��ȸ��� %d:",account);
			}else{ 
				
			}
		}
		
			
		//switch�� ���
			/*
		switch(input) {
		case 1: 
			System.out.println("������ �־��ּ���");	
			int cash=Integer.parseInt(scanner.nextLine());
			account += cash;
			System.out.printf("�ݾ�=%d" , account);
				if( account > 1000) {
					System.out.println("\n�Ա��ѵ��ʰ�");
					break;
				}
			break;
		case 2: 
			System.out.print("��� �� �ݾ��Է�:");
			cash=Integer.parseInt(scanner.nextLine());
			account -= cash;
			System.out.printf("��ݾ�= %d", account);
				if( account < 0) {
					System.out.println("\n�ܰ���� \t�ŷ�����");
					break;
				}
			break;
		case 3: 
			System.out.print("������ȸ");
			System.out.printf("��ȸ��� %d:",account);
			break;
		default:
		
			System.out.print("�ŷ�����");	
		}
		*/
	}
		
	}

