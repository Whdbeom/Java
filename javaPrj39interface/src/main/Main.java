package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 인터페이스 =====");
		
		HongGilDong hong = new HongGilDong();
		hong.coding();
		hong.fishing();
		
//		if(hong instanceof Programmer) {
//			System.out.println("프로그래ㅓㅁ ㅇㅋ");
//		} else {
//			System.out.println("프로ㄴㄴ");
//		}
//		
//		if(hong instanceof Pokemon) {
//			System.out.println("포켓몬 ㅇㅋ");
//		} else {
//			System.out.println("포켓몬 아님");
//		}
//		
//		if(hong instanceof Object) {
//			System.out.println("obj ㅇㅋ");
//		} else {
//			System.out.println("obj 아님");
//		}
		
		Person p = new Person();
		
		int cnt = p.walk();
		p.eat();
		
		if(hong instanceof PersonAction) {
			System.out.println("ㅇㅋ");
		} else {
			System.out.println("ㄴㄴ");
		}
		
		System.out.println(hong.STR);
		
	}
	
}
