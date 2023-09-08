package ch07.sec03.exam02;

public class SmartPhone extends Phone {

	//생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color);  
// 부모 생성자가 매개 변수가 있기때문에 명시적으로 super 생성
//		this.model = model;
//		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
	
}
