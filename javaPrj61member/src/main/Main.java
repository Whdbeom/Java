package main;

import member.MemberController;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("회원 관리");
		
		MemberController mc = new MemberController();
		
		// 회원가입
//		mc.join();
		// 로그인
		mc.login();
		
	}

}
