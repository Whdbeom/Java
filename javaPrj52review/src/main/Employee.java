package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

	List<Menu> list = new ArrayList<Menu>();
	Scanner sc = new Scanner(System.in);
	
	// 일 시작
	public void startWork() {
		showMenu();
		order();
		pay();
	}
	
	// 메뉴판 준비
	private void showMenu() {
	list.add(new Menu("참치김밥", 5000));
	list.add(new Menu("치즈라면", 6000));
	list.add(new Menu("라볶이", 7000));
	list.add(new Menu("치즈돈가스", 8000));
	System.out.println(list);
	}
	// 주문 받기
	int price = 0;
	private void order() {
		
		boolean z = true;
		
		while(z) {
			int cnt = 0;
			System.out.println("뭐먹을래?");
			String  menu = sc.nextLine();
			for(Menu x : list) {
//				cnt++;
				if(x.getName().equals(menu)) {
					price += x.getPrice();
					System.out.println(x.getName() + "은 " + x.getPrice() + "원");	
					z = false;
					break;
				} else {
					cnt++;
					if(cnt == list.size()) {
						System.out.println("그런거 없어..");
					}
				}
			}
		}
	}
		

	// 결제하기 
	public void pay() {
		String p = sc.nextLine();
		switch(p) {
		case "계산" : System.out.println(price + "원."); break;
		case "계산해주세요" : System.out.println(price + "원 입니다."); break;
		default : System.out.println("돈내고가"); break;
		}
	}
	
	
}
