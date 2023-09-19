package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import data.Member;

public class MemberManager {
	
	// 멤버 변수
	private Scanner sc = new Scanner(System.in);
	private HashMap<String, Member> memberMap = new HashMap<String, Member>();
	
	
	// 시작
	public void start() {
		boolean x = true;
		while(x) {	
			showMenu();
	//		String Input = scanUserString();
			switch(sc.next()) {
				case "1": join(); break;
				case "2": login(); break;
				case "3" : x = false; break;
				default : System.out.println("잘못 고름");
			}
		}
	}
	
	
	// 메뉴 보여주기
	private void showMenu() {
		System.out.println("=======================");
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.종료");
		System.out.println("=======================");
	}
	
	// 입력 받기
	private String scanUserString() {
		return sc.next();
	}
	
	// 회원가입
	private void join() {
		System.out.println("회원가입");
		System.out.println("=======================");
		System.out.print("아이디 입력 : ");
		String id = scanUserString();
		System.out.print("비밀번호 입력 : ");
		String pwd = scanUserString();
		System.out.print("닉네임 입력 : ");
		String nick = scanUserString();
		Member member = new Member(id, pwd, nick);
		
		try {
		// 값 검증
		checkValidation(member);
		
		// 맴버 객체 저장하기
		memberMap.put(id, member);
		System.out.println(nick + "님 회원가입 완료!");
		} catch(Exception e) {
			System.out.println("다시 시도해주세요.");
		}
	}
	
	private void checkValidation(Member m) throws Exception{
	
		// 아이디 검사
		checkId(m.getId());
		// 비밀번호 검사
		checkPwd(m.getPwd());
		// 닉네임 검사
		checkNick(m.getNick());
	}

	
	private void checkId(String id) throws Exception{
		if(id.length() < 4) {
			System.out.println("아이디가 너무 짧아요");
			throw new Exception();
		} 					
	}
	
	private void checkPwd(String pwd) {
		
	}

	private void checkNick(String nick) {
		// TODO Auto-generated method stub
		
	}





	// 로그인
	private void login() {
		System.out.println("로그인");
		System.out.println("=======================");
		System.out.print("아이디 : ");
		String userId = scanUserString();
		System.out.print("비밀번호 : ");
		String userPwd = scanUserString();
		Member x = memberMap.get(userId);
		boolean result = userId.equals(x.getId()) && userPwd.equals(x.getPwd());
		
		if(result) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패.....");
		}
	}
	
	private void login2() {
		System.out.println("로그인");
		System.out.println("=======================");
		System.out.print("아이디 : ");
		String id = scanUserString();
		if(memberMap.get(id) == null) {
			System.out.println("존재하지 않는 아이디 입니다.");
		} else {		
		System.out.print("비밀번호 : ");
		String pwd = scanUserString();
			if(memberMap.get(id).getPwd().equals(pwd)) {
				System.out.println(memberMap.get(id).getNick() + "님 반갑습니다.");
			} else {
				System.out.println("비밀번호가 올바르지 않습니다.");
			}
		}
	}
	
} // class
