package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("클래스!");

//		// 성적
//		int[] scoreArr = new int[3];
//		// 이름
//		String[] nameArr = new String[3];
//		//혈액형
//		char[] bloodArr = new char[3];
//	
//		nameArr[0] = "홍길동";
//		scoreArr[0] = 4;
//		
//		nameArr[1] = "아이유";
//		scoreArr[1] = 1000;
//		
//		nameArr[2] = "카즈하";
//		scoreArr[2] = 95;
//
//		//학생 정보 출력
//		System.out.println(nameArr[1]);
//		System.out.println(scoreArr[1]);
		
		//===================================
		
		Student x = new Student();
		x.age = 20;
		x.name = "바보";
		System.out.println(x.age);
		System.out.println(x.name);
		x.study();
		
		

		//===================================
		
		// 핸드폰의 정보를 기록하고 확인해보기
//		SmartPhone x = new SmartPhone();
//		x.name = "아이폰15";
//		x.brand = "애플";
//		x.price = 1000000;
//		
//		System.out.println(x.name);
//		System.out.println(x.brand);
//		System.out.println(x.price);
		
	} //main

} // class
