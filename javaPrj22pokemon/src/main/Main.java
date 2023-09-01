package main;

import battle.BattleManager;
import mob.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		// 포켓몬 배틀
		BattleManager bm = new BattleManager();
		bm.battleStart();
		
//		//포켓몬 객체 생성
//		Pokemon x = new Pokemon();
//		Pokemon y = new Pokemon();
//		Pokemon z = x;
//		
//		//객체 안의 변수들에 값 넣기
//		x.name = "피카츄";
//		x.hp = 100000;
//		x.atk = 100000;
//		
//		//객체 안의 변수들 호출해보기
//		System.out.println("name : " + x.name);
//		System.out.println("hp : " + x.hp);
//		
//		System.out.println(z.name);
//		//객체의 attack 메소드 호출하기
//		x.attack();
		
	}

}
