package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println("복습@@@@@@@");
		
		// 여러개의 객체를 관리할 컬렉션
		List li = new ArrayList<>();
		
		// 메뉴 객체 여러개 만들고 위에서 만든 컬렉션에 담기
		li.add(new Menu("통새우와퍼", 8000));
		li.add(new Menu("어쩌구와퍼", 6000));
		li.add(new Menu("트러플머쉬룸와퍼", 10000));
		li.add(new Menu("저쩌구와퍼", 5000));
		
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		int x = li.size();
		for(int i = 0; i < x; i++) {
			System.out.print(li.get(i));
		}
		// 여러개의 객체 전부다 출력 (객체의 name 필드만 출력)
		for(int i = 0; i < x; i++) {
			Menu menu = (Menu) li.get(i); 
			System.out.println(menu.getName());
		}
		// 여러개의 객체 전부다 출력 (객체의 price 필드만 출력)
		for(int i = 0; i < x; i++) {
			Menu menu = (Menu) li.get(i); 
			System.out.println(menu.getPrice());
		}
		
	}

}
