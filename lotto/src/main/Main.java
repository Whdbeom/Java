package main;

import manager.GameManager;
import manager.NumberManager;

public class Main {

	public static int count = 0;

	public static void main(String[] args) {

		NumberManager user = new NumberManager();
		GameManager gameManager = new GameManager();
		
		gameManager.selectMenu();
		gameManager.win();
	}

}
