package com.human.ex;

public class Story_17 {

	public static void main(String[] args) {
		
		
		//a1=0, a2=0, a3=0, a4=0, a5=0 
		//a[5], a[] = {0, 0, 0, 0, 0}
		
		/*
		int a1 = 0; 
		int a2 = 0; 
		int a3 = 0; 
		int a4 = 0; 
		int a5 = 0; 
		
		int a[] = new int[5];
		a[0] = 0; 
		a[1] = 0; 
		a[5] = 0; // 5�� ���� 5�� = 0���� �����ؼ� 4����
		System.out.println(a[0]);
		*/
		
		/*
		int a[] = new int[3];
		a[0] = 5;
		a[2] = 3; 
		int b[] = {0, 4, 6, 0};
		System.out.println(a[0]);
		System.out.println(b[2]);
		a[1] = 8;
		b[0] = 1;
		b[3] = a[1] + b[0];
		
		for(int i=0; i<3; i++) {
			a[i] = i + 1;
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("a[" + i + "]");
		}
		

		int a[] = {1, 2, 3};
*/
		
		//�迭a�� 1,2,3�� ���� �� �迭 ���� ��� ���� 2�� ���� ���� 3,4,5�� ������ ������
		//�迭�� ������ ȭ�鿡 ����ϴ� �������� �ڵ带 �����Ͽ� ����.
		int a[] = {1, 2, 3};
		for(int i=0; i<3; i++) {
			a[i] += 2;
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n");
		
		
		//�迭a[10]�� 3�� ����� ���� ������ �迭�� ������ ���
		int a1[] = new int[10];
		
		for(int i=0; i<10; i++) {
			a1[i] = (i + 1) * 3;
			System.out.print("[" + a1[i] + "]");
		}
		
		System.out.println("\n");
		
		
		
		
		
		//�迭a[100]�� 1���� 100������ ���ڸ� ������� ���� ���� �迭�� �ε����� ¦���� ���� ���
		int a2[] = new int[100];
		for(int i=0; i<a2.length; i++) {
			a2[i] = i + 1;
			if ( a2[i]%2 == 0) {
				System.out.print("[" + a2[i] + "]");
			}
		}
		
		System.out.println("\n");
		
		
		
		//�迭a[]={12,1,5,3,6,8,5,3}�� ���� ������ �迭�� ��� ������ ���� ���� sum�� �����Ͽ� ���
		int a3[] = {12, 1, 5, 3, 6, 8, 5, 3};
		int sum = 0; 
		
		for(int i=0; i<a3.length; i++) {
			sum += a3[i];
		}
		System.out.print("sum = " + sum);
		
		System.out.println("\n");
		
		
		
		//a[]={12,1,5,3,6,8,5,3}�� a�迭���� �迭 ���� ���ڰ� ¦���� 12,6,8�� ���� ���� ��� ���� ���
		int a4[] = {12, 1, 5, 3, 6, 8, 5, 3};
		int sum1 = 0;
		
		for(int i=0; i<a4.length; i++) {
			if(a4[i]%2 == 0) 
				sum1 += a4[i];	
		}
		System.out.print(sum1);
		
		System.out.println("\n");
		
		
		
		//a[]={12,1,51,3,6,8,5}�� a�迭���� ���� ū ���� ���� ���� ���� ���Ͽ� ���
		int a5[] = {12, 1, 51, 3, 6, 8, 5};
		int i = 0;
		int max = a5[i];
		int min = a5[i];
		
		for(i=0; i<a5.length; i++) {
			if (max < a5[i]) {
				max = a5[i];
			}
			if (min > a5[i]) {
				min = a5[i];
			}
		}
		System.out.print("���� ū �� " + max + " + ���� ���� �� " + min + " = " + (max+min));

		
		
		
		
		
		
		
		
		
		
		
		
}
}
