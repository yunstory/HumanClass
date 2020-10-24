package com.human.ex22;

import java.util.Arrays;

import com.human.dto.Human;

public class a1023_2 {

	public static void main(String[] args) {
		
		

		
//		int a[]= {0,1,2,3};
//		int b[];
//		b=a;
//		b[1]=10;
//		System.out.println(a[1]);
//		
//		
//		
//		int c[]= new int[4];
//		for(int i=0; i<a.length; i++) {
//			c[i]=a[i];
//		}
//		
//		c[1]=20;
//		System.out.println(a[1]);
		
		
		
		Human arr1[]= new Human[2];
		arr1[0]=new Human("홍길동",10,155.5);
		arr1[1]=new Human("홍길남",10,155.5);

		Human arr2[]= arr1;
		Human arr3[]= new Human[2];
		for(int i=0; i<arr3.length; i++) {
			arr3[i]=arr1[i];
		}
		//홍길남 나이 10을 20으로 변경해보자
		arr1[1].age=20;
		System.out.println(arr1[1].name);
		System.out.println(arr2[1].name);
		System.out.println(arr3[1].name);
		
		System.out.println(arr1[1].age);
		System.out.println(arr2[1].age);
		System.out.println(arr3[1].age);
		
		System.out.println(arr1[1].height);
		System.out.println(arr2[1].height);
		System.out.println(arr3[1].height);
		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
		
		//arr1과 arr2이 다른 값 //arr3를 변경 
		arr3[0]=new Human();
		arr3[0].name=arr1[0].name;
		arr3[0].age=arr3[0].age;
		arr3[0].height=arr3[0].height;
		
		arr3[1]=new Human();
		arr3[1].name=arr1[1].name;
		arr3[1].age=arr3[1].age;
		arr3[1].height=arr3[1].height;
		
		for(int i=0; i<arr1.length; i++) {
			arr3[i]=new Human();
			arr3[i].name=arr1[i].name;
			arr3[i].age=arr3[i].age;
			arr3[i].height=arr3[i].height;
		}
		
		arr3[1].age=99;
//		arr3[1].age arr3[1].age는 다른값을 가지게 된다.
		

	}

}
