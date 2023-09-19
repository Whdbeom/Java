package main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {

		// 여러개의 객체를 관리할 컬렉션
		Set<User> s = new HashSet<User>();
		// 유저 객체 여러개 만들고 위에서 만든 컬렉션에 담기
		User a = new User("멍청이", "1234");
		User b = new User("바보", "123");
		User c = new User("돼지", "134");
		s.add(a);
		s.add(b);
		s.add(c);
		
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(s);
		
		// 여러개의 객체 전부다 출력 (객체의 name 필드만 출력)
//		Iterator<User> iterator = s.iterator();
//		
//		while(iterator.hasNext()) {
//			User x = iterator.next();
//			System.out.println(x.getId());
////			System.out.println(x.getPwd());
//		}
		
		for(User x : s) {
			System.out.println(x.getId());
			System.out.println(x.getPwd());
		}
		
		
		// 여러개의 객체 전부다 출력 (객체의 price 필드만 출력)
//		Iterator<User> iterator2 = s.iterator();
//		
//		while(iterator2.hasNext()) {
//			User x = iterator2.next();
//			System.out.println(x.getPwd());
//		}
		
		
	}

}
