package com.human.ex22;

import java.util.Arrays;

public class a1023_3 {
//	public static int sum(int a, int b) {
//	int sum=0;
//	sum=a+b;
//	return sum;
//	// sum += 1;	
//	
//}

//public static void main(String[] args) {	
//	
//	int a=sum(1,2);
//	int b=a+sum(2,2);
//	System.out.println(a+b);
//	
//	//min mul div 함수를 만들어 사용해보자

	
	
	
	
//	public static void function1() {
//		System.out.println("안녕하세요");
//		//return값이 없어서 return생략됨
//	}
//
//	
//	public static void main(String[] args) {	
//		function1();
//		function1();
//		
//	}
	
	
	
	
//	public static void function2(int a) {
//		//리턴값이 없고 매개변수가 있는 함수
//		System.out.println("함수 매개변수 a 값은:"+a);
//		return;//리턴값이 없으면 생략 가능
//	}
//	
//	public static void main(String[] args) {
//		function2(10);
//		function2(12);
//		
//	}
	
	
	public static void function1(int a) {
		a=10;
	}
	public static int function2(int a) {
		a=10;
		return a;
	}
	public static void function3(int a[]) {
		a[0]=10;
	}
	public static int[] function4(int a[]) {
		a[0]=10;
		return a;

	}
	
	public static void main(String[] args) {
		int a=5;
		int arr[]= {1,2};
		function1(a);
		System.out.println(a);
		
		
		int rValue=function2(a);
		System.out.println(a);
		System.out.println(rValue);
		
		
		function3(arr);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		
		int rArr[]=function4(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));
		rArr[1]=9;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));
		
		
		
	}
	
}
	
