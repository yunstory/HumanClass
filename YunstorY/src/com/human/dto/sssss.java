package com.human.dto;

public class sssss {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//1번
//		int a = 2;
//		int b = 1;
//		b++;
//		
//		while(b<15) {
//			a += 1;
//			b += a;
//		}
//		System.out.println("a 값 : " + a + " b값 : " + b);
//		
//
//		for(b++; b<15; b+=a) {
//			
//		}
//		System.out.println("a 값 : " + a + " b값 : " + b);
		
		//2번 

		
//		for(int i=1; i<=100; i++) {
//			System.out.print(i+"의 약수:");
//			for(int j=1; j<=i; j++) {
//				if(i%j==0) {
//					System.out.print(j+",");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		//3번 
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자입력");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i;
//		
//		System.out.print("둘의 공통된 약수:");
//		for(i=1; i<=100; i++) {
//			if(a%i==0&&b%i==0) {
//				System.out.print(i+" ");
//			}
//			
//		}
		
		//쌤풀이 
		
//		int a=10;
//		int b=20;
//		int i=1;
//		
//		
//		for(i=0; i<a; i++) {
//		if(a%i==0) { // 나눠서 0 이면 약수
//			System.out.println(i);
//			}
//		}
//		
//		for(i=0; i<b; i++) {
//		if(b%i==0) { // 나눠서 0 이면 약수
//			System.out.println(i);
//			}
//		}
//		
//		//공약수
//		
//		int ab=a<b?a:b; //삼항연산자 ?앞이 true 이면 a: ?앞이  false이면 :b 값이 나옴
//		for(i=1; i<=ab; i++) {
//			if(a%i==0 && b%i==0) {
//				System.out.println(i);
//			}
//		}
//		
//		
//		
//		//제일 큰 값만 나오게 하는 법 마지막 값을 찍으면 됨
//		
//		int ab=a<b?a:b; 
//		int max=1;
//		for(i=1; i<=ab; i++) {
//			if(a%i==0 && b%i==0) {
//				max=i;
//				System.out.println(i);
//			}
//		}
//		System.out.println(max);
		
		

		
		//4번
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자입력");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i;
//		
//		for(i=a; i>0; --i) {
//			if(a%i==0 && b%i==0) {
//				System.out.print("최대 공약수"+i);
//				break;
//			}
//		}
		
		
		//5번
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		int sum=0;
//		
//		for(int i=a; i<=100; i++) {
//			sum += i;
//			if(sum>100)
//				break;
//			System.out.println(sum);
//			
//		}
		
		
		//6번
//		int count=0, missCount=0, sum=0;
//		
//		for(int i=1; i<=3; i++) {
//			System.out.println("세 번의 숫자입력");
//			int a=Integer.parseInt(sc.nextLine());
//			if(1<=a && a<=10) {
//				count++;
//				sum += a;
//			}else {
//				missCount++;
//			}
//		}
//		System.out.println("잘못입력한 수 : "+missCount+" /올바른입력 수 : "+count+" /올바른 입력 수의 총합 : "+sum);

		
		
		//7번
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자입력");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int num=0;
//		
//		for(int i=a; i<=a*b; i++) {
//			if(i%a==0 && i%b==0) {
//				num=i;
//				break;
//			}
//		}
//		System.out.println("최소 공배수: " + num);
		
		//쌤풀이
//		//2 의 배수구하기 i가 2의 배수인지 판별하면서 i를 증가해보기
//		int result=0;
//		for(int i=1; i<100; i++) {
////			if(i%2==0) {
////				System.out.println(i);
////			}
////			if(i%3==0) {
////				System.out.println(i);
////			}
//			
////			if(i%2==0||i%3==0) {
////				System.out.println(i);
////			}
//			
//			if(i%2==0&&i%3==0) {
//				result=i;
//				System.out.println(i);
//				break;
//			}
//		}
//		System.out.println(result);
		
		
		//8번
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자입력");
//		int b = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자입력");
//		int c = Integer.parseInt(sc.nextLine());
//		
//		int max,min;
//		
//		if (a>b){
//			max=a;
//			min=b;
//		}else {
//			max=b;
//			min=a;
//		}
//		if(max>c) {
//			max=max;
//			min=c;
//		}else {
//			max=c;
//			min=min;
//		}
//		
//		System.out.println("가장 큰 수 는 : " + max + " 가장 작은 수 : " + min);

		
		
		//9번
		//쌤풀이
		
//		int failCount=0; //탈락자 수
//		
//		for(int i=0; i<5; i++) {
//			int input = Integer.parseInt(sc.nextLine());
//			if(input<=100) {
//				if(input<=60) {
//					failCount++;
//				}
//			}else {
//				i--;
//			}
//			
//		}
//		System.out.println(failCount);
		
		
		//10번
		//쌤풀이
//		int sum=0;
//		for(int i=0; sum<100; i++) {
//			if(sum<100) {
//				sum += i;
//				if(sum>100) {
//					break;
//				}
//				System.out.println(i+":"+sum);
//			}
//		}
		
		
		
		//11번
		
//		System.out.print("문자열입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자입력");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i=0;
//		
//		while(i<a) {
//			System.out.println(b);
//			i++;
//		}


		
		
		//12번
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자입력");
//		int b = Integer.parseInt(sc.nextLine());
//		int sum=0;
//		if(a>=b) {
//			int i=b+1;
//			while(i>b && i<a) {
//				sum += i;
//				i++;
//			}
//		}else {
//			int i=a+1;
//			while(i>a && i<b) {
//				sum += i;
//				i++;
//			}
//		}
//		System.out.println("두수의 합:" + sum);

		
		
		//13번
		
		
		
		//14번
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자입력");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i,count=0;
//		
//		
//		
//		for(i=a; i<=count; i++) {
//			
//		}


		
		//15번
//		System.out.print("1-9 중 선택");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		for(int i=a; i<=a; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.print(i+"*"+j+"="+(i*j)+" ");
//			}
//			System.out.println();
//		}
		
		
		//16번
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		int count=0;
//		
//		
//		for(int i=1; i<=1000; i++) {
//			if(i%a==0) {
//				System.out.println(i);
//				count++;
//		}
//			
//		}
//		System.out.println(a + "의 배수 개수는 " + count + "개");
		
		
		//17번
//		System.out.print("행입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("열입력");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i,j,k=1;
//		
//		for( i=1; i<=a; i++) {
//			for( j=1; j<=b; j++) {
//				System.out.print(k+"\t");
//				k++;
//				if(k>100) {
//					break;
//				}
//			}
//			System.out.println();
//		}
//		

		//18번
		
//		int i,j,k=1;
//		for(i=1; i<=4; i++) {
//			if(i==1) {
//				for(j=1; j<=5; j++) {
//				System.out.print(k+"\t");
//				k++;
//				}
//			}else if(i==2) {
//				k=10;
//				for(j=1; j<=5; j++) {
//					System.out.print(k+"\t");
//					k--;
//				}
//			}else if(i==3) {
//				k=11;
//				for(j=1; j<=5; j++) {
//					System.out.print(k+"\t");
//					k++;
//					}
//			}else if(i==4) {
//				k=21;
//				for(j=1; j<=5; j++) {
//					System.out.print(k+"\t");
//					k++;
//				}
//			}
//			System.out.println();
//		}
		
		//쌤풀이
//		int count=5;
//		int lineCount=0;
//		int total=25;
////		for(int i=1; i<=25; i++) {
////			if(i%5==1) {
////				System.out.print(i+"\t");
////			}else {
////				System.out.print(i+"\t");
////			}
////			if(i%5==0) {
////				System.out.println();
////			}
////		}
//		for(int i=1; i<=total+1; i++) {
//			if(i%count==1) {
//				lineCount++;
//			}
//			if(lineCount%2==0) {
//				System.out.print(count*lineCount-(i-1)%5+"\t");
//			}else {
//				System.out.print(i+"\t");
//			}
//			if(i%count==0) {
//				System.out.println();
//			}
//		}
		
		
		//19번
		
//		System.out.print("요일 입력 (일~토) : ");
//		String days=sc.nextLine();
//		System.out.print("마지막 일 입력 (~31): ");
//		int last=Integer.parseInt(sc.nextLine());
//		int day;
//		
//		
//		System.out.println();
//		System.out.print("일\t월\t화\t수\t목\t금\t토");
//		System.out.println();
//		
//		switch(days) {
//		case "일":
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if(day%7==0)
//				System.out.println();
//			}
//			break;
//		case "월":
//			System.out.print("\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+1)%7==0)
//				System.out.println();
//			}
//			break;
//		case "화":
//			System.out.print("\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+2)%7==0) 
//				System.out.println();
//			}
//			break;
//		case "수":
//			System.out.print("\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+3)%7==0) 
//				System.out.println();
//			}
//			break;
//		case "목":
//			System.out.print("\t\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+4)%7==0) 
//				System.out.println();
//			}
//			break;
//		case "금":
//			System.out.print("\t\t\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+5%7)==0)
//				System.out.println();
//			}
//			break;
//		case "토":
//			System.out.print("\t\t\t\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+6)%7==0)
//				System.out.println();
//			}
//			break;
//		default:
//			System.out.print("입력 오류");
//		}
		
		//20번 
//		int right=0;
//		int wrong=0;
//
//		while(true) {
//		System.out.print("선택(0.앞면 1.뒷면 3.종료) : ");
//		int or=Integer.parseInt(sc.nextLine());
//		int coin = (int)(Math.random()*2);
//		if(or==coin) {
//			right++;
//		}else {
//			wrong++;
//		}
//		if(or==3) {
//		System.out.print("총"+(right+wrong)+"번의 게임 중  맞춘횟수:"+right+"틀린횟수:"+wrong);
//			break;
//		}
//		System.out.println("결과 / 내 선택:"+or+" 컴퓨터 값:"+coin+" 맞춘횟수 : "+right+", 틀린횟수 : "+wrong+" /총 게임 실행 횟수:"+(right+wrong)+"\n");
//		}

		//21번
		
//		int right=0;
//		int wrong=0;
//		
//		
//		
//
//		while(true) {
//			System.out.print("주사위 값 입력 / 7.종료 : ");
//			int die=Integer.parseInt(sc.nextLine());
//			
//			int dice = (int)(Math.random()*6)+1;
//			
//			if(die==dice) {
//				right++;
//			}else {
//				wrong++;
//			}
//			if(die==7) {
//				System.out.print("총"+(right+wrong)+"번의 게임 중 맞춘횟수 : "+right+"  틀린횟수 : "+wrong);
//				break;
//			}
//			System.out.println("결과 / 내 주사위:"+die+" 컴퓨터 주사위:"+dice+" 맞춘횟수 : "+right+", 틀린횟수 : "+wrong+" /총 게임 실행 횟수:"+(right+wrong)+"\n");
//			
//			
//		}
	
		
	}

}