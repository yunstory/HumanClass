package youtube;

import java.util.Scanner;

public class �񱳿��� {
	
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
		
		
		
		
		
		
		//������������ boolean���꿡���� ��� ���� 
		
		
		boolean play = true; 
		System.out.println(play);
		
		play = !play; 
		System.out.println(play);
		
		play = !play; 
		System.out.println(play);
		
		
		// ������� 
		
		
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
		//���� 2.5������ �������� int ��� ������ �Ҽ����� ����� 2������ ��� 
		
		int result5 = v1 % v2; 
		System.out.println(+result5);
		
		double result6 = (double) v1 / v2; 
		System.out.println(+result6);
		//���� 2.5 ����double�Ǽ� ���� ��⿡ 2.5 ���
		
		
		// ���ڿ����� 
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		String str1 = "JDK" + 6.0; 
		String str2 = str1 + "Ư¡";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; 
		String str4 = 3 + 3.0 + "JDK"; 
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		
		
		
		//�񱳿����� 
	
		
		int v10 = 1; 
		double v11 = 1.0; 
		System.out.println(v10 == v11);
		
		double v12 = 0.1; 
		float v13 = 0.1f;
		System.out.println(v12 == v13);
		System.out.println((double)v13);
		//���� ���� ������ float�� double������ �����غ��� �� �� ����
		System.out.println(v12 == (double)v13);
		//float���� double������ �����ؼ� �񱳿��� �� �� 
		System.out.println((float)v12 == v13);
		//double���� float������ �����ؼ� �񱳿��� �� �� 
		System.out.println((int)(v12*10) == (int)(v13*10));
		//double ���� float ���� ����int�� �����ؼ� ���Ѱ� 
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		
		
		
		//���׺񱳿�����

	
		System.out.print("score=");
		int score=Integer.parseInt(scanner.nextLine());
		

		char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C');
		System.out.println(score + "����" + grade + "����Դϴ�");
		
		
		
		
		
		
		
		
		
		
		
		}

}