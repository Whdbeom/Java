package manager;

import java.util.Arrays;

import data.Lotto;
import main.Main;

public class GameManager {

	NumberManager numbermanager = new NumberManager();
	NumberManager numbermanager2 = new NumberManager();
	
	//자동 or 수동 설정
	public void selectMenu() {		
		System.out.println("1.자동 2.수동");
		numbermanager.userInput();
		if(numbermanager.userInput() == 1) {
			auto();
		}
		if(numbermanager.userInput() == 2) {
			manual();
		}
	}
	
	//자동
	private void auto() {
		numbermanager.makeNumber();
		Lotto.comBonusNum = numbermanager.makeBonus();
		numbermanager2.makeNumber();
		Lotto.userBonusNum = numbermanager2.makeBonus();
	}
	
	//수동
	private void manual() {
		numbermanager.makeNumber();
		Lotto.comBonusNum = numbermanager.makeBonus();
		numbermanager.userNum();
		Lotto.userBonusNum = numbermanager.userInput();
	}
	
	//몇등
	public void win() {
	numbermanager.prize();
	System.out.println("======================================");
	System.out.println("선택한 로또 번호  : " + Arrays.toString(Lotto.userNum) +"   +   " + Lotto.userBonusNum);
	System.out.println("    로또 당첨 번호 : " + Arrays.toString(Lotto.comNum) +"   +   " +  Lotto.comBonusNum );
	System.out.println(" 맞은 갯수 : " + Main.count + "보너스 넘버 ");
	System.out.println("======================================");
	
	}
}
