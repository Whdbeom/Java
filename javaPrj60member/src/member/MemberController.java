package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberController {

	// 멤버변수 == 필드 == 객체변수 == 인스턴스 변수
	private Scanner sc;
	private MemberDao md = new MemberDao();
	
	// 기본 생성자 (==매개변수가 없는 생성자)
	public MemberController() {
		sc = new Scanner(System.in);
//		String x = File.separator;
	}
	
	public void selectMenu() throws Exception {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("메뉴선택하세요");
		String select = sc.nextLine();
		
		switch(select) {
		case "1": join(); break;
		case "2": login(); break;
		default : System.out.println("잘못선ㅌ택햇어");
		}
	}
	
	// 회원가입
	public void join() throws Exception {
		// 아이디, 비번, 닉네임 입력받기
		System.out.println("==회원 가입==");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		// 저장
//		id,pwd,nick 이용해서 MemberData 객체 만들기
		MemberData memberData = new MemberData(id, pwd, nick);
//		md.join(MemberData 객체);
		boolean result = md.join(memberData);
		
		// 결과출력
		if(result) {
			System.out.println(nick + "님 가입성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}
	
	
	// 로그인
	public void login() throws Exception {
		// 아이디, 비번 입력받기
		System.out.println("==로그인==");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		// 입력 받은 데이터 뭉치기
		 MemberData memberData = new MemberData(id, pwd);
	
		// 저장된 데이터 꺼내기
//		MemberData user = md.login(id, pwd);
		MemberDao dao = new MemberDao();
		boolean isSuccess = dao.login(memberData);
		// 결과출력
		if(isSuccess) {
			System.out.println("   ||   로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
//	}
	
	}
}
