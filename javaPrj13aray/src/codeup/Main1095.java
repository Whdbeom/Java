package codeup;

import java.util.Scanner;

public class Main1095 {

	public static void main(String[] args) {
	
		int min = 24;
		
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 몇번 출석 부를지 입력 받기
		int n = sc.nextInt();
		
		// n 번만큼 출석 확인 (입력 받기)
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();   // 출석 번호
			// 가장 빠른 번호인지 판단하기
			if(min > x) { 	// 지금 들은 번호가 더 빠르다면?
				min = x;		// min 값을 새로 갱신하기
			}
		}
		
		//가장 빠른 번호 출력
		System.out.println(min);
	}

}
