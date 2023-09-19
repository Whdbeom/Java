package main;

import member.controller.MemberManager;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("================회원 관리 프로그램");
		
		MemberManager mm = new MemberManager();
			try {
				while(true) {
					mm.showMenu();
				}
			} catch(Exception e){
				String errorMsg = e.getMessage();
				System.out.println(errorMsg);
			} 
		
	}
}
	

