package manager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import data.User;

public class BankManager {

	public final static Scanner sc = new Scanner(System.in);
	Map<String, User> userList = new HashMap<String, User>();
	boolean login = true;
	User loginUser = null;
	
	public void start() {
		while(login) {
			bankStart();
		}	
		selectMenu(loginUser);
	}
	
	//시작
	public void bankStart() {
		System.out.println("====================어쩌구 은행=====================");
		System.out.println("1.회원가입 2.로그인 3.관리자(없음)");
		System.out.println("================================================");
		int num = 0;
		boolean x = true;
		while(x) {
			try {
			num = sc.nextInt();
			} catch(Exception e) {
				System.out.println("1, 2 중 하나를 입력해주세요.");
				sc.nextLine();
				continue;
			} 
			x = false;
			switch(num) {
			case 1 : join(); break; 
			case 2 : login(); break;
			 default : System.out.println("1, 2 중 하나를 입력해주세요."); break;
			}
		}
	}
	
	
	// 회원가입
	private void join() {
		System.out.println("================================================");
		System.out.println("회원가입");
		System.out.println("================================================");
		
		boolean x = true;
		while(x) {
			System.out.print("계좌번호 : ");
			String acc = sc.next();
			if(userList.containsKey(acc)) {
				System.out.println("중복된 계좌번호입니다.");
			} else {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("비밀번호 : ");
				String password = sc.next();
				System.out.println("계좌가 생성되었습니다.");
				User user = new User(acc, name, password, 50000, 0);
				userList.put(acc, user);
				x = false;
			}
		}
	}
	
	// 아이디 패스워드 입력
	private void login() {
		boolean x = true;
		while(x) {
			System.out.println("================================================");
			System.out.println("로그인");
			System.out.println("================================================");
			System.out.print("계좌번호 : ");
			String acc = sc.next();
			if(!userList.containsKey(acc)){
				System.out.println("계좌가 존재하지 않습니다.");
			} else if(userList.containsKey(acc)) {
				System.out.print("비밀번호 : ");
				String pwd = sc.next();
				if(userList.get(acc).getAccountPwd().equals(pwd)) {
					System.out.println(userList.get(acc).getAccountName() + "님 반갑습니다");
					loginUser = userList.get(acc);
					login = false;
					x = false;
					} else {
					System.out.println("비밀번호가 올바르지 않습니다.");
				}
			}
		}
	}
	
	// 메뉴 선택  출금, 입금, 계좌보기
	public void selectMenu(User x) {
		System.out.println("================================================");
		System.out.println("1. 출금");
		System.out.println("2. 입금");
		System.out.println("3. 계좌 조회");
		System.out.println("================================================");
	}
	//출금
	public void withdraw() {
		
	}
	
	//입금
	public void deposit() {
		
	}
	
	//계좌보기
	public void viewAcc() {
		
	}
	
	//끝내기
	
	
}
