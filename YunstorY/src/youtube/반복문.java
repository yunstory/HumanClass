package youtube;
import java.util.Scanner;
public class 반복문 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//구구단 만들기 
		
		for(int x=2; x<=9; x++) {
			System.out.println(x + "단");
			for(int y=1; y<=9; y++) {
				System.out.println( x + "x" + y + "=" + (x*y));
			}
		}

		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		// do while 문 
		
		int sum = 0; 
		int i = 1 ; 
		
		do { 
			sum += i;
			i++;
		} while(i <= 100);
		
		System.out.println(+sum);
		
		int sum1 = 0;
		int ii = 1 ; 
		
		while (ii <= 100) {
			sum1 += ii; 
			ii++;
		}
		
		System.out.println(+sum1);
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		//break문 주로 if문과 사용
		
		while(true) {
			int num=(int)(Math.random()*6+1);
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		//break문2 주로if문과 사용 
		
		A:
			for(char upper='A'; upper<='Z'; upper++) {
				for(char lower='a'; lower<='z'; lower++) {
					System.out.println(upper + "-" + lower);
					if(lower=='z') {
						break A;
					}
				}
			}
		System.out.println("프로그램 종료");
		
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		//continue문 while, for문에서만 사용가능 증감식으로 이동 
		
		for(int a=1; a<=10; a++) {
			if(a%2 == 0) {
				continue;
			}
			System.out.println(a);
		}
		
		System.out.print("\n");
		
		for(int b=1; b<=10; b++) {
			if(b%2 != 0) {
				continue;
			}
			System.out.println(b);
		}
		
		
		
		
		
	}
}
