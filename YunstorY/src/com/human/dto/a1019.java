package com.human.dto;

public class a1019 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		
		
		
		//1����ڿ��� ���5 Ȥ�� ����5�� �Է� �޾� ���� ���� ���
		
		int k=-5;
		if(k<0) {
			System.out.println("���밪:" + k*-1);
		}else {
			System.out.println("���밪:" + k);
		}
		
		
		System.out.println();
		System.out.println();
		
		
		//2�μ��� �Է¹޾� ������ �ƴϸ� ū�� ������
		int a=1;
		int b=2;
		if(a==b) {
			System.out.println("���� ��");
		}else if(a < b) {
			System.out.println("b��ŭ");
		}else if(a > b) {
			System.out.println("a��ŭ");
		}
		
		System.out.println();
		System.out.println();
		
		
		//3 100��2�γ�����0 = 2�� 100�� ��� / 126�� �Է¹޾� ������� ���
		int q=1000;
		if(q/126==0) {
			System.out.println("���");
		}else {
			System.out.println("����ƴ�");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		//4 ���������� ����� 80�̻��̸� �հ� ���ϸ� ���հ�
		
		int l = 50;
		int m = 60;
		int n = 70;
		int avg=(l+m+n)/3;
		
		if(avg<80) {
			System.out.println("���հ�");
		}else {
			System.out.println("�հ�");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		//5 �Է¼��� 5�����̸� x+15 �ʰ��̸�  x+5 
		int x=5; 
		if( x<5 ) {
			System.out.println(x += 15);
		}else {
			System.out.println(x += 5);
		}
		
		System.out.println();
		System.out.println();
		
		//3�ǹ��||7�ǹ�� 2�ǹ��||5�ǹ�� 
		
		int qw=456; 
		if(qw%3==0||qw%7==0)
			System.out.println("3�Ǵ� 7�� ���");
		if(qw%2==0&&qw%5==0) 
			System.out.println("2�� 5�� ���");
		if((qw%3==0||qw%7==0)&&(qw%2==0&&qw%5==0))
			System.out.println("�ΰ��� ��� �� ����");
		
		
		System.out.println();
		System.out.println();
		
		
		//������� ????
		Boolean card= Boolean.parseBoolean("true");
		int age=20;
		
		if(age<=15 && card==true){
			System.out.println("1200��");
		}else if(age<=15 && card==false) {
			System.out.println("1300��");
		}else if(age>=15 && card==true) {
			System.out.println("1500��");
		}else if(age>=15 && card==false) {
			System.out.println("1600��");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		
		//�񸸵� 	
		System.out.print("age:");
		int agee = sc.nextInt();
		System.out.print("kg:");
		double kg = sc.nextDouble();
		System.out.print("cm:");
		double cm = sc.nextDouble();
		double bmi=(kg*100)/((cm-100)*0.9);
		
		if(age<20) {
			System.out.println("���߰���");
			if(bmi<95) {
				System.out.println("ü�߹̴�");
			}else if(95<=bmi&&bmi<=120) {
				System.out.println("����");
			}else if(120<=bmi&&bmi<=130) {
				System.out.println("�浵��");
			}else if(130<=bmi&&bmi<=150) {
				System.out.println("�ߵ���");
			}else if(150<=bmi)
				System.out.println("����");
		}else {
			System.out.println("����");
			if(bmi<100) {
				System.out.println("ü�߹̴�");
			}else if(100<=bmi&&bmi<=110) {
				System.out.println("����");
			}else if(110<=bmi&&bmi<=120) {
				System.out.println("�浵��");
			}else if(120<=bmi&&bmi<=150) {
				System.out.println("�ߵ���");
			}else if(150<=bmi)
				System.out.println("����");
		}
		
		
		
		System.out.println();
		System.out.println();
		
		int dd=1500;
		
		if(1400<=dd&&dd<=1800) {
			System.out.println("1400�̻�1800����");
		}else {
			System.out.println("1400�̻�1800���� �ƴ�");
		}

		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
