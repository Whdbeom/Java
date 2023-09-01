package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=====method=====");
		
		/*
			메소드 : 명령어 모아둔것
				[문법]
			public void m01() {실행내용}
			
			접근제한자 리턴타입 메소드이름() {실행내용}
			접근제한자 리턴타입 메소드이름(매개변수) {실행내용}
			접근제한자 리턴타입 메소드이름(매개변수, 매개변수 ... ) {실행내용}
			
			접근제한자 리턴타입 메소드이름() {실행내용; return 값;}
			접근제한자 리턴타입 메소드이름(매개변수) {실행내용; return 값;}
			접근제한자 리턴타입 메소드이름(매개변수, 매개변수  ...) {실행내용; return 값;}
			
		*/	

		
		// 유저한테 입력받은 값을 출력하는 메소드 호출
		int n = 321;
		MethodTest mt = new MethodTest();
		mt.printNumber(n);
		
	}//main end

}//class
