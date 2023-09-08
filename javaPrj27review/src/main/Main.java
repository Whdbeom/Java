package main;

import data.Person;

public class Main {

	public static void main(String[] args) {

		System.out.println("복습!");
		
		Person p = new Person();
		
//		p.breath();
		
		p.setName("ㅋㅋㅋㅋ");
		p.setAge(21);
		p.setGender('M');
		
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
		
//		p.getAge();
//		p.printField();
		
		String str = p.getFieldInfo();
		System.out.println(str);
		
		String to = p.toString();
		System.out.println(to);
		
		
	} // main

} //class
