package main;

import member.MemberController;

public class Main {

	public static void main(String[] args) {

		MemberController md = new MemberController();
		while(true) {
			md.showMenu();
		}
	}

}
