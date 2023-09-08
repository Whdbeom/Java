package main;

import data.Person;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("생성자 오버로딩");
		

		Person person = new Person("피카츄", 10);
		Person person2 = new Person();
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getFieldInfo());
		
		person2.setName("피카츄");
		person2.setAge(25);
		
		System.out.println(person2.getFieldInfo());
		
	}
	
}
