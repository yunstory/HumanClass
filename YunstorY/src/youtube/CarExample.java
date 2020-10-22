package youtube;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed); //car속성에서 따로 speed 값을 저장 안 했기에 0 
		
		myCar.speed = 60; // 속성값 변경 할 때에는 
		System.out.println("\n수정된속도: " + myCar.speed);
	}

}
