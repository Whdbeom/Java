package member.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberManager2 {

	// 멤버변수 (==필드)
	private Scanner sc;
	private File f;
	private PrintWriter pw;
	private BufferedReader br;
	
	public MemberManager2() throws Exception {
		sc = new Scanner(System.in);
		String x = File.separator;
		f = new File("C:\\Users\\종범\\Desktop\\text.txt");
		pw = new PrintWriter(new FileWriter(f, true), true);
	}

	
	// 메뉴
	public void showMenu() throws Exception {
		System.out.println("=====메뉴=====");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 전체 회원 조회");
		System.out.println("원하시는 메뉴 번호를 선택하세요");
		String menu = sc.nextLine();
		
		switch(menu) {
		case "1" : join(); break;
		case "2" : login(); break;
		case "3" : selectAlluse(); break;
		}
	}


	// 회원가입
	private void join() throws Exception {
		br = new BufferedReader(new FileReader(f));
		System.out.println("-----회원가입-----");
		// 유저한테 데이터 입력 받기
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		// 데이터 검사
		boolean isError = id.contains("#");
		
		if(isError) {
			throw new Exception("ID 에는 #을 사용할 수 없습니다.");
		}
		
		// 파일메모장에 저장하기
		pw.println(id + "#" + pwd + "#" + nick);
		pw.close();
		System.out.println("회원가입 완료~~@#!");
		
	} 

	// 로그인
	private void login() throws Exception {
		br = new BufferedReader(new FileReader(f));
		System.out.println("-----로그인-----");
		// 유저한테 데이터 입력받기
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		boolean isOk = false;
		String memoNick = null;
		
		while(true) {
			//파일에서 회원정보 조회
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			// 파일 정보에서 id, pwd만 꺼내기
			int idx = str.indexOf("#");
			String memoId = str.substring(0, idx);
			int idx2 = str.lastIndexOf("#");
			String memoPwd = str.substring(idx + 1, idx2);
			memoNick = str.substring(idx2+1);
			
			// 회원 정보 일치 확인
			isOk = memoId.equals(id) && memoPwd.equals(pwd);
			if(isOk) {
			}
		} // while end
	
		if(isOk) {
			System.out.println("로그인 성공");
			System.out.println(memoNick + "님 ㅎㅇ");
		} else {
			System.out.println("로그인 실패");
		}
	
	} // login end


	private void selectAlluse() throws Exception {
		br = new BufferedReader(new FileReader(f));
		// 파일에서 모든 정보 읽기
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
	
	}
	
	
	// 데이터 검사
	
	// 파일(메모장)에 저장하기
	
	// 로그인

}
