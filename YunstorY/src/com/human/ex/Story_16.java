package com.human.ex;

public class Story_16 {
	public static void main(String[] args) {
		java.util.Scanner sr=new java.util.Scanner(System.in);
		
		
		int account = 0; //1.�Ա� 2.��� 3.��ȸ (1-3�ݺ�)4.����(��)
		int input = 9; // while�� �����ϴµ��� ��� ����Ϸ��� while�� �ۿ� ����
		
		while(input != 4) { //4�� �ƴ� ���� ������ �ݺ�
			System.out.println("����ݾ�:" + account); // �Է¿� ���� �޶����� ����ϱ�
			System.out.println("1.�Ա� 2.��� 3.��ȸ 4.����");
			input=Integer.parseInt(sr.nextLine());//����� �Է� �޾ƿ���
			
			//else if �� 
			
			
			if(input == 1) { //input�� 1�϶� ������ ��� ���
					
			}else if(input == 2) {
				
			}else if(input == 3) {
				
			}else { //��� �ƴ� �� ������ ��� ���
				
			}
			
			
			//switch�� 
			
			switch(input) {
			case 1: 
				//input�� 1�϶� ������ ��� ���
				break;
			case 2: 
				//input�� 2�϶� ������ ��� ���
				break;
			case 3: 
				//input�� 3�϶� ������ ��� ���
				break;
			default:
				//��� �ƴ� �� ������ ��� ���
			}
			
			
			/*
			if(input == 1) {
				System.out.println("�Ա��� �ݾ�");
				account = account + Integer.parseInt(sr.nextLine()); //��ȸ���̶� ������ �־� ���� �������ֱ�
				if(account > 1000) {
					System.out.println(" �Ա��ѵ� �ʰ�  ");
					break;
				}
			}else {
				if(input == 2) {
					System.out.println("����� �ݾ�");
					account = account - Integer.parseInt(sr.nextLine()); //��ȸ���̶� ������ �־� ���� �������ֱ�
					if(account < 0) {
						System.out.println(" �ܰ���� ");
						break;
					}
				}else {
					if(input == 3) {
						System.out.println("��ȸ���>>" + account);
					}else {
						
					}
				}
			}	
		}
		*/
			
		System.out.println("���α׷� ����"); 
		
		
		
		
		
		
}
}
}