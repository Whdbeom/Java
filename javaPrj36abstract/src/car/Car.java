package car;



public abstract class Car {

	private String name;
	private String color;
	private int price;
	private int speed;
	
	// 악셀 밟았을 때 실행될 내용
	public abstract void go();
	
	// 모든 필드 정보 확인
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + ", speed=" + speed + "]";
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


}
