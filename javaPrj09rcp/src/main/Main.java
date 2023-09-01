package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("게임시작");
		
		String status = "";
		
		while(true) {
			
			//컴퓨터 패 준비
			String com = "";
			int num = (int)(Math.random()*3 + 1);
			
//			if(num == 1) {
//				com = "가위";
//			} else if(num == 2) {
//				com = "바위";
//			} else {
//				com = "보";
//			}
			switch(num) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}
			
	
			
			// 유저 패 준비
			System.out.println("가위/바위/보 셋 중 하나를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			String user = sc.nextLine();
			
			// 유저 패 이상하면 다시 준비
			if(!user.equals("ㅗ") && !user.equals("가위") && !user.equals("바위") && !user.equals("보"))  {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}
			
			// 판단 (문자열 비교는 equals)
			if(com.equals(user)) {
				status = "draw";
			} else if(com.equals("가위") && user.equals("바위") ) {
				status = "win";
			} else if(com.equals("가위") && user.equals("보") ) {
				status = "lose";
			}  else if(com.equals("바위") && user.equals("가위") ) {
				status = "lose";
			} else if(com.equals("바위") && user.equals("보") ) {
				status = "win";
			}  else if(com.equals("보") && user.equals("가위") ) {
				status = "win";
			} else if(com.equals("보") && user.equals("바위") ) {
				status = "lose";
			} else if(user.equals("ㅗ")) {
				status = "win";
			}
			
			// 판단 결과에 따라 출력문 실행
			System.out.println("유저 : " + user + " / 컴퓨터 : " + com );
			if(status.equals("win")) {
				System.out.println("user win");
				
				// 재경기 희망 여부 체크
				System.out.println("리? (ㅇㅇ/ㄴㄴ)");
				String re = sc.nextLine();
				if(re.equals("ㅇㅇ")) {
					System.out.println("ㄱㄱ");
				} else if(re.equals("ㄴㄴ")) {
					break;
				}
			} else if(status.equals("lose")) {
				System.out.println("user lose");
			} else if(status.equals("draw")) {
				System.out.println("비겼음");	
			}
			
			
			
		} // while

		System.out.println("=======게임 종료=======");
	} // main

} // class
