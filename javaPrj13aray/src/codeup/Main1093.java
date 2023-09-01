package codeup;

import java.util.Scanner;

public class Main1093 {

	public static void main(String[] args) {
		
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 배열 생성  ( 학생 수 : 23명 )
		int[] memo = new int[23];	
		
		// 입력 받기 (출석 몇번 부를건지)
		int n = sc.nextInt();
		
		// 입력받기 (출석 번호들)
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();          // 선생님이 부른 출석 번호
			// 메모하기	
			memo[num-1]++;			
		}
		
		// 결과 출력
		for(int i = 0; i < 23; i++) {
			System.out.print(memo[i]+ " ");
		}
		
	} // main

} // class
