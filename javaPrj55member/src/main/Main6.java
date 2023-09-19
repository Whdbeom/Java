package main;

import member.controller.MemberManager6;

public class Main6 {

	public static void main(String[] args) {

		MemberManager6 mm = new MemberManager6();
		
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
