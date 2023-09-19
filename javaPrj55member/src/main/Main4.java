package main;

import member.controller.MemberManager4;

public class Main4 {

	public static void main(String[] args) {

		MemberManager4 mm = new MemberManager4();
		
		System.out.println("=====회원관리 프로그램");
		
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
