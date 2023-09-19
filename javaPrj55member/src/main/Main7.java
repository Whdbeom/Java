package main;

import member.controller.MemberManager7;

public class Main7 {

	public static void main(String[] args) {

		MemberManager7 mm = new MemberManager7();
		
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
