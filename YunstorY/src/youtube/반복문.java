package youtube;
import java.util.Scanner;
public class �ݺ��� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//������ ����� 
		
		for(int x=2; x<=9; x++) {
			System.out.println(x + "��");
			for(int y=1; y<=9; y++) {
				System.out.println( x + "x" + y + "=" + (x*y));
			}
		}

		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		// do while �� 
		
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
		
		
		
		
		//break�� �ַ� if���� ���
		
		while(true) {
			int num=(int)(Math.random()*6+1);
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		
		System.out.println("���α׷� ����");
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		//break��2 �ַ�if���� ��� 
		
		A:
			for(char upper='A'; upper<='Z'; upper++) {
				for(char lower='a'; lower<='z'; lower++) {
					System.out.println(upper + "-" + lower);
					if(lower=='z') {
						break A;
					}
				}
			}
		System.out.println("���α׷� ����");
		
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		//continue�� while, for�������� ��밡�� ���������� �̵� 
		
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
