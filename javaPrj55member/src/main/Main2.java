package main;

import java.lang.reflect.Member;

import member.controller.MemberManager;
import member.controller.MemberManager2;

public class Main2 {

	public static void main(String[] args) throws Exception {

		System.out.println("=================회원 관리 프로그램");
		
		MemberManager2 mm = new MemberManager2();
		while(true) {
		mm.showMenu();
		}
		
	}

}
