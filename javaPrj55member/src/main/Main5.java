package main;

import member.controller.MemberManager5;

public class Main5 {

	public static void main(String[] args) {

		MemberManager5 mm = new MemberManager5();
		
		try {
			while(true) {
			mm.showMenu();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
