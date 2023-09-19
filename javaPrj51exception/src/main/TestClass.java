package main;

public class TestClass {

	public void method01() {
		System.out.println("method01 start");
		method02();
		System.out.println("method01 end");
	}

	public void method02() {
		System.out.println("   method02 start");
		try {
//			throw new Exception("zzz");
			throw new KhException();
		} catch(Exception e) {
			System.out.println("   예외 발생");
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		method03();
		System.out.println("   method02 end");
	}
	
	public void method_02() {
		System.out.println("   method02 start");
		try {
			int x = 1/0;
		} catch(Exception e) {
			System.out.println("예외");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		method03();
		System.out.println("   method02 end");
	}
	
	public void method03() {
		System.out.println("      method03 start");
		System.out.println("      method03 end");
	}
	
}
