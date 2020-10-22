package com.human.ex;

public class Story_10 {
	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
	
	
		System.out.print("¼ö ÀÔ·Â:");
		int a = Integer.parseInt(scanner.nextLine());
		System.out.print("¼ö ÀÔ·Â:");
		int b = Integer.parseInt(scanner.nextLine());
		System.out.print("¼ö ÀÔ·Â:");
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
			
		System.out.print("ÀÛÀº¼öºÎÅÍ Ãâ·Â:"+a+b+c);
					
					


	}
}


		
/*
 System.out.print("»ö±ò ÀÔ·Â(»¡°­/³ë¶û/ÆÄ¶û) : ");
		String colorInput=scanner.nextLine();
		System.out.println(colorInput);
		while(!colorInput.equals("»¡°­") && !colorInput.equals("³ë¶û") && !colorInput.equals("ÆÄ¶û")) 
		{
			System.out.print("»ö±ò ´Ù½Ã ÀÔ·Â(»¡°­/³ë¶û/ÆÄ¶û) : ");
			colorInput=scanner.nextLine();
		}
		System.out.print("¹à±â ÀÔ·Â(0~100) : ");
		int brightnessInput=Integer.parseInt(scanner.nextLine());
		while(brightnessInput>100 || brightnessInput<0) {
			System.out.print("¹à±â ´Ù½Ã ÀÔ·Â(0~100) : ");
			brightnessInput=Integer.parseInt(scanner.nextLine());
		}
		System.out.printf("ÇöÀç »ö»óÀº %s, ¹à±â´Â %d ÀÌ´Ù",colorInput,brightnessInput);
			*/
		
		
		



