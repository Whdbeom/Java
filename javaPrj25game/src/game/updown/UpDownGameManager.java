package game.updown;

import game.GameManager;
import main.Main;

public class UpDownGameManager {

	public void startGame() {
		//시도 횟수
		int cnt = 0;
		// 정답을 준비 (랜덤 1~100)
		int answer = (int)(Math.random() * 100 + 1);
		
		// 반복문으로 감싸기
		while(true) {
			// 유저 입력 받기
			System.out.print("1~100 사이 정수 입력 : ");
			String num_ = Main.scanUserInput();
			cnt++;
			int num = Integer.parseInt(num_);
			// 판단 
			if(num == answer) {
				System.out.println("정답");
				break;
			} else if(num > answer) {
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}
		}
		
		// 시도 횟수 출력
		System.out.println("시도 횟수 : " + cnt);
	}
	
}
