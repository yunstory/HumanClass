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
		a[5] = 0; // 5는 못들어감 5개 = 0부터 시작해서 4까지
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
		
		//배열a에 1,2,3을 넣은 후 배열 내의 모든 값에 2를 더한 값인 3,4,5로 변경한 다음에
		//배열의 내용을 화면에 출력하는 순서도와 코드를 구현하여 보자.
		int a[] = {1, 2, 3};
		for(int i=0; i<3; i++) {
			a[i] += 2;
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n");
		
		
		//배열a[10]에 3의 배수를 넣은 다음에 배열의 내용을 출력
		int a1[] = new int[10];
		
		for(int i=0; i<10; i++) {
			a1[i] = (i + 1) * 3;
			System.out.print("[" + a1[i] + "]");
		}
		
		System.out.println("\n");
		
		
		
		
		
		//배열a[100]에 1부터 100까지의 숫자를 순서대로 넣은 다음 배열의 인덱스가 짝수인 값만 출력
		int a2[] = new int[100];
		for(int i=0; i<a2.length; i++) {
			a2[i] = i + 1;
			if ( a2[i]%2 == 0) {
				System.out.print("[" + a2[i] + "]");
			}
		}
		
		System.out.println("\n");
		
		
		
		//배열a[]={12,1,5,3,6,8,5,3}를 만든 다음에 배열의 모든 내용을 더한 값을 sum에 저장하여 출력
		int a3[] = {12, 1, 5, 3, 6, 8, 5, 3};
		int sum = 0; 
		
		for(int i=0; i<a3.length; i++) {
			sum += a3[i];
		}
		System.out.print("sum = " + sum);
		
		System.out.println("\n");
		
		
		
		//a[]={12,1,5,3,6,8,5,3}의 a배열에서 배열 안의 숫자가 짝수인 12,6,8의 값을 더한 결과 값을 출력
		int a4[] = {12, 1, 5, 3, 6, 8, 5, 3};
		int sum1 = 0;
		
		for(int i=0; i<a4.length; i++) {
			if(a4[i]%2 == 0) 
				sum1 += a4[i];	
		}
		System.out.print(sum1);
		
		System.out.println("\n");
		
		
		
		//a[]={12,1,51,3,6,8,5}의 a배열에서 가장 큰 값과 가장 작은 값을 더하여 출력
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
		System.out.print("가장 큰 값 " + max + " + 가장 작은 값 " + min + " = " + (max+min));

		
		
		
		
		
		
		
		
		
		
		
		
}
}
