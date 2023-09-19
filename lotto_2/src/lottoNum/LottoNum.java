package lottoNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import Manager.GameManager;

public class LottoNum {

	public static Scanner sc = new Scanner(System.in);
	public static int bonus = generateBonus();

//	GameManager gm = new GameManager();

	public Set<Integer> generateNum() {
		Set<Integer> num = new TreeSet<Integer>();
		while (num.size() < 6) {
			int randomNum = (int)(Math.random() * 45 + 1);
			num.add(randomNum);
		}
//		num = sortedNumber(num);
		return num;
	}
	
	public static int generateBonus() {
		int x = (int)(Math.random()*45+1);
		return x;
	}
	
	public Set<Integer> selectNum() {
		Set<Integer> num = new TreeSet<Integer>();		
		for(int i = 0; i < 6; i++) {			
			System.out.print((i+1) + "번째 숫자 : ");	
			int x = sc.nextInt();			
			if(x <= 0 || x > 45) {
				System.out.println("      1~45 사이의 숫자만 입력해주세요.");
				i--;
				continue;
			} 
			if(!num.add(x)) {
				System.out.println("      중복되지 않는 숫자를 입력해주세요.");
				i--;
				continue;
			}
			num.add(x);
		}
		return num;
	}
	
	private Set<Integer> sortedNumber(Set<Integer> num) {
		 List<Integer> sorted = new ArrayList<Integer>(num);
		 Collections.sort(sorted);
		  Set<Integer> sortedSet = new HashSet<Integer>(sorted);
		 return sortedSet;
	}


}
