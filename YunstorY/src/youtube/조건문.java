package youtube;
import java.util.Scanner;
public class ���ǹ� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inputScore");
		int score=Integer.parseInt(scanner.nextLine());
		
		
		if(score>=90) {
			System.out.println("score=100~90");
			System.out.println("grade=A");
		}else if(score>=80) {
			System.out.println("score=80-89");
			System.out.println("grade=B");
		}else if(score>=70) {
			System.out.println("score=70-79");
			System.out.println("grade=C");
		}else {
			System.out.println("score=70 under");
			System.out.println("grade=D");
		}
		
		
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		// if-else if-else ���� �ֻ���
		
		
		
		int num = (int)(Math.random()*6) + 1; 
		// random=0.0�� ������ ���� ���� ��Ÿ��. ������ ����� ���� ���� int ���� 
		// *6�� �ϸ� 0~5(0,1,2,3,4,5=6��)���� ��� �ֻ��� ������ 0�� ������ �ڿ� +1�� ���ָ� 1~6��(6��) ���
		
		if(num == 1) {
			System.out.println("num=1");
		}else if(num == 2){
			System.out.println("num=2");
		}else if(num == 3){
			System.out.println("num=3");
		}else if(num == 4){
			System.out.println("num=4");
		}else if(num == 5){
			System.out.println("num=5");
		}else {
			System.out.println("num=6");
		}
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		
		
		// switch ���� �ֻ���
		
		int numb = (int)(Math.random()*6) + 1; 
		
		switch(numb) {
			case 1:
				System.out.println("num=1");
				break;
			case 2:
				System.out.println("num=2");
				break;
			case 3:
				System.out.println("num=3");
				break;
			case 4:
				System.out.println("num=4");
				break;
			case 5:
				System.out.println("num=5");
				break;
			default:
				System.out.println("num=6");
				break;
				
		}
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		
		// break���� switch�� 
		
		int time = (int)(Math.random()*4)+8;
		System.out.println("[����ð�:" + time + "��]" );
		
		switch(time) {
		case 8:
			System.out.println("go to the home");
		case 9:
			System.out.println("lunch time");
		case 10:
			System.out.println("bathroom time");
		default:
			System.out.println("go to bed");
			
			//break�� ���ٸ� ����� ~ �Ʒ������ ��θ� ��� (�� ����� ��)
		}
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		// switch ���� 
		
		char grade = 'B';
		
		switch(grade) {
		case 'A': // A���� ���� ������ A�� ������ �ȴٸ� a�� �Ȱ��� ��°��� ���� �� ���
		case 'a':
			System.out.println("good");
			break;
		case 'B': // B���� ���� ������ b�� ���� ��� ���� ���� �� ��� 
		case 'b':
			System.out.println("middle");
			break;
		default:
			System.out.println("bad");
		}
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		// switch ���� 
		
		String position = "����";
		
		switch(position) {
		case "����":
			System.out.println("700$");
			break;
		case "����":
			System.out.println("500$");
			break;
		default:
			System.out.println("300$");
		}
		
	}
}
