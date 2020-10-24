package com.human.ex22;

public class a1019 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		
		System.out.println("순서도를 프로그램으로 ");
		
		System.out.println("숫자입력");
		int inputt=Integer.parseInt(sc.nextLine());
		int aaa=11;
		int bbb=14;
		
		if(inputt!=0) {
			aaa=5;
			bbb=aaa+3;
		}
		System.out.println(aaa + "," + bbb);
		
		System.out.println();
		System.out.println();
	
		
		
		System.out.println("1사용자에게 양수5 혹은 음수5를 입력 받아 절대 값을 출력");
		
		int k=-5;
		if(k<0) {
			System.out.println("절대값:" + k*-1);
		}else {
			System.out.println("절대값:" + k);
		}
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("2두수를 입력받아 같은지 아니면 큰지 작은지");
		int a=1;
		int b=2;
		if(a==b) {
			System.out.println("같은 수");
		}else if(a < b) {
			System.out.println("크거나 작음");
		}
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("100을2로나누면0 = 2는 100의 약수 / 126을 입력받아 약수인지 기술"); 
		int q=1000;
		if(q/126==0) {
			System.out.println("약수");
		}else {
			System.out.println("약수아님");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("4 국영수점수 평균이 80이상이면 합격 이하면 불합격");
		
		int l = 50;
		int m = 60;
		int n = 70;
		int avg=(l+m+n)/3;
		
		if(avg<80) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		System.out.println("5 입력수가 5이하이면 x+15 초과이면  x+5");
		int x=5; 
		if( x<5 ) {
			System.out.println(x += 15);
		}else {
			System.out.println(x += 5);
		}
		
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		System.out.println("왼쪽 if문의 출력결과 ");
		boolean b1=5!=3;
		boolean b2=5==3;
		if(b1){
			if(b2) {
				System.out.println("1번");
			}else {
				System.out.println("2번");
			}
		}else {
			System.out.println("3번");
			System.out.println("4번");
		}
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("if심화문제");
		
		
		System.out.println("색칠한부분true");
		int lol=17;
		if( lol > 14) {
			System.out.println(true);
		}
		
		int nn1=10, nn2=25;
		if( nn1 <=12 || nn2<22) { 
			System.out.println(true);
		}
		
		int nn3=7;
		if( 5<nn3 && nn3<=9 ) {
			System.out.println(true);
		}
		
		
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("3의배수||7의배수 2의배수||5의배수"); 
		
		int qw=456; 
		if(qw%3==0||qw%7==0)
			System.out.println("3또는 7의 배수");
		if(qw%2==0&&qw%5==0) 
			System.out.println("2와 5의 배수");
		if((qw%3==0||qw%7==0)&&(qw%2==0&&qw%5==0))
			System.out.println("두가지 경우 다 만족");
		
		
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("x,y축");
		
		
		System.out.print("x:");
		int xxx = sc.nextInt();
		System.out.print("y:");
		int yyy = sc.nextInt();
		
		if(xxx>0&&yyy<0) {
			System.out.println("1번위치");
		}else if(xxx>0&&yyy>0) {
			System.out.println("2번위치");
		}else if(xxx<0&&yyy>0) {
			System.out.println("3번위치");
		}else {
			System.out.println("4번위치");
		}
		
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("버스요금");
		Boolean card= Boolean.parseBoolean("true");
		int age=20;
		card = true;
		
		if(age<=15 && card==true){
			System.out.println("1200원");
		}else if(age<=15 && card==true) {
			System.out.println("1300원");
		}else if(age>=15 && card==true) {
			System.out.println("1500원");
		}else if(age>=15 && card==false) {
			System.out.println("1600원");
		}
		
		
		System.out.println();
		System.out.println();
		
		

		
		
		System.out.println("비만도");	
		
		System.out.print("age:");
		int agee = sc.nextInt();
		System.out.print("kg:");
		double kg = sc.nextDouble();
		System.out.print("cm:");
		double cm = sc.nextDouble();
		double bmi=(kg*100)/((cm-100)*0.9);
		
		if(agee<20) {
			System.out.println("초중고교생");
			if(bmi<95) {
				System.out.println("체중미달");
			}else if(95<=bmi&&bmi<=120) {
				System.out.println("정상");
			}else if(120<=bmi&&bmi<=130) {
				System.out.println("경도비만");
			}else if(130<=bmi&&bmi<=150) {
				System.out.println("중도비만");
			}else if(150<=bmi)
				System.out.println("고도비만");
		}else {
			System.out.println("성인");
			if(bmi<100) {
				System.out.println("체중미달");
			}else if(100<=bmi&&bmi<=110) {
				System.out.println("정상");
			}else if(110<=bmi&&bmi<=120) {
				System.out.println("경도비만");
			}else if(120<=bmi&&bmi<=150) {
				System.out.println("중도비만");
			}else if(150<=bmi)
				System.out.println("고도비만");
		}
		
		
		
		System.out.println();
		System.out.println();
		
		int dd=1500;
		
		if(1400<=dd&&dd<=1800) {
			System.out.println("1400이상1800이하");
		}else {
			System.out.println("1400이상1800이하 아님");
		}

		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
