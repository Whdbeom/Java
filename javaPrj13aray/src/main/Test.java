package main;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		// 학생 3명의 성적 입력받기
		// 각 학생의 성적 출력하기
		
		Scanner sc = new Scanner(System.in);				// 도구 준비
		
//		int score1 = sc.nextInt();
//		int score2 = sc.nextInt();
//		int score3 = sc.nextInt();
//		
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
		
		System.out.print("학생 수를 입력하세요 : ");
		int n = sc.nextInt();
		
		int[] scoreArr = new int[n];	
		
		System.out.println("--------------------");
		
		// 입력
		for(int index = 0; index < scoreArr.length ; index++) {
			System.out.print((index+1) + "번 학생 성적 : ");
			scoreArr[index] = sc.nextInt();			// 성적 입력
		}
		// 출력
		for(int i = 0; i < scoreArr.length; i++) {
			System.out.println((i+1) + "번 학생 성적 : " + scoreArr[i]);
		}
	}

}
