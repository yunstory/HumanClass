package com.human.ex22;
import java.util.Arrays;

import com.human.dto.*;

public class a1023 {
	public static void main(String[] args) {
		
//		int arr[] = new int[3];
		int arr1[]= {1,2,3};
		
		// []�ּҿ����� 
		arr1[1]=5;
		System.out.println(arr1[1]);
		
		
		System.out.println("-----------------------------");
		
		
//		double arr2[] = new double[4];
		double arr2[]= {1.1,2.1,3.1,4.1};
		arr2[0]=1.1;
		System.out.println(arr2[0]);
		
		
		System.out.println("-----------------------------");
		
		
		
//		String arr3[] = new String[];
		String arr3[] = {"������","�����","�ܽ���"};
		arr3[2]="ȣ����";
		//String arr = new String("������")
		System.out.println(arr3[2]);
		
		
		System.out.println("-----------------------------");
		
		
		
		Human arr4[]=new Human[3];
		//������ �� �ִ� ������ 3�� 
		arr4[0]=new Human();
		arr4[0].name="yuns";
		arr4[0].age=10;
		arr4[0].height=154.1;
		
		arr4[1]=new Human();
		arr4[1].name="ȫ�浿";
		arr4[1].age=15;
		arr4[1].height=154.1;
		
		arr4[2]=arr4[0];
		
		
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		System.out.println(arr4[0]);
		System.out.println(Arrays.toString(arr4));
		
		
		arr4[1].name="ȫ�浿";
		arr4[1].age=15;
		arr4[1].height=154.1;
		System.out.println(arr4[0]==arr4[1]);
		System.out.println(arr4[0].equals(arr4[1])); //equals �޼ҵ� ������(?)
		
		
//		arr4[0]=new Human();
//		arr4[0].name="yuns";
//		arr4[0].age=10;
//		arr4[0].height=154.1;
		//�ٿ������� �������Լ�
		arr4[0]=new Human("ȫ�浿",15,154.1);
		System.out.println(arr4[0]);
		
		System.out.println(arr4[0]==arr4[1]);//���� ������ �ּҴ� �ٸ��⿡ false�� ��� �� 
		System.out.println(arr4[0].equals(arr4[1]));
		
		
		
		
		
		
		
		
		
		System.out.println("-----------------------------");
		String str1="ȫ�浿";
		String str2="ȫ�浿";
		String str3=new String("ȫ�浿");
		String str4=new String("ȫ�浿");
		
		if(str1==str2) {
			System.out.println("str1==2�� ����.");
		}
		if(str1==str3) {
			System.out.println("str1==3�� ����.");
		}
		if(str1.equals(str2)) {
			System.out.println("str1 equal 2�� ����.");
		}
		if(str1.equals(str3)) {
			System.out.println("str1 equal 3�� ����.");
			}
		if(str3==str4) {
			System.out.println("str3==4�� ����.");
		}
		if(str3.equals(str4)) {
			System.out.println("str3 equal 4�� ����.");
		}
		
	}

}
