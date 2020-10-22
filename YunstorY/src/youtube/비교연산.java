package youtube;

import java.util.Scanner;

public class 비교연산 {
	
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		
		int x = 10;
		int y = 10; 
		int z; 
		
		System.out.println("--------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		
		System.out.println("--------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		
		System.out.println("--------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------");
		z = ++x + y++;
		
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		
		
		//논리부정연산은 boolean연산에서만 사용 가능 
		
		
		boolean play = true; 
		System.out.println(play);
		
		play = !play; 
		System.out.println(play);
		
		play = !play; 
		System.out.println(play);
		
		
		// 산술연산 
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		int v1 = 5;
		int v2 = 2; 
		
		int result1 = v1 + v2; 
		System.out.println(+result1);
		
		int result2 = v1 - v2; 
		System.out.println(+result2);
		
		int result3 = v1 * v2; 
		System.out.println(+result3);
		
		int result4 = v1 / v2; 
		System.out.println(+result4);
		//답은 2.5이지만 정수변수 int 줬기 때문에 소숫점을 지우고 2까지만 출력 
		
		int result5 = v1 % v2; 
		System.out.println(+result5);
		
		double result6 = (double) v1 / v2; 
		System.out.println(+result6);
		//답은 2.5 변수double실수 값을 줬기에 2.5 출력
		
		
		// 문자열연산 
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		String str1 = "JDK" + 6.0; 
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; 
		String str4 = 3 + 3.0 + "JDK"; 
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		
		
		
		//비교연산자 
	
		
		int v10 = 1; 
		double v11 = 1.0; 
		System.out.println(v10 == v11);
		
		double v12 = 0.1; 
		float v13 = 0.1f;
		System.out.println(v12 == v13);
		System.out.println((double)v13);
		//같지 않은 이유는 float를 double값으로 변경해보면 알 수 있음
		System.out.println(v12 == (double)v13);
		//float값을 double값으로 변경해서 비교연산 한 값 
		System.out.println((float)v12 == v13);
		//double값을 float값으로 변경해서 비교연산 한 값 
		System.out.println((int)(v12*10) == (int)(v13*10));
		//double 값과 float 값을 정수int로 변경해서 비교한값 
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		
		
		
		//삼항비교연산자

	
		System.out.print("score=");
		int score=Integer.parseInt(scanner.nextLine());
		

		char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다");
		
		
		
		
		
		
		
		
		
		
		
		}

}