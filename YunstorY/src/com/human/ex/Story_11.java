package com.human.ex;

public class Story_11 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
	

		
		int inputString = 9;
		
		while(inputString == 0) {
			System.out.println("��ü�޴�: 1.1���޴� 2.2���޴� 3.3���޴� 0.����");
			inputString=Integer.parseInt(scanner.nextLine());
		if(inputString == 1) {
			System.out.println("1���޴�");
		}else if(inputString == 2) {
			System.out.println("2���޴�");
		}else if(inputString == 3) {
			System.out.println("3���޴�");
		}else if(inputString == 0) {
			System.out.println("�޴� ����");
		}else {
			System.out.println("�߸� �Է�");
		}
		
		
		}
		
	}
}


