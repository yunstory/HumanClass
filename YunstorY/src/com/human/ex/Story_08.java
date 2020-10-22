package com.human.ex;

public class Story_08 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
	
		
		
/*		if(true) {
			System.out.println("1-true일때 출력");
		}else {
			System.out.println("1-false일때 출력");
		}
		
		if(false) {
			System.out.println("2-true일때 출력");
		}else {
			System.out.println("2-false일때 출력");
		}
		
		if(10>5) {
			System.out.println("10이 5보다 크다");
		}else {
			System.out.println("10이 5보다 크지 않다.");
		}
		
		if(10 ? 5) {
			System.out.println("10이 5보다 크다");
		}else {
			//이 부분이 출력되려면 ?에 무엇으 들어가야 하는가
			System.out.println("10이 5보다 크지 않다.");
		}

	}
*/
		System.out.println("a값 출력");
		int a=Integer.parseInt(scanner.nextLine());
		System.out.println("b값 출력");
		int b=Integer.parseInt(scanner.nextLine());
		
		
		if(a>b) {
			System.out.println("a가크다");
		}else {
			System.out.println("b가크다");
		}
		
		//
		
		
		System.out.println("z값 출력");
		int z=Integer.parseInt(scanner.nextLine());
		
		if(z>10) {
			System.out.println("z가10보다큼 ");
		}else {
			System.out.println("z가10보다작음");
		}
		
		//
		
		
		
		System.out.println("d값 출력>>");
		int d=Integer.parseInt(scanner.nextLine());
		
		
		if(d>0) {
			if(d==0) {
				System.out.println("0");
			}else {
				System.out.println("양수");
			}
		}else {
			System.out.println("음수");
		}
		

		
		
		//
		

		System.out.println("e값 출력>>");
		int e=Integer.parseInt(scanner.nextLine());
		System.out.println("f값 출력>>");
		int f=Integer.parseInt(scanner.nextLine());
		System.out.println("g값 출력>>");
		int g=Integer.parseInt(scanner.nextLine());
		
		if(e>f) {
			if(e>g) {
					System.out.println("큰값은e");
				}else {
					System.out.println("큰값은g");
				}
		}else{
			if(f>g) {
				System.out.println("큰값은f");
			}else {
				System.out.println("큰값은g");
			}
		}
		

		
		
		

}}
