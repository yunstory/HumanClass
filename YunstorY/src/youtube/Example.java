package youtube;

public class Example {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		
		
		
		//뭔진 모르겠는데 신기하네 
		// 반복되는 구간을 찾기 ! 총a줄 b공백 c개의 *
		
		for(int a=1; a<=5; a++) {

			for(int c=a; c<=5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=1; a<=5; a++) {

			for(int c=1; c<=a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=1; a<=5; a++) {
			for(int b=a; b<=5; b++) {
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=1; a<=5; a++) {
			for(int b=0; b<=a-1; b++) {
				System.out.print(" ");
			}
			for(int c=a; c<=5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		for(int k=1;k<10;k++) { 

	        for(int i=1;i<10;i++) {

	             for(int j=k;j<k+3;j++) {

	                   int sum=i*j;

	                   System.out.print(j+" × "+i+" = "+sum);

	                   System.out.print("\t\t");

	             }

	             System.out.println();

	         }

	         System.out.println("\n");

	         k+=2;

	 }	

		*/
	}

}
