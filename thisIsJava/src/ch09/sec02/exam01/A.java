package ch09.sec02.exam01;

public class A {
	// Field
	int field;
	B field2;
	
	// Constructor
	A() {
		B b = new B();
		b.methodB();
	}
	
	// Method
	void methodA() {
		B b = new B();
		b.methodB();
	}
	
	// Nested Class
	public class B {
		// Field 
		// Constructor
		// Method
		public void methodB() {
			System.out.println("methodB() 실행");
		}
	}
	
}
