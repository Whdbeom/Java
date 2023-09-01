package main;

public class Test01 {

	// 변수
	public void hello() {
		byte x = 127;
		int a = 10;
		long b = 20;
		double d = 3.14;
		boolean isOk = true;
		char ch = 'A'; 
		
		String str = "zzz";

		// 컴퓨터는 타입이 다르면 연산 불가
		// 그래서 컴퓨터가 알아서 타입 변환 (auto casting)
		
		// 강제로 타입 변환도 가능
		// (변환 시킬 타입) 데이터;
		
		// 변수 명명 규칙 camelCase, 예약어X ,특수문자( $ ,  _ )
		
		System.out.println("hello~@@");
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(isOk);
		System.out.println(ch);
		System.out.println(str);
	}
	
}
