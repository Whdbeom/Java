package codeup;

import java.util.Scanner;

public class Main1411 {

	public static void main(String[] args) {

		// 스캐너 준비
		Scanner sc = new Scanner(System.in);
	
		// n 입력받기 (최초 들고있던 카드 갯수
		int n = sc.nextInt();
		
		// 원래 내 카드 정보 알 수 있음 ( 1~n번)
		int[] arr = new int[n+1];
		
 		// 현재 들고있는 카드 확인 (입력받기 n-1번)
		for (int i = 0; i < n-1; i++) {
			int card = sc.nextInt();
			// 확인한 카드 체크
			arr[card] = 1; // 숫자 1을 집어넣어서 표시
		}
		
		// 결과 출력 ( 빠진 카드가 몇번인지) == 체크 안된것 찾아서 출력
		for(int i = 1; i <= n; i++) {
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
		
	}

}
