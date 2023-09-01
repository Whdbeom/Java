package game;

import game.updown.UpDownGameManager;
import game.rcp.RcpGameManager;
import main.Main;

public class GameManager {


	public void printGameInfo( ) {
		System.out.println("1. UPDOWN");
		System.out.println("2. 가위바위보");
		System.out.println("3. 포켓몬");
		System.out.println("9. 게임종료");
	}
	


	public void startUpDown() {
		UpDownGameManager gm = new UpDownGameManager();
		gm.startGame();
	}

	public void startRcp() {
		RcpGameManager rm = new RcpGameManager();
		rm.startRcp();
	}

	public void startPokemon() {
		System.out.println("-----포켓몬-----");
		System.out.println("준비중,,,,,,,,,,,,,,,,,,");
	}
	
	
	

} //class