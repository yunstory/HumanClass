package com.human.ex;

public class Story_10 {
	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
	
	
		System.out.print("�� �Է�:");
		int a = Integer.parseInt(scanner.nextLine());
		System.out.print("�� �Է�:");
		int b = Integer.parseInt(scanner.nextLine());
		System.out.print("�� �Է�:");
		int c = Integer.parseInt(scanner.nextLine());
		
		int i = 0;
		if(a<b) {
			if(b<c) {
			}else {
				i = b;
				b = c;
				c = i;
				if(a<b) {
				}else {
					i = a;
					a = b;
					b = i;
				}
			}
		}else {
			i = a;
			a = b;
			b = i;	
			if(b<c) {
			}else {
				i = b;
				b = c;
				c = i;
				if(a<b) {
				}else {
					i = a;
					a = b;
					b = i;
				}
			}
		}
			
		System.out.print("���������� ���:"+a+b+c);
					
					


	}
}


		
/*
 System.out.print("���� �Է�(����/���/�Ķ�) : ");
		String colorInput=scanner.nextLine();
		System.out.println(colorInput);
		while(!colorInput.equals("����") && !colorInput.equals("���") && !colorInput.equals("�Ķ�")) 
		{
			System.out.print("���� �ٽ� �Է�(����/���/�Ķ�) : ");
			colorInput=scanner.nextLine();
		}
		System.out.print("��� �Է�(0~100) : ");
		int brightnessInput=Integer.parseInt(scanner.nextLine());
		while(brightnessInput>100 || brightnessInput<0) {
			System.out.print("��� �ٽ� �Է�(0~100) : ");
			brightnessInput=Integer.parseInt(scanner.nextLine());
		}
		System.out.printf("���� ������ %s, ���� %d �̴�",colorInput,brightnessInput);
			*/
		
		
		



