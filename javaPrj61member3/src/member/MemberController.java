package member;

import java.util.Scanner;

public class MemberController {

	private Scanner sc;
	private MemberDao dao;
	
	public MemberController() {
		sc = new Scanner(System.in);
		dao = new MemberDao();
	}

	public void showMenu() {
		boolean exit = false;
		while(!exit) {
			System.out.println("=====메뉴선택=====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 유저 보기");
			System.out.println("4. 종료");
			String select = sc.nextLine();
			
			switch(select) {
			case "1" : join(); break;
			case "2" : login(); break;
			case "3" : showAlluser(); break;
			case "4" : exit = true; System.out.println("ㅂㅂ2"); break;
				default : System.out.println("잘못입력했습니다");
			}
		}
		
	}

	private void join() {
		System.out.println("=====회원가입=====");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		MemberData md = new MemberData(id, pwd, nick);
		
		boolean result = false;
		try {
			result = dao.join(md);
		} catch (Exception e) {
			result = false;
		}
		if(result) {
			System.out.println("회원가입하셨습니다");
		} else {
			System.out.println("회원가입 실패");
		}
		
		
	}

	private void login() {
		System.out.println("=====로그인=====");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		MemberData md = new MemberData(id, pwd);
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

	private void showAlluser() {
		try {
			dao.user();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
