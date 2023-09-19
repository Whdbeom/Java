package member.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberManager4 {

	private Scanner sc = new Scanner(System.in);
	private String x = File.separator;
	private File f  = new File("C:" + x +"Users" + x + "종범" + x + "Desktop" + x +"mm4.txt");
	private FileWriter fw;
	private BufferedReader br;
	private PrintWriter pw;
	
//	
//	public MemberManager4() {
//	}





	public void showMenu() throws Exception {
		System.out.println("-----메뉴 선택-----");
		System.out.println("1. 회원 가입");
		System.out.println("2. 로그인");
		System.out.println("3. 모든 유저 보기");
		System.out.println("메뉴를 선택해주세요");
		String select = sc.nextLine();
		
		switch(select) {
		case "1" : join(); break;
		case "2" : login(); break;
		case "3" : showAlluser(); break;
			default : System.out.println("잘못 입력하셨습니다.");
		}
	}

	private void join() throws Exception {
		pw = new PrintWriter(new FileWriter(f, true), true);
		System.out.println("----회원가입----");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
	
		boolean isError = id.contains("#");
		if(isError) {
			throw new Exception("아이디에 # 불가능");
		} 
		pw.println(id + "#" + pwd + "#" + nick);
		pw.close();
		System.out.println("회원가입 완료");
	}
		
	
	private void login() throws Exception {
		br = new BufferedReader(new FileReader(f));
		System.out.println("-----로그인----");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		String memoNick = null;
		boolean isOk = false;
		while(true) {
			String str = br.readLine();
			if(str == null){
				break;
			}
			int idx = str.indexOf("#");
			int idx2 = str.lastIndexOf("#");
			
			String memoId = str.substring(0, idx);
			String memoPwd = str.substring(idx+1, idx2);
			memoNick = str.substring(idx2+1);
			
			isOk = memoId.equals(id) && memoPwd.equals(pwd);
			if(isOk) {
				break;
			}		
		}
		if(isOk) {
			br.close();
			System.out.println("로그인 성공");
			System.out.println(memoNick + "님 ㅎㅇ");
		}
		
	}
	
	private void showAlluser() throws Exception {
		br = new BufferedReader(new FileReader(f));
		while(true) {
			String user = br.readLine();
			if(user == null) {
				break;
			}
//			br.close();
			System.out.println(user);
		}
	}

}
