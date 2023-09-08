package jbjb.rectangle;

public class RectAngle {
/*
문제 - 9. 다음을 만족하는 클래스 Rectangle을 작성하시오.
· 사각형의 가로와 세로로 객체를 생성하는 생성자
· 면적을 반환하는 메소드 getArea(), 둘레를 반환하는 메소드 getCircumference(),
· 다음과 같이 클래스 Rectangle 이용
Rectangle rc = new Rectangle(3.82, 8.65);
System.out.println("면적: " + rc.getArea());
System.out.println("둘레: " + rc.getCircumference());
 */
	
	private double width;
	private double depth;
	private double area;
	private double size;
	
	public RectAngle(double width,double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	public double getArea() {
		area = width * depth;
		return  area;
	}

	public double getSize() {
		size = width*2 + depth*2;
		return size;
	}
	
	
	
}
