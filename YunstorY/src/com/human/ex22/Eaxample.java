package com.human.ex22;
import com.human.dto.*;


public class Eaxample {

	public static void main(String[] args) {
		
		
		Car c = new Car();
		System.out.println("--------------------------Car");
		
		System.out.println("company : " + c.company);
		System.out.println("model : " + c.model);
		System.out.println("color : " + c.color);
		System.out.println("price : " + c.price +"¿ø");
		

		
		Phone p = new Phone();
		System.out.println("--------------------------Phone");
		
		System.out.println("name : " + p.name);
		System.out.println("mode : " + p.mode);
		System.out.println("color : " + p.color);
		System.out.println("price : " + p.price);
		
		
		Human h = new Human();
		System.out.println("--------------------------Human");
		
		System.out.println("name : " + h.name);
		System.out.println("num : " + h.number);
		System.out.println("age : " + h.age);
		System.out.println("height : " + h.height+"cm");
		
		
		Animal a = new Animal();
		System.out.println("--------------------------Animal");
		
		System.out.println("name : " + a.name);
		System.out.println("age : " + a.age+"¼¼");
		System.out.println("weight : " + a.weight+"kg");
		System.out.println("speed : " + a.speed+"km");
		
		
		
		Milk m = new Milk();
		System.out.println("--------------------------milk1");
		
		System.out.println("taste : " + m.taste+"¸À");
		System.out.println("company : " + m.company);
		System.out.println("price : " + m.price+"¿ø");
		System.out.println("exp : " + m.exp+"±îÁö");
		
		Milk m2 = new Milk();
		System.out.println("--------------------------milk2");
		
		m2.taste = "Banana";

		System.out.println("taste : " + m2.taste+"¸À");
		System.out.println("company : " + m.company);
		System.out.println("price : " + m.price+"¿ø");
		System.out.println("exp : " + m.exp+"±îÁö");
	}

}
