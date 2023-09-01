package main;

public class Main {

	public static void main(String[] args) {
		
		int count = 0;
		
		UpdownGame ug = new UpdownGame();          // 객체 준비

		// 업다운 게임 시작
		ug.printStartMsg();
		
		// 게임 시작 안내문구
		ug.printGameInfo();
		
		// 정답 준비 (랜덤값)
		int answer = ug.prepareRandomAnswer();
		
		boolean isFinish = false;
		while(!isFinish) { 			
		// 유저 입력		
			int user = ug.scanUserInput();		
				count++;					
		// 판단하고, 정답 여부 리턴 (  업 / 다운 / 정답 )
			isFinish = ug.judgeUpDown(answer, user);

		}
		// 스코어 출력
	System.out.println("시도 횟수 : " + count);
	
	}

}
