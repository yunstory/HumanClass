package com.human.ex22;

public class testǮ�� {

	public static void main(String[] args) {
		
		
		
//		//7-12��
//		int sum=0;
//		for(int i=7; i<22; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		sum = 0;
//		int i = 7;
//		while(i<22 ) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
//		
//		//���� ���� �Է¹޾� ���� �� ���� ���
//		int a = 3;
//		int b = 2;
//		int c = 1;
//		boolean isA=false;
//		boolean isB=false;
//		boolean isC=false;
//		
//		
//		//��ȯ����
//		if ( a > b ) {
//			if ( b > c ) {
//				isC=true;
//				System.out.println(c);
//			}else {
//				isB=true;
//				System.out.println(b);
//			}
//			
//		}else {
//			if( a > c ) {
//				isC=true;
//				System.out.println(c);
//			}else {
//				isB=true;
//				System.out.println(a);
//			}
//			
//		}
//		if(isA==true) {
//			if( b > c ) {
//				System.out.println(c);
//				System.out.println(b);
//			}else {
//				System.out.println(b);
//				System.out.println(c);
//			}
//			
//		}else if(isB==true) {
//			if( a<c ) {
//				System.out.println(c);
//				System.out.println(a);
//			}else {
//				System.out.println(a);
//				System.out.println(c);
//			}
//			
//		}else {
//			if (a>b) {
//				System.out.println(b);
//				System.out.println(a);
//			}else {
//				System.out.println(a);
//				System.out.println(b);
//			}
//			
//		}
		
		//��ȯ���
		int a=3;
		int b=2;
		int c=1;
		
		//a b �� b c �� a b �ѹ� �� ��
		
		if(a>b) {
			int t;
			t=a;
			a=b;
			b=t;
		}
		if(b>c) {
			int t;
			t=b;
			b=c;
			c=t;
		}
		if(a>b) {
			int t;
			t=a;
			a=b;
			b=t;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		//�����
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" "); // 3 2 1 0 
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*"); // 1 2 3 4
			}
			System.out.println();
		}
		
		
		
		//(3.6)(5.8)(7.10)
		int countJ=0;
		for(int j=3; j<=7; j+=2) {
			countJ++;
			int countI=0;
			for(int i=6; i<=10; i+=2) {
				countI++;
				if(countJ==countI) {
				System.out.println(j+":"+i);
				}
			}
		}
		
		
		
		//3�ǹ�� 2�ǹ�� 
		
		int x[]=new int[10];
		for(int i=0; i<x.length; i++) {
			x[i]=i*3;
		}
		
		for(int i=0; i<x.length; i++) {
			if(x[i]%2==0) {
				System.out.println(x[i]);
			}
		}
		
		

	}

}
