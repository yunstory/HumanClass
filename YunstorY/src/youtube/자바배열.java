package youtube;

public class 자바배열 {

	public static void main(String[] args) {
		
		/*
		int[] scores = {83, 90, 87};
		
		System.out.println("scoren[0]:" + scores[0]);
		System.out.println("scoren[1]:" + scores[1]);
		System.out.println("scoren[2]:" + scores[2]);
		

		int sum = 0; 
		for(int i=0; i<3; i++) { // i<3 을 i<scores.length 로변 경해도 됨 i갯수가 늘어낫을때 수정필요가 없어짐
			sum += scores[i];
		}
		System.out.println("총합" + sum);
		
		double avg = (double) sum / 3; // 소수점을 표현하기위해 sum을 실수로 변화 3대신 scores.length가능
		System.out.println("평균 " + avg); 
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
	
		
		
		
		
		
		/*
		int[] scoress;
		scoress = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int a=0; a<3; a++) {
			sum1 += scoress[a];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합: " + sum2);
	}
	
	public static void main(int[] scores) {
		
		int sum = 0;
		for(int b=0; b<3; b++) {
			sum += scores[b];
		}
		return sum;
		
		
		
		//new연산자 
		
		
		int[] arr1 = new int[3];
		for(int x=0; x<3; x++) {
			System.out.println("arr1[" + x + "] : " + arr1[x]);
		}
		
		arr1[0] = 10; 
		arr1[1] = 20; 
		arr1[2] = 30;
		for(int x=0; x<3; x++) {
			System.out.println("arr1[" + x + "] : " + arr1[x]);
		}
		
		
		System.out.print("\n");
		
		
		double[] arr2 = new double[3];
		for(int x=0; x<3; x++) {
			System.out.println("arr2[" + x + "] : " + arr2[x]);
		}
		
		arr2[0] = 0.1; 
		arr2[1] = 0.2; 
		arr2[2] = 0.3;
		for(int x=0; x<3; x++) {
			System.out.println("arr2[" + x + "] : " + arr2[x]);
		}
		
		
		System.out.print("\n");
		
		
		String[] arr3 = new String[3];
		for(int x=0; x<3; x++) {
			System.out.println("arr3[" + x + "] : " + arr3[x]);
		}
		
		arr3[0] = "가";
		arr3[1] = "나";
		arr3[2] = "다";
		for(int x=0; x<3; x++) {
			System.out.println("arr3[" + x + "] : " + arr3[x]);
		*/	
			
			
			
			
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("\n");	
		
			
		//2차원 배열 
			
			int[][] mathScores = new int[2][3];
			for(int i=0; i<2; i++) {
				for(int k=0; k<3; k++) {
					System.out.println("mathScores[" + i + "][" + k + "]="
							+ mathScores[i][k]);
					
				}
			}
			
			System.out.println();
			
			int[][] englishscores = new int[2][];
			englishscores[0] = new int[2];
			englishscores[1] = new int[3];
			for(int i=0; i<2; i++) {
				for(int k=0; k<englishscores[i].length; k++) {
					System.out.println("englishscores[" + i + "][" + k + "]="
							+englishscores[i][k]);
					
				}
			}
			
			 System.out.println();
			 
			 int[][] javaScores = { {98, 80}, {92, 96, 80} };
			 
			 for(int i=0; i<2; i++) {
				 for(int k=0; k<javaScores[i].length; k++) {
					 System.out.println("javaScores[" + i + "][" + k + "]="
							 +javaScores[i][k]);
					 
				 }
			 }
			
			 
			 
			 
			 
			 
		}
		
	}

