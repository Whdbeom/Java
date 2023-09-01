package main;

import data.Person;
import data.Pokemon;

public class Main {

	public static void main(String[] args) {

//		System.out.println("======캡슐화======");
//		
//		Person p1 = new Person();
//		
//		p1.setName("하하");
//		// 1 년 후 ,,,,, 벌써 일ㄴㄴ,,0
//		p1.setAge(26);
//		
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//		
//		System.out.println("안녕하세요 " + p1.getName() + "입니다. 저는 " + p1.getAge() + "살 입니다." );
		
		Pokemon p = new Pokemon(); // 생성자
		
		p.setName("라이츄");
		p.setHp(1200);
		p.setAtk(320);
		
//		p.printInfo();
		
		String s = p.toString();
		System.out.println(p.getAtk());
	
	} // main

	
} // class
