package jbjb;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("문자열을입려갷주세요");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			} else {
				System.out.println(str.length() + "글자입니다.");
			}
		}
		
		
		System.out.println("프로그램을ㅈ ㅗㅇ료합니다");
	}
	

}

