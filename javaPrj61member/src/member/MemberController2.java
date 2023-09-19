package member;

import java.util.Scanner;

public class MemberController2 {

	private Scanner sc;
	private MemberDao2 dao;
	
	public MemberController2() {
		sc = new Scanner(System.in);
		dao = new MemberDao2();
	}

	public void showMenu() {
			System.out.println("=====회원관리=====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			String select = sc.nextLine();
			
			switch(select) {
			case "1" : join(); break;
			case "2" : login(); break;
			default : System.out.println("잘못눌렀어용");
			
		}
	}
	
	public void join() {
		System.out.println("-----회원가입-----");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		
	    MemberData2 memberData = new MemberData2(id, pwd, nick);

	    boolean result;
	    try {
	    	result = dao.join(memberData);
		} catch (Exception e) {
			result = false;
		}
	    if(result) {
	    	System.out.println("회원가입 성공");
	    } else {
	    	System.out.println("회원가입 실패");
	    }
	}

	public void login() {
		System.out.println("-----로그인-----");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		MemberData2 memberData = new MemberData2(id, pwd);
		boolean result;
		try {
			result = dao.login(memberData);
		} catch (Exception e) {
			result = false;
		}
	    if(result) {
	    	System.out.println("로그인 성공");
	    } else {
	    	System.out.println("로그인 실패");
	    }
	}

}
