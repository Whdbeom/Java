package ch07.sec07.exam01;

	class A {
		
	}
	
	class B extends A {
		
	}
	
	class D extends B {
		
	}

	class C extends A {
		
	}
	
	class E extends C{
		
	}
		
	public class PromotionExample {
		public static void main(String[] args) {
			B b = new B();
			D d = new D();
			C c = new C();
			E e = new E();
			
			A a1 = b;
			A a2 = c;
			A a3 = d;
			A a4 = e;
			
			B b1 = d;
			C c1 = e;
			
//			B b3 = e;
//			C C2 = d;
			
			
		}
		
	}
