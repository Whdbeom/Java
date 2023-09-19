package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Main6 {

	public static void main(String[] args) {

		// 여러개의 객체를 관리할 컬렉션
		Map<String, User> map = new HashMap<String, User>();

		// 유저 객체 여러개 만들고 위에서 만든 컬렉션에 담기
		User u1 = new User("아", "몬드");
		User u2 = new User("브", "리즈");
		User u3 = new User("자", "일리톨");
		
		map.put(u1.getId(), u1);
		map.put(u2.getId(), u2);
		map.put(u3.getId(), u3);
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(map);
		
		// 여러개의 객체 전부다 출력 (객체의 name 필드만 출력)
//		for(Entry<String, User> x : map.entrySet()) {
//			System.out.println(x.getKey());
//			System.out.println(x.getValue());
//		}
		
		Set<String> ks = map.keySet();
		
		for(String k : ks) {
			System.out.println(k);
			User v = map.get(k);
			System.out.println(v);
		}
		
		
		
		
		// 여러개의 객체 전부다 출력 (객체의 price 필드만 출력)
		
		
	}

}
