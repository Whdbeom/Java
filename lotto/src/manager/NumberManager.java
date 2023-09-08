package manager;

import java.util.Scanner;

import data.Lotto;
import main.Main;

public class NumberManager {

	
	Lotto lotto = new Lotto();
	// 스캐너
	public int userInput() {
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		return userInput;
	}
	
	// 5자리 숫자 + 보너스번호..?
	public void makeNumber() {
		for(int i = 0; i < Lotto.comNum.length - 1; i++) {
			Lotto.comNum[i] = lotto.getLottonum();
		}
		duplicate();
		comLineUp();
//		return Lotto.comNum;
	}
	
	// 보너스번호 1개 만들기
	public int makeBonus() {
		int num = (int)(Math.random()*45+1);
		return num;
	}
	
	// 유저 숫자 입력받기
	public void userNum() {
		System.out.println("1~45의 숫자 5개를 입력해주세요.");
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번째 숫자 : ");
			
			userInput();
			Lotto.userNum[i] = userInput();
		}
		userLineUp();
//		return Lotto.userNum;
	}
	
	// 중복 제거
	private void duplicate() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				if (Lotto.comNum[j] == Lotto.comNum[i]) {
					i--;
				}
			}
		}
	}
	
	// 오름차순 정렬
	private void comLineUp() {
		int lineup;
		for (int i = 0; i < Lotto.comNum.length-1; i++) {
			for (int j = 0; j < i; j++) {
				if (Lotto.comNum[i] <Lotto.comNum[j]) {
					lineup = Lotto.comNum[i];
					Lotto.comNum[i] = Lotto.comNum[j];
					Lotto.comNum[j] = lineup;
				}
			}
		}
	}
	
	// 유저 숫자도 정렬
	private void userLineUp() {
		int lineup;
		for (int i = 0; i < Lotto.userNum.length-1; i++) {
			for (int j = 0; j < i; j++) {
				if (Lotto.userNum[i] <Lotto.userNum[j]) {
					lineup = Lotto.userNum[i];
					Lotto.userNum[i] = Lotto.userNum[j];
					Lotto.userNum[j] = lineup;
				}
			}
		}
	}
	
	// 당첨 여부 판별
	
	public int prize() {
		for(int i = 0; i < Lotto.userNum.length-1; i++) {
			for(int j = 0; i < Lotto.comNum.length-1; j++) {
				if(Lotto.userNum[i] == Lotto.comNum[j]) {
					Main.count++;
					break;
				}
			}
		}
		return Main.count;
	}
	
	
	
} // class
