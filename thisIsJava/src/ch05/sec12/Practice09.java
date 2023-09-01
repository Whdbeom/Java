package ch05.sec12;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		/* 학생들의 점수를 분석하는 플그램을 만들려고 합니다.
			키보드로부터 학생 수와 각 학생들의 점수를 입력받고
			while 문과 Scanner의 nextLine() 메소드를 이용해서 최고 점수 및 평균 점수를 출력하는 코드를 작성해보세요.
		 */
		
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			int student = 0;
			int[] score = new int[student];
			int max_score = 0;
			int sum = 0;
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------------------------");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.print("선택> "); 	
				System.out.print("학생수 > ");
				student = sc.nextInt();
			} else if(select == 2) {
				for(int i = 0; i < score.length; i++) {
					score[i] = sc.nextInt();		
				}
			} else if(select == 3) {
				for(int i = 0; i < score.length; i++) {
					sum += score[i];
					System.out.println("score[" + i + "] > " + score[i]);
				}
			} else if(select == 4) {
				for(int i = 0; i < score.length; i++) {
					score[i] = sc.nextInt();		
					for(int j = 0; j < score.length; j++) {
						if(score[i] >= score[j]) {
							max_score = score[i];
						}
					}		
				}			
				System.out.println("최고 점수:  " + max_score);
				System.out.println("평균 점수:  " + sum/score.length);				
			} else {
				System.out.println("프로그램 종료");
					break;
			
			}
		}
	}
}
