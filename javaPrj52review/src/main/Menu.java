package main;

public class Menu {

	public Menu() {
	}
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) throws Exception {
		if(price <= 0) {
			throw new Exception("가격은 0 이하일수 없슴니다");
		}
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Menu [name=" + name + ", price=" + price + "]\n";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	
}
