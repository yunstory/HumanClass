package com.human.ex;

//����� ���� ������ Ŭ���� ���� 
class Human��{
	//public ��𼭵� ȣȯ
		public String name = "";
		public int age = 0;
		public double height = 0;
}

public class Story_20_1 {
	public static void main(String[] args) {
		
		
		
		// ����� ���� Ŭ���� ����
		Human�� h1 = new Human��();
		// Ŭ������ ������ �� �Ҵ�
		h1.name = "yuns";
		h1.age = 23;
		h1.height = 154.7;
		
		//Ŭ������ ������ ���
		System.out.println("name:" + h1.name);
		System.out.println("age:" + h1.age);
		System.out.println("height:" + h1.height);
		
		
		System.out.println();
		
		
		
		
		Human�� h2 = new Human��();
		// Ŭ������ ������ �� �Ҵ�
		h2.name = "yunz";
		h2.age = 24;
		h2.height = 168;
		
		//Ŭ������ ������ ���
		System.out.println("name:" + h2.name);
		System.out.println("age:" + h2.age);
		System.out.println("height:" + h2.height);
		
	}

}
