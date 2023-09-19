package main;

import member.controller.MemberManager3;

public class Main3 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("======회원 관리 프로그램");
		
		MemberManager3 mm = new MemberManager3();
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
