package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import mob.Pokemon;



public class PracticeClass {

	Scanner sc = new Scanner(System.in);
	// List
	public void method01() {
		System.out.println("-----List-----");
		List al = new ArrayList();
		
		Pokemon p = new Pokemon();
		int num = 10;
		String str = "hello";
		
		al.add(p);
		al.add(num);
		al.add(str);
		System.out.println(al);
		
//		al.add(0, "안녕");
//		al.clear();
//		boolean result = al.contains(10);
//		System.out.println(result);

		System.out.println(al);
			
	}
	
	// Set
	public void method02() {
		System.out.println("-----Set-----");
		HashSet s = new HashSet();
		
		
		s.add((int)(Math.random()*45+1));
		s.add((int)(Math.random()*45+1));
		s.add((int)(Math.random()*45+1));
		s.add((int)(Math.random()*45+1));
		s.add((int)(Math.random()*45+1));
		s.add((int)(Math.random()*45+1));
		
		System.out.println(s);
		
	}
	
	// Map
	public void method03() {
		System.out.println("-----Map-----");
		Map map1 = new HashMap();
		Map map = new HashMap();
		
//		String input = sc.next();
//		map1.put(input, map);
		map.put("name", "박종범");
		map.put("atk", 5);
		map.put("gender", 'M');
		
		Object result = map.get("name");
		System.out.println(result);
		
		map.remove("1");
		
		System.out.println(map1);
	}
	
	// Stack
	public void method04() {
		System.out.println("-----Stack-----");
		
		Stack stack = new Stack();
	
		stack.add("one");
		stack.add("two");
		stack.add("three");

		Object result = stack.peek();
		Object result2 = stack.get(1);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(stack);
	}
	
	// Queue
	public void method05() {
		System.out.println("------Queue-----");
		
		Queue q = new LinkedList();
		q.add(1);
		q.add("asdf");
		q.add('c');
		
		Object result = q.poll();
		System.out.println(result);
		System.out.println(q);
		
		
	}

}
