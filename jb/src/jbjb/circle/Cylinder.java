package jbjb.circle;

public class Cylinder {

	/*
	 문제 - 3. 다음에 구현된 Circle 클래스를 참고로 다음을 만족하는 Cylinder 클래스를 작성하시오.
		· 원통을 나타내는 Cylinder 클래스는 Circle형의 원과 실수형의 높이를 필드로 선언
		· 메소드 getVolume()은 원통의 부피를 반환
		·Cylinder 클래스의 main() 메소드에서 반지름이 2.8, 높이가 5.6의 원통의 부피를 출력
		(원의 면적 x 높이 = 원통의 부피)
	 */
	
	/*
	문제 4 -  위에서 구현한 Cylinder를 다음 조건에 맞도록 기능을 추가하여 작성하시오.
		· 다음과 같은 객체 생성이 가능하도록 생성자를 구현
		ㆍ Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
	 */
	double radius;
	

	
	public static void main(String[] args) {
		
		Circle circle = new Circle(2.8, 5.6);
		System.out.println(circle.getArea());
		System.out.println(circle.getRadius());
		System.out.println(circle.getHeight());
		
		System.out.println(circle.getVolume());
	}
	
	
		
		
	

}
