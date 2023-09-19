package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import mob.Pokemon;

public class TestClass {
	
	// List - 인덱스로 요소들을 관리
	public void method01() {
		System.out.println("-----리스트-----");
		
		List<Pokemon> al = new ArrayList<Pokemon>();
		
		// 넣기
		Pokemon p = new Pokemon();
		al.add(p);
		
		// 꺼내기
		Pokemon result = al.get(0);
		System.out.println(result);
	}
	
	// Set - 중복이 허용되지 않는다
	public void method02() {
		System.out.println("-----set-----");
		
		Set<Pokemon> s = new HashSet<Pokemon>();
		
		// 넣기
		s.add(new Pokemon());
		
		// 꺼내기
		System.out.println(s);
		
	}
	
	// Map - key, value 쌍으로 데이터를 관리 
	// key 는 중복 X
	public void method03() {
		System.out.println("-----Map----");
		
		Map<String, Pokemon> m = new HashMap<String, Pokemon>();
		
		// 넣기 
		m.put("first", new Pokemon());
		
		//꺼내기
		Object result = m.get("first");
		System.out.println(result);
	}

	// Stack - Last In First Out
	public void method04() {
		System.out.println("-----Stack-----");
		
		Stack s = new Stack();
		
		// 넣기
		s.add(new Pokemon());
		
		// 꺼내기
		Object result = s.pop();
		System.out.println(result);
	}

	// Queue - First In First Out
	public void method05() {
		System.out.println("-----Queue-----");
		
		LinkedList q = new LinkedList();
		
		// 넣기
		q.add(new Pokemon());
		
		// 꺼내기
		Object result = q.poll();
		System.out.println(result);
	
	}
}
