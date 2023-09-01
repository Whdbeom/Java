package main;

import java.util.Scanner;

public class Main {

	// final : 재할당 불가능
	static final String BURGER01 = "상하이 스파이시";
	static final String BURGER02 = "베이컨 토마토 디럭스";
	static final String BURGER03 = "슈비버거";
	static final String SIDE01 = "감자튀김";
	static final String SIDE02 = "치즈스틱";
	static final String SIDE03 = "치킨텐더";
	static final String DRINK01 = "콜라";
	static final String DRINK02 = "스프라이트";
	static final String DRINK03 = "아메리카노";
	
	// 스캐너 객체 준비
	static final Scanner sc = new Scanner(System.in);
	
	// 맥도날드 키오스크
	public static void main(String[] args) {
		

		// 포장 or 매장
		System.out.println("1.포장 2.매장");
		int packageType = sc.nextInt();

		// 메뉴선택 (버거) // 메뉴판 보여주고  // 입력
		Menu m = new Menu();
		int burger = m.burgerMenu();
		
		// 메뉴선택 (사이드)
		int side = m.sideMenu();

		// 메뉴선택 (음료수)
		int drink = m.drinkMenu();
		
		// 결제
		
		
		// 대기번호 발급
		
		
		//메뉴명 준비
		String burgerName = null;
		String sideName = null;
		String drinkName = null;
		
		// 버거 메뉴명 준비
		switch (burger) {
		case 1 : burgerName = BURGER01; break;
		case 2 : burgerName = BURGER02; break; 
		case 3 : burgerName = BURGER03; break;
			default: System.out.println("잘못 입력하셨습니다.");
		}
		
		// 사이드 메뉴명 준비
		switch (side) {
		case 1 : sideName = SIDE01; break;
		case 2 : sideName = SIDE02; break; 
		case 3 : sideName = SIDE03; break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
		
		// 음료 메뉴명 준비
		switch (drink) {
		case 1 : drinkName = DRINK01; break;
		case 2 : drinkName = DRINK02; break; 
		case 3 : drinkName = DRINK03; break;
		default: System.out.println("잘못 입력하셨습니다.");
		}

		
		// 주문확인서 출력
		System.out.println("==============================");
		System.out.println("주문 하신 메뉴는");
		System.out.println("햄버거 : " + burgerName);
		System.out.println("사이드 : " + sideName);
		System.out.println("음료수 : " + drinkName);
		System.out.println("입니다.");

	}

}
