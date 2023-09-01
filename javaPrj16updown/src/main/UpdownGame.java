package main;

import java.util.Scanner;

public class UpdownGame {

	public void printStartMsg() {	
		System.out.println("======================");
		System.out.println("게임을 시작합니다");
		System.out.println("======================");	
	}
	
	public void printGameInfo() {		
		System.out.println("1~100 사이 숫자를 입력해주세요.");
		System.out.println("자연수만 입력 가능");
		System.out.println("정답을 맞출때까지 반복");
		System.out.println("마지막에 시도횟수가 나옴");	
	}
	
	public int prepareRandomAnswer() {
		return (int)(Math.random()*100+1);
	}
	
	public int scanUserInput() {
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public boolean judgeUpDown(int answer, int user) {		
		if(user == answer) {
			System.out.println("정답");
			return true;
		} else if(user > answer) {
			System.out.println("다운");
			return false;
		} else {
			System.out.println("업");
			return false;
		}
		
	}
	
	
}
