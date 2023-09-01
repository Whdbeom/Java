package practice;

public class MethodTest {

	/*
			[ 메소드 ]
		명령어 모아놓은것
		명명 : 동사 형태로 작성, camelCase
		- 하나의 동작만 수행하는게 좋음 (가능한 작은 단위)
		
			[ 문법 ]
		public void test(){ ~~~ }
		
		- 기본
		접근제한자 리턴타입 메소드명(){ ~~~ }

		- 데이터를 받는 
		접근제한자 리턴타입 메소드명(매개변수, ...){ ~~~ }
	
		- 데이터를 반환하는
		접근제한자 리턴타입 메소드명(){ ~~~; return 값; }
			
		- 데이터를 받고, 반환도 하는	
		접근제한자 리턴타입 메소드명(매개변수, ...){ ~~~; return 값; }
		
	*/
	
	public void test() {
		System.out.println("메소드 테스트");
	}
	
	// 매개 변수 있는 (1개)
	public void test01(int x) {
		System.out.println(x);
	}
	
	// 매개 변수 있는 (2개)
	public void test02(int a, int b) {
		int result = a + b;
		System.out.println(a +"+"+ b + "=" + result);
	}
	
	// 리턴값이 있는 (리턴값은 여러개 불가능)
	public int test03() {
		return 123;
	}
	
	// 매개변수, 리턴값이 있는 
	public int test04(int a, int b) {  // a,b 인자 값 argument
		int result = a+b;
		return result;
	}
	// 매개변수 == 파라미터
}
