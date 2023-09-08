package data;

public class Person {

	// 기본 생성자()
	public Person() {
		
	}
	
	
	
	// 멤버 변수
	private String name;
	private int age;
	private char gender;             //  M , F
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() < 2) {
			System.out.println("잘못된 이름");
		} else {
		this.name = name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("음수 ㄴㄴ");
		} else if(age < this.age) {
			System.out.println("기존보다 작게 ㄴㄴ");
		} else {
		this.age = age;
		}
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if(gender == 'M' || gender == 'F') {
			this.gender = gender;
		} else {
			System.out.println("M이나 F만 써");
		}
	}


	// 멤버 메소드
	public void breath() {
		System.out.println("숨쉬어");
	}
	
	// 객체 안의 모든 멤버변수(==필드) 들의 정보를 리턴하는 메소드
	public String getFieldInfo() {
		return "이름 : " + this.name + ", 나이 : " + this.age + ", 성별 : " + this.gender;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}//class
