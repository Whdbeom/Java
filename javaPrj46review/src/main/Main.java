package main;

import java.util.ArrayList;
import java.util.List;

import menu.Burger;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("==========맥날============");
		
		// 메뉴(햄버거) 준비
		Burger b1 = new Burger("빅맥", 6000);
		Burger b2 = new Burger("쿼터파운드치즈버거", 9000);
		Burger b3 = new Burger("상하이스파이시치킨버거", 8000);
		
		// 여러 객체 한번에 관리하기
		List<Burger> list = new ArrayList<Burger>();

		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		// 메뉴 보여주기
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
