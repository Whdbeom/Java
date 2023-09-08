package snack;

public class Snack {

	String name;
	String taste;
	int price;
	int gram;
	

	public void eat() {
		System.out.println(price + "원 짜리...." + name + " 먹는다..." + taste );
	}
	
	


	public static void main(String[] args) {
	
		Bananakick bananakick = new Bananakick();
		Sunchip sunchip = new Sunchip();
		
		sunchip.eat();
		
	}
}