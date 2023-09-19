package main;

public class TestClass {

	public void method01() {
		System.out.println("메소드01");
		Person p = new Person();
		p.age = 20;
		method02(p);
		System.out.println(p.age);
	}
	
	public void method02(Person x) {
		System.out.println("메소드02");
		x.age = 10;
	}
	
}
