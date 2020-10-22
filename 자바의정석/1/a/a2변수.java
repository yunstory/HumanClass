package a;

public class a2변수 {

	public static void main(String[] args) {
		
		final int score;
		score = 200;
		
		System.out.println(score);
		
		boolean power = true;
		System.out.println(power);
		
		
		byte b = 127; 
		System.out.println(power);
		
		int oct = 010; 
		int hex = 0x10;
		System.out.println(power);
		
		System.out.println("--------------------------1");
		
		long l = 10_000_000_000L;
		
		float f = 3.14f;
		double d = 3.14f;
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		System.out.println();
		
		
		char ch = 'A'; 
		System.out.println(ch);
		int i = 'A';
		System.out.println(i);
		System.out.println();
		
		
		String str ="";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		System.out.println();
		
		
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		
		System.out.println("--------------------------2");
		
		int x = 4, y = 2;
		int tmp; 
		System.out.println("x=" + x );
		System.out.println("y=" + y );
		
		
		tmp = x; 
		x = y; 
		y = tmp;
		
		System.out.println("x=" + x );
		System.out.println("y=" + y );
		
		
		System.out.println("--------------------------3");
		
		System.out.println(10/3); // 정수 / 정수 => 정수
		System.out.println(10.0/3);
		System.out.println();
		
		
		System.out.println("--------------------------4");
		
		
		System.out.printf("%d",15);
		System.out.printf("%o",15);
		System.out.printf("%x",15);
		System.out.println();
		
		System.out.printf("%d%n",15);
		System.out.printf("%o%n",15);
		System.out.printf("%x%n",15);
		System.out.println();
		
		System.out.printf("%d%n",15);
		System.out.printf("%#o%n",15);
		System.out.printf("%#x%n",15);
		System.out.println();
		
		System.out.printf("%s",Integer.toBinaryString(15));
		System.out.println();
		
		float f1 = 123.456789f; 
		System.out.printf("%f%n", f1);
		System.out.println();
		
		double f2 = 123.456789; 
		System.out.printf("%f%n", f2);
		System.out.printf("%e%n", f2);
		System.out.printf("%g%n", f2);
		System.out.println();
		
		
		System.out.println("--------------------------5");
		
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		System.out.printf("[%5d]%n", 10);
		System.out.println();
		
		double d1 = 1.23456789;
		System.out.printf("%f%n", d1);
		System.out.printf("%.3f%n", d1);
		System.out.printf("%14.6f%n", d1);
		System.out.println();
		
		System.out.printf("[%s]%n", "www.naver.com");
		System.out.printf("[%20s]%n", "www.naver.com");
		System.out.printf("[%-20s]%n", "www.naver.com");
		System.out.printf("[%.10s]%n", "www.naver.com");
		System.out.println();
		
		
		System.out.println("--------------------------6");
		
		
                             
	}

}
