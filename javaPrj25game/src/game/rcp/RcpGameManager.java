package game.rcp;

import main.Main;

public class RcpGameManager {

	public void startRcp() {
		
		System.out.print("유저 : ");
		String userRcp = Main.scanUserInput();
		
		String[] comRcp = {"가위", "바위", "보"};
		int x = (int)(Math.random()*2);
		
		while(true) {
			System.out.println("컴퓨터 : " + comRcp[x]);
			for(int i = 0; i < comRcp.length; i++) {
				if(comRcp[i].equals(userRcp)  ) {
					System.out.println("비겼습니다");
				} 
			}
			if(comRcp[0].equals("가위") && userRcp.equals("바위")) {
				System.out.println("이겼다");
			} else if(comRcp[0].equals("가위") && userRcp.equals("보")) {
				System.out.println("패배");
			}
			
			}
			
		}
	}
		
//		comRcp[0] >가위
//		comRcp[1] > 바위
//		comRcp[2] > 보
		
		
		
	
	
}
// 보 3 > 가위 1 > 바위  2> 보 3