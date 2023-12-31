package review;

public class Review01 {

	public void method01() {
		System.out.println("객체~~~~~~~~");
				// 객체
		/*
		 *  객체 : 데이터들의 집합 ( 변수 + 메소드 )
		 *  객체는 클래스를 바탕으로 만들어짐
		 *  클래스의 멤버(변수+메소드)들을 바탕으로 만들어짐
		 *  
		 *  객체는 Heap 메모리에 만들어짐
		 *  
		 *  클래스 안에 작성된, ( static 변수 또는 static 메소드 )
		 *  객체와 관련이 없음
		 *  
		 *  멤버( 변수, 메소드 ) 들은 객체가 태어나야만 존재함
		 *  
		 *  클래스 파일은 객체를 생성하기 위한 설계도
		 * 
		 * 설계도와 객체는 독립적임
		 * 
		 * 클래스(설계도)는 static 메모리에 저장된 글자일 뿐 
		 *  객체는 Heap 메모리 안에 생성된 데이터 집합
		 */
	}

	public void method02() {
				// 상속
		System.out.println("상속~~~~~~");
		/*
		 *  객체는 부모객체가 만들어져야 본인이 태어날 수 있다.
		 *  (JVM이 자동으로 그런 작업을 해주고 있었음)
		 * 
		 *  상속 : 부모클래스에 작성된 내용을 자식클래스도 가질 수 있음
		 *  상속 : 부모객체 + 자식객체 : 부모객체의 멤버를 자식도 쓸 수 있음
		 *  
		 *  생성자 - 부모 생성자를 호출함 
		 *  				-	객체를 생성하여 리턴해줌
		 *  
		 *  기본생성자, 매개변수가 있는 생성자 
		 *  
		 *  생성자가 아무것도 없으면 JVM 이 기본생성자를 만들어줌
		 * 
		 *  super , this 
		 *  
		 *  여러 세대에 걸쳐서 상속도 가능
		 *  
		 *  instanceof 연산자 - 이 인스턴스가 특정타입에 맞는지 확인 
		 *  
		 *  다형성 : 다양한 자료 형태(type)을 가지게 하는것
		 *  
		 *  자바는 클래스에 대해 단일상속만 허용
		 *  (자식이 무조건 부모의 모든 메소드를 Override 한다는 보장이 없으니까)
		 *  
		 *  인터페이스 : (추상메소드 + static 변수 ) 로 이루어짐
		 *  다중 상속 
		 *  
		 *  클래스 extends 클래스
		 *  클래스 implements 인터페이스, 인터페이스, 인터페이스 ...
		 *  인터페이스 extends 인터페이스
		 *  인터페이스 extends 인터페이스, 인터페이스, 인터페이스
		 */
	}
	
}
