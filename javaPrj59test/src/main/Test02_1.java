package main;

import com.kh.test.person.model.vo.Person;

public class Test02_1 {

	public static void main(String[] args) {

		Person[] pArr = new Person[3];
		pArr[0] = new Person("김");
		pArr[1] = new Person("철");
		pArr[2] = new Person("수");
		
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
		
	}

}
