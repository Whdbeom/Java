package main;

import java.util.LinkedList;
import java.util.Queue;

public class Main5 {

	public static void main(String[] args) {

		// 여러개의 객체를 관리할 컬렉션
		Queue q = new LinkedList();
		
		// 유저 객체 여러개 만들고 위에서 만든 컬렉션에 담기
		User u1 = new User("김아아", "2000");
		User u2 = new User("박라떼", "4000");
		User u3 = new User("김녹차", "3000");
		
		q.add(u1);
		q.add(u2);
		q.add(u3);
		
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(q);
		
		// 여러개의 객체 전부다 출력 (객체의 name 필드만 출력)
		// 여러개의 객체 전부다 출력 (객체의 price 필드만 출력)
	
		
		
	}

}
