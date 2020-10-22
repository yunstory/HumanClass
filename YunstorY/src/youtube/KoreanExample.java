package youtube;

public class KoreanExample {

	public static void main(String[] args) {
		
		
		Korean k1 = new Korean("박자바", "0123456-789654");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		System.out.println(" ----- ");
		
		
		Korean k2 = new Korean("이자바", "9876543-123456");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);

	}

}
