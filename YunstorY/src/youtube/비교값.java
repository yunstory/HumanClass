package youtube;

import java.util.Scanner;

public class 비교값 {
	
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		

		// 문자열=s 이 오면 비교값은 s.equals("");
		
		String x; 
		
		while(true) {
			x = scanner.nextLine();
			System.out.println("enter:" + x);
			if (x.equals("q")) {
				break;
				
			}
		}
		
		System.out.println("end");
		

		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		
		
		int y; 
		
		while(true) {
			y = System.in.read();
			System.out.println(+y);
			if(y == 113) {
				break;
			}
		}
		
		System.out.println("end");
		
		
	}

}