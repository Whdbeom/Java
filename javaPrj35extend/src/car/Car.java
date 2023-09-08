package car;

public class Car {

	// 멤버 변수
	String name;
	int price;
	String color;
	int speed;
	
	// 멤버 메소드
	public void accelerate() {
		System.out.println(name + "ㄱㄱ");
	}
	//toString
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", color=" + color + ", speed=" + speed + "]";
	}
	
}

