package member;

import java.util.Scanner;

public class MemberController3 {

	private Scanner sc;
	private MemberDao3 dao;
	
	public MemberController3() {
		sc = new Scanner(System.in);
		dao = new MemberDao3();
	}

	public void showMenu() {
		System.out.println("메뉴선택");
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		String sel = sc.nextLine();
		
		switch(sel) {
		case "1" : join(); break;
		case "2" : login(); break;
		default : System.out.println("ㅈ라못눌럿어");
		}
	}
	
	public void join() {
		System.out.println("-----회원 가입-----");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		MemberData3 md = new MemberData3(id, pwd, nick);

		boolean result = false;
		try {
			result = dao.join(md);
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
		
		MemberData3 md = new MemberData3(id, pwd);
		
		boolean result = false;
		try {
			result = dao.login(md);
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
