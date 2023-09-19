package main;

import board.BoardController;

public class Main {

	public static void main(String[] args) {

		BoardController bc = new BoardController();
		while(true) {
			bc.showMenu();
		}	
	}

}
