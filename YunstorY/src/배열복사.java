
public class �迭���� {

	public static void main(String[] args) {
		
		
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++){
			newIntArray[i] = oldIntArray[i];
		}

		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
		
		
		// 
		
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++)
			System.out.println(newStrArray[i] + ",");
		
		
		//
		
		int[] scores = { 95, 71, 84, 93, 87};
		
		int sum = 0; 
		for(int score : scores) {
			sum += score;
		}
		System.out.println("���� ���� = " + sum);
		
		double avg = (double) sum / scores.length; 
		System.out.println("���� ��� = " + avg);
		
		
		
		
		
		}
	}


	
