package main;

import java.util.Stack;

public class Main4 {

	public static void main(String[] args) {
		
		// 여러개의 객체를 관리할 컬렉션
		Stack<User> stack = new Stack<User>();
		// 유저 객체 여러개 만들고 위에서 만든 컬렉션에 담기
		User u1 = new User("u1", "123");
		User u2 = new User("u2", "321");
		User u3 = new User("u3", "132");
		
		stack.add(u1);
		stack.add(u2);
		stack.add(u3);
		
		// 여러개의 객체 전부다 출력 (모든 필드 값)
		System.out.println(stack);		
		System.out.println(stack.peek());
		
		// 여러개의 객체 전부다 출력 (객체의 Id 필드만 출력)
		for(User x : stack) {
			System.out.println(x.getId());
			System.out.println(x.getPwd());
		}
		

		// 여러개의 객체 전부다 출력 (객체의 Pwd 필드만 출력)
		
	}
	
}
