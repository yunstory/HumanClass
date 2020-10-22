package youtube;

public class 참조변수 {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "hello"; 
		
		
		if(a == b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	

		if(a.equals(b)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		String c = new String("hello");
		String d = new String("hello");
		
		
		
		if(c == d){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//번지비교 같은개체 
		
		
		if(c.equals(d)){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//내부문자열비교 개체는 다르지만 내부문자열은 같음
		
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		
		
		//string null예문 
		
		String hobby = null;
		
		String name = "홍자바";
		name = null; // name에 저장되어있던 '홍자바' 지워짐 
		
		
		
		
		
	}
}
