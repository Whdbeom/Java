package menu;

public class Menu {

	
	public Menu() {
		super();
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

	public void setPrice(int price) {
		this.price = price;
	}

	
	public String toString() {
		return "Menu [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
} // class
