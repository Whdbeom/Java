package Manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import lottoNum.LottoNum;
import test.Test;

public class Draw {
	
	LottoNum lottoNum = new LottoNum();
//	GameManager gameManager = new GameManager();
	int bonus;
	int[] rankCount = new int[6];
	List<Integer> count = new ArrayList<Integer>();
		
	public void startDraw() {
		System.out.println("======================================");
		System.out.println("추첨중...");
		System.out.println("선택하신 번호 : " + GameManager.userNum);
		GameManager.comNum = lottoNum.generateNum();
		System.out.println("로또 당첨 번호 : " + GameManager.comNum + "     보너스 번호 : " + LottoNum.bonus);
		System.out.println("======================================");
		drawLotto(GameManager.userNum, GameManager.comNum);
		rank();
		System.out.println("==============================================================");
		int sum = Arrays.stream(rankCount).sum();
		System.out.println("1등 : " + rankCount[1] + "회    |   2등 : " + rankCount[2] + "회    |   3등 : " 
		+ rankCount[3] + "회    |   4등 : " + rankCount[4] +"회    |   5등 : " + rankCount[5]  + "회    |   낙첨 : " + rankCount[0]
				+ "       |   시행 횟수 : " + sum);
		System.out.println("==============================================================");
		count.clear();
	}
	
	
	public void drawLotto(Set<Integer> user, Set<Integer> com) {
		List<Integer> userNum = new ArrayList<Integer>(user);
		List<Integer> comNum = new ArrayList<Integer>(com);
		
		for(int i = 0; i < 6; i++) {
			if(userNum.get(i) == LottoNum.bonus) {
				bonus = userNum.get(i); 
			}
			for(int j = 0; j < 6; j++) {
				if(userNum.get(i) == comNum.get(j)) {
					count.add(userNum.get(i));
				}				
			}
		}
		System.out.print("일치한 숫자 : " + count .size() + "개  ");
		for(int i = 0; i < count.size(); i++) {
			System.out.print("  [" + count.get(i) + "]");
		}
		System.out.println("");
		System.out.println("맞춘 보너스 번호 : " +  bonus);
	}
	/* 
	 * 1등 6개
	 * 2등 5개 + 보너스
	 * 3등 5개
	 * 4등 4개
	 * 5등 3개
	 */
	
	public void rank() {
		switch(count.size()) {
		case 0: rankCount[0]++; System.out.println("낙첨입니다."); break;
		case 1:  rankCount[0]++; System.out.println("낙첨입니다."); break;
		case 2: rankCount[0]++; System.out.println("낙첨입니다."); break;
		case 3: rankCount[5]++; System.out.println("5등 당첨입니다."); break;
		case 4: rankCount[4]++; System.out.println("4등 당첨입니다."); break;
		case 5: 
			if(bonus != 0) {
				 rankCount[2]++;
				System.out.println("2등 당첨입니다."); break;
			} else {
				rankCount[3]++;
				System.out.println("3등 당첨입니다."); break;
			}
		case 6: rankCount[1]++; System.out.println("1등 당첨입니다"); break;
			
		}
	}
	
	
}
