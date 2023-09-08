package jbjb.circle;

public class Circle {
	//다음은 원을 나타내는 클래스 Circle
	
	private double radius;
	private final static double PI = 3.141592;
	private double height;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//생성자 구현
	public Circle(double radius, double height) {
		this.radius =radius;
		this.height = height;
	}
	
	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return radius * radius * PI;
	}
	
	public double getVolume() {
		 return getArea() * height;
	}
	
}
