package main;

import java.util.ArrayList;
import java.util.List;

import emp.CounterEmp;
import menu.Burger;

public class Main {

	public static void main(String[] args) {

		System.out.println("복습");
		
		// 버거 여러개를 담아줄 컬렉션 준비
		List<Burger> list = new ArrayList<Burger>();
		
		// 버거 초기 세팅
		list.add(new Burger("치즈버거", 5010));
		list.add(new Burger("파인애플버거", 5030));
		list.add(new Burger("수박버거", 5040));
		list.add(new Burger("감자버거", 5050));
		list.add(new Burger("당근버거", 5200));
		list.add(new Burger("햄버거", 590));

		System.out.println("메인메소드에서 버거 리스트 출력");
		System.out.println(list);
		
	
		// 카운터 직원을 통해서 모든 버거 메뉴 출력
		CounterEmp counterEmp = new CounterEmp();
		counterEmp.showBurgerMenu(list);
		
		System.out.println("메인메소드에서 버거 리스트 출력");
		System.out.println(list);
	}

}
