package youtube;
import java.util.Scanner;
public class 조건문 {

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
		
		// if-else if-else 예문 주사위
		
		
		
		int num = (int)(Math.random()*6) + 1; 
		// random=0.0을 포함한 랜덤 값이 나타남. 정수값 출력을 위해 강제 int 변형 
		// *6을 하면 0~5(0,1,2,3,4,5=6개)값을 출력 주사위 값에는 0이 없으니 뒤에 +1을 해주면 1~6값(6개) 출력
		
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
		
		
		
		
		
		
		// switch 예문 주사위
		
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
		
		
		
		
		
		// break없는 switch문 
		
		int time = (int)(Math.random()*4)+8;
		System.out.println("[현재시간:" + time + "시]" );
		
		switch(time) {
		case 8:
			System.out.println("go to the home");
		case 9:
			System.out.println("lunch time");
		case 10:
			System.out.println("bathroom time");
		default:
			System.out.println("go to bed");
			
			//break가 없다면 결과값 ~ 아래결과값 모두를 출력 (전 결과값 ㄴ)
		}
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		// switch 예문 
		
		char grade = 'B';
		
		switch(grade) {
		case 'A': // A값은 따로 없으나 A가 나오게 된다면 a와 똑같은 출력값이 나옴 후 출력
		case 'a':
			System.out.println("good");
			break;
		case 'B': // B값은 따로 없으나 b와 같은 출력 값을 가진 후 출력 
		case 'b':
			System.out.println("middle");
			break;
		default:
			System.out.println("bad");
		}
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		// switch 예문 
		
		String position = "과장";
		
		switch(position) {
		case "과장":
			System.out.println("700$");
			break;
		case "부장":
			System.out.println("500$");
			break;
		default:
			System.out.println("300$");
		}
		
	}
}
