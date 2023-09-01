package ch06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		//객체 생성
		Calculator cal = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = cal.areaRectangle(10);
		System.out.println(result1);
		
		//직사각형의 넓이 구하기
		double result2 = cal.areaRectangle(10, 20);		
		System.out.println(result2);
		
	}

}
