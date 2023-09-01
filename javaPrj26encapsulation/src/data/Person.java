package data;

public class Person {

	// 캡슐화 실습
	//	이름, 나이
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age-1;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이가 0보다 작ㅇ르수 업음");
			return;
		}
		if(age < this.age) {
			System.out.println("나이가 줄어드는거 안돼요");
			return;
		}
		this.age = age;
	}
	
	
}
