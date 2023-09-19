package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("========throws========");
		
		TestClass tc = new TestClass();
		
		try {
		tc.method01();
		} catch(Exception e) {
			System.out.println("메인");
		}
		
	}
	
}
