package member.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberManager7 {

	private Scanner sc;
	private File f;
	private PrintWriter pw;
	private BufferedReader br;
	
	public MemberManager7() {
		sc = new Scanner(System.in);
		String x = File.separator;
		f = new File("C:" + x + "Users" + x + "종범" + x + "Desktop" + x + "mm7.txt");
	}
	
	public void showMenu() throws Exception {
		System.out.println("====메뉴입력=====");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 유저 보기");
		String select = sc.nextLine();
		
		switch(select) {
		case "1" : join(); break;
		case "2" : login(); break;
		case "3" : showAlluser(); break;
		default : System.out.println("잘못입력");
		}
		
	}


	private void join() throws Exception {
		pw = new PrintWriter(new FileWriter(f, true), true);
		System.out.println("==회원 가입");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		pw.println(id + "#" + pwd + "#" + nick);
		
		System.out.println("회원가입 완료");
		
	}


	String memoNick = null;
	boolean isOk = false;
			
	private void login() throws Exception {
		br = new BufferedReader(new FileReader(f));
		System.out.println("==로그인");
		System.out.print("아이디 :");
		String id = sc.nextLine();
		System.out.print("비밀번호 :");
		String pwd = sc.nextLine();
		
		while(true) {
			String user = br.readLine();
			if(user == null) {
				break;
			}
			int idx = user.indexOf("#");
			int idx2 = user.lastIndexOf("#");
			
			String memoId = user.substring(0, idx);
			String memoPwd = user.substring(idx+1, idx2);
			memoNick = user.substring(idx2+1);
			
			isOk = id.equals(memoId) && pwd.equals(memoPwd);
			if(isOk) {
				break;
			}
		}
		System.out.println("로그인성공");
		System.out.println(memoNick + " ㅎㅇ");
	}


	private void showAlluser() throws Exception {
		br = new BufferedReader(new FileReader(f));
		while(true) {
			String user = br.readLine();
			if(user == null) {
				break;
			}
			System.out.println(user);
		}
	}

}
