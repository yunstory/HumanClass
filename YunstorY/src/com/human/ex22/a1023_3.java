package com.human.ex22;

import java.util.Arrays;
import java.util.Scanner;

import com.human.dto.Human;

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
//	//min mul div �Լ��� ����� ����غ���

	
	
	
	
//	public static void function1() {
//		System.out.println("�ȳ��ϼ���");
//		//return���� ��� return����������
//	}
//
//	
//	public static void main(String[] args) {	
//		function1();
//		function1();
//		
//	}
	
	
	
	
//	public static void function2(int a) {
//		//���ϰ��� ���� �Ű������� �ִ� �Լ�
//		System.out.println("�Լ� �Ű����� a ����:"+a);
//		return;//���ϰ��� ������ ���� ����
//	}
//	
//	public static void main(String[] args) {
//		function2(10);
//		function2(12);
//		
//	}
	
	//�߰��������ϳ�����!

//	public static void function3(int a) {
//	//�Ű������� �ְ� ���ϰ��� �ִ� �Լ�
//		int returnValue=a+b;
//		return returnValue;
//	}
//
//	public static void main(String[] args) {
//		int a=function4(5,3);
//		System.out.println(a);
//		System.out.println(function4(5,3));
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
		int rValue[] = a;
		rValue[0] = 11; 
		return rValue;
//		a[0]=11; //�����߰�..?
//		return a;

	}
	
	public static int[] function5(int a[]) {
		int rValue[] = new int[a.length];
		rValue[0] = a[0];
		rValue[1] = a[1];
		rValue[1]=21;
		a[1]=22;
		return rValue;

	}
	
	
	public static Human function6(Human h) {
		Human rHuman = h;
		rHuman.age =31;
		return rHuman;
	}
	public static Human function7(Human h) {
		Human rHuman = new Human("ȫ�泲",11,11.1);
		rHuman.age = 32;
		return rHuman;
	}
	
	
	public static void main(String[] args) {
		int a=5;
		int arr[]= {1,2};
		function1(a);
		System.out.println(a);
		
		System.out.println("\n-----------------------\n");
		
		int rValue=function2(a);
		System.out.println(a);
		System.out.println(rValue);
		
		System.out.println("\n-----------------------\n");
		
		function3(arr);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n-----------------------\n");
		
		int rArr[]=function4(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));
		rArr[1]=9;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));
		
		System.out.println("\n-----------------------\n");
		
		int b[] = {10, 11};
		int rB[] = function5(b);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(rB));
		rB[0] = 1;
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(rB));
		function5(b);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(rB));
		
		
		System.out.println("\n-----------------------\n");
		
		
		Human h = new Human("ȫ�浿",11,11.1);
//		Human rH;
//		rH = function6(h);
//		System.out.println(h);
//		System.out.println(rH);
//		h.age = 50;
//		System.out.println(h);
//		System.out.println(rH);
		
		Human rH;
		rH = function7(h);
		System.out.println(h);
		System.out.println(rH);
		h.age = 50;
		System.out.println(h);
		System.out.println(rH);

		System.out.println("\n-----------------------\n");
		
		Scanner sc=new Scanner(System.in);
		
		int num1 = (int)(Math.random()*99)+1;
		int num2 = (int)(Math.random()*99)+1;
		
		int level = 0;
		

		
		
		

}}
	
