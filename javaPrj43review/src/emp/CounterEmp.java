package emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import menu.Menu;

public class CounterEmp {

	
	// 스캐너
	private Scanner sc = new Scanner(System.in);
	List menuList = new ArrayList<>();

	
	// 메뉴 보여주기
	private void showMenu() {
		
		// 메뉴판 준비
		menuList.add(		new Menu("아메리카노", 3000)		);
		menuList.add(		new Menu("자몽에이드", 5000)		);
		menuList.add(		new Menu("말차라떼", 6000)		);
		menuList.add(		new Menu("말차프라푸치노", 8000)		);
		menuList.add(		new Menu("바닐라퐁크러쉬", 6000)		);
		// 메뉴판 출력
		
		for(int i = 0; i < menuList.size(); i++) {
			Menu x = (Menu)menuList.get(i);
			System.out.println((i+1) +"  "+ x.getName()+"  " + x.getPrice());
		}
	}
	
	// 손님 받음
	public void work() {
		
		// 메뉴 보여주기
		showMenu();
		
		//메뉴 입력받기
		System.out.println("뭐먹어?");
		int menuNum = scanUserInput();
		
		// 선택한 메뉴 확인시켜주고, 금액 더하기
		printMenu(menuNum);
		
		// 갯수 입력 받기
		System.out.println("몇개?");
		int menuCnt = scanUserInput();

		// 결제 (금액)
		int totalPrice = 0;
		int price = getMenuPrice(menuNum);
		totalPrice += price * menuCnt;
		System.out.println("결제금액 : " + totalPrice);
	
	}
	
	private int getMenuPrice(int menuNum) {
		Menu result = (Menu)menuList.get(menuNum-1);
		int price = result.getPrice();
		return price;
	}

	private void printMenu(int num) {
		Menu result = (Menu)menuList.get(num-1);
		System.out.println("메뉴 이름 : " + result.getName());
		System.out.println("메뉴 이름 : " + result.getPrice());
	}

	private int scanUserInput() {
		String numStr = sc.nextLine();
		int num = Integer.parseInt(numStr);
		return num;
	}
	
	
}
