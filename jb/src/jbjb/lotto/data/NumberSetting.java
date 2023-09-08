package jbjb.lotto.data;

import java.util.Scanner;

import jbjb.lotto.main.Main;

public class NumberSetting {
	Scanner sc = new Scanner(System.in);

	// 로또 숫자 번호 설정
	public void lottoNum() {
		int[] lottoNum = Main.getLottoNum();
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = i + 1;
		}
	}
	
	// 당첨 번호 설정
	public void winNum() {
		int[] winNum = Main.getWinNum();
		for(int i = 0; i < winNum.length; i++) {
			int j = (int)(Math.random()*45)+1;
			winNum[i] = j;
		}
	}
	
	// 유저 번호 선택
	public void userNum() {
		int[] userNum = Main.getUserNum();
		for(int i = 0; i < userNum.length; i++) {
			System.out.print(i + 1 + "번째 숫자 : ");
			userNum[i] = sc.nextInt();
			System.out.println("");
		}
	}

	// 번호 정렬
	public void lineUp() {
		int[] winNum = Main.getWinNum();
		int lineup;
		for (int i = 0; i < winNum.length; i++) {
			for (int j = 0; j < i; j++) {
				if (winNum[i] < winNum[j]) {
					lineup = winNum[i];
					winNum[i] = winNum[j];
					winNum[j] = lineup;
				}
			}
		}
	}
	
	// 당첨 번호 대조, 당첨 여부 판별
	public void compareNum() {
		
	}
	
}
