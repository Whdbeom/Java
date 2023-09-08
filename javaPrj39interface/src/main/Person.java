package main;

public class Person implements PersonAction {

	String STR = "zz";
	
	@Override
	public void say() {
		System.out.println("person action");
	}

	@Override
	public int walk() {
		return 0;
	}

	@Override
	public void eat() {
		
	}


}
