package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberController {
	
	// 필드
	private Scanner sc;
	private MemberDao dao;
	
	public MemberController() {
		sc = new Scanner(System.in);
		dao = new MemberDao();
	}


	//회원가입
	public void join() {
		// 데이터 입력받기
		System.out.println("-----회원가입-----");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		// 데이터 뭉치기
		MemberData memberData = new MemberData(id, pwd, nick);
		// 할 일 저장공간(메모장) 에 저장
		boolean result;
		try {
			result = dao.join(memberData);
		} catch (Exception e) {
			result = false;
		}
		// 결과 출력
		if(result) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}
	
	
	//로그인
	public void login() {
		// 데이터 입력받기
		System.out.println("-----로그인-----");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		// 데이터 뭉치기
		MemberData memberData = new MemberData(id, pwd);
		// 할일 // 저장공간에서 꺼낸 데이터랑 비교
		boolean result;
		try {
			result = dao.login(memberData);
		} catch (Exception e) {
			result = false;
		}
		// 결과 출력
		if(result) {
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
	
}
