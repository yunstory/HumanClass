package com.human.ex22;

public class test풀이 {

	public static void main(String[] args) {
		
		
		
//		//7-12합
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
//		//숫제 세개 입력받아 작은 수 부터 출력
//		int a = 3;
//		int b = 2;
//		int c = 1;
//		boolean isA=false;
//		boolean isB=false;
//		boolean isC=false;
//		
//		
//		//교환없이
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
		
		//교환방법
		int a=3;
		int b=2;
		int c=1;
		
		//a b 비교 b c 비교 a b 한번 더 비교
		
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
		
		
		//별찍기
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
		
		
		
		//3의배수 2의배수 
		
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
