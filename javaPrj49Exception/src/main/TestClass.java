package main;

public class TestClass {

	public void method01() {
		System.out.println("메소드1 실행");
		method02();
		System.out.println("메소드1 끝");
	}
	
	public void method02() {
		System.out.println("  메소드2 실행");
		int[] arr = new int[3];
		
		try {
			System.out.println(111111);
			arr[7] = 10;
//			int x = 3 / 0;
			System.out.println(222222);
		} catch(Exception e) {
			System.out.println("어쩌구 에러");
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
		} 

		
		method03();
		System.out.println("  메소드2 끝");
	}
	
	public void method03() {
		System.out.println("   메소드3 실행");
		System.out.println("   메소드3 끝");
	}
	
	
}
