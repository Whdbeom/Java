package main;

import Manager.GameManager;
import test.Test;

public class Main {

	public static void main(String[] args) {

		GameManager gameManager = new GameManager();
		Test test = new Test();
//		Draw draw = new Draw();
		
		Boolean stop = true;
		while(stop) {
			
			gameManager.gameStart();
			System.out.println("다시 하시겠습니까? ( y / n )");
			String x = GameManager.sc.next();
			if(x.equals("y")) {
				GameManager.userNum.clear();
				GameManager.comNum.clear();
				stop = true;
			} else if(x.equals("n")) {
				System.out.println("게임을 종료합니다.....");
				stop = false;
			}
			
		}
	}

	
	
}
