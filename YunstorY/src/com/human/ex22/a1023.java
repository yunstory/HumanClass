package com.human.ex22;
import java.util.Arrays;

import com.human.dto.*;

public class a1023 {
	public static void main(String[] args) {
		
//		int arr[] = new int[3];
		int arr1[]= {1,2,3};
		
		// []주소연산자 
		arr1[1]=5;
		System.out.println(arr1[1]);
		
		
		System.out.println("-----------------------------");
		
		
//		double arr2[] = new double[4];
		double arr2[]= {1.1,2.1,3.1,4.1};
		arr2[0]=1.1;
		System.out.println(arr2[0]);
		
		
		System.out.println("-----------------------------");
		
		
		
//		String arr3[] = new String[];
		String arr3[] = {"강아지","고양이","햄스터"};
		arr3[2]="호랑이";
		//String arr = new String("강아지")
		System.out.println(arr3[2]);
		
		
		System.out.println("-----------------------------");
		
		
		
		Human arr4[]=new Human[3];
		//저장할 수 있는 공간이 3개 
		arr4[0]=new Human();
		arr4[0].name="yuns";
		arr4[0].age=10;
		arr4[0].height=154.1;
		
		arr4[1]=new Human();
		arr4[1].name="홍길동";
		arr4[1].age=15;
		arr4[1].height=154.1;
		
		arr4[2]=arr4[0];
		
		
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		System.out.println(arr4[0]);
		System.out.println(Arrays.toString(arr4));
		
		
		arr4[1].name="홍길동";
		arr4[1].age=15;
		arr4[1].height=154.1;
		System.out.println(arr4[0]==arr4[1]);
		System.out.println(arr4[0].equals(arr4[1])); //equals 메소드 값을비교(?)
		
		
//		arr4[0]=new Human();
//		arr4[0].name="yuns";
//		arr4[0].age=10;
//		arr4[0].height=154.1;
		//줄여쓴버전 생성자함수
		arr4[0]=new Human("홍길동",15,154.1);
		System.out.println(arr4[0]);
		
		System.out.println(arr4[0]==arr4[1]);//값은 같지만 주소는 다르기에 false가 출력 됨 
		System.out.println(arr4[0].equals(arr4[1]));
		
		
		
		
		
		
		
		
		
		System.out.println("-----------------------------");
		String str1="홍길동";
		String str2="홍길동";
		String str3=new String("홍길동");
		String str4=new String("홍길동");
		
		if(str1==str2) {
			System.out.println("str1==2는 같다.");
		}
		if(str1==str3) {
			System.out.println("str1==3는 같다.");
		}
		if(str1.equals(str2)) {
			System.out.println("str1 equal 2는 같다.");
		}
		if(str1.equals(str3)) {
			System.out.println("str1 equal 3는 같다.");
			}
		if(str3==str4) {
			System.out.println("str3==4는 같다.");
		}
		if(str3.equals(str4)) {
			System.out.println("str3 equal 4는 같다.");
		}
		
	}

}
