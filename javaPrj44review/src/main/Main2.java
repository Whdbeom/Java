package main;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		// 여러개의 객체를 관리할 컬렉션
		List<User> list = new ArrayList<User>();
		// 유저 객체 여러개 만들고 위에서 만든 컬렉션에 담기
		User a = new User("자일리톨", "1q2w3e");
		User b = new User("리스테린", "1q2w3");
		User c = new User("메가커피", "1q2w");
		list.add(a);
		list.add(b);
		list.add(c);
		
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(list);
		
		// 여러개의 객체 전부다 출력 (객체의 name 필드만 출력)
		for(User e : list) {
			System.out.println(e.getId());
			System.out.println(e.getPwd());
		}
		
//		
//		User e01 = list.get(0);
//		System.out.println(e01.getId());
//
//		User e02 = list.get(1);
//		System.out.println(e02.getId());
//		
//		User e03 = list.get(2);
//		System.out.println(e03.getId());
//		
//		a.getId();
//		
//		// 여러개의 객체 전부다 출력 (객체의 price 필드만 출력)
//		System.out.println(e01.getPwd());
//		System.out.println(e02.getPwd());
//		System.out.println(e03.getPwd());
//		
		
	}
	
}
