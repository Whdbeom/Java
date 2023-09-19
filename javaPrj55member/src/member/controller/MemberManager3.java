package member.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberManager3 {

	private Scanner sc;
	private File f;
	private PrintWriter pw;
	private BufferedReader br;
	
	public MemberManager3() throws Exception {
		sc = new Scanner(System.in);
		f = new File("C:\\Users\\종범\\Desktop\\mm3.txt");
//		pw = new PrintWriter(new FileWriter(f, true), true);
	}

	public void showMenu() throws Exception {
		System.out.println("======메뉴======");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 전체 회원 조회");
		System.out.println("원하시는 메뉴 번호를 선택하세요.");
		String menu = sc.nextLine();
	
		switch(menu) {
		case "1" : join(); break;
		case "2" : login(); break;
		case "3" : showAlluser(); break;
			default : System.out.println("잘못 눌렀어요");
		}
	}
	
	private void join() throws Exception {
		pw = new PrintWriter(new FileWriter(f, true), true);
		
		System.out.println("----회원가입-----");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		System.out.print("닉네임 :  ");
		String nick = sc.nextLine();
		
		boolean isError = id.contains("/");
		
		if(isError) {
			throw new Exception("ID에는 /을 사용할 수 없다");
		}
		
		pw.println(id + "/" + pwd + "/" + nick );
		pw.close();
		System.out.println("회원가입 완료");
	}


	private void login() throws Exception {
		br = new BufferedReader(new FileReader(f));
		System.out.println("-----로그인-----");
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		boolean isOk = false;
		String memoNick = null;
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			int idx = str.indexOf("/");
			String memoId = str.substring(0, idx);
			int idx2 = str.lastIndexOf("/");
			String memoPwd = str.substring(idx+1, idx2);
			memoNick = str.substring(idx2+1);
			
			isOk = memoId.equals(id) && memoPwd.equals(pwd);
			if(isOk) {
				break;
			}
					
		}
			if(isOk) {
				System.out.println("로그인성공");
				System.out.println(memoNick + "님 ㅎㅇ");
			} else {
				System.out.println("로그인 실패");
			}
		br.close();
	}
	
	private void showAlluser() throws Exception {
		br = new BufferedReader(new FileReader(f));
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			} 
			System.out.println(str);
		}
		
	}

	
	
}
