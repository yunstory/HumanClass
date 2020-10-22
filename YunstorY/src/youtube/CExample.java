package youtube;

public class CExample {

	public static void main(String[] args) {
		
		
		C myC = new C();
		
		myC.setGas(5);
		
		boolean gasState = myC.isLeftGas();
		if(gasState) {
			System.out.println("go");
			myC.run();
		}
		
		if(myC.isLeftGas()) {
			System.out.println("gas o ;");
		}else {
			System.out.println("gas x ;");
		}

	}

}
