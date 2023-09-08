package manager;

import main.Main;
import mob.Pokemon;
import util.Myutil;

public class BattleManager {
	boolean isFinish = false;
	
	public void startBattle() {
		// 두 포켓몬의 정보 출력
		printPokemonInfo();
		
		// 유저 행동 입력 받기 (1. 몸통박치기 2. 스킬)
		while(true) {
			printActionList();
		int num = scanUserAction();	
		// 입력값에 따라 공격
		isFinish = fight(Main.userPokemon, Main.enemyPokemon, num);
		if(isFinish) {
			//결과 출력
			System.out.println("");
			System.out.println("유저 승리!");
			// 배틀 종료
			System.out.println("배틀 종료");
			return;
		}
		System.out.println("");
		// 적 행동 랜덤값에 따라 공격 (1,2)
		isFinish = fight(Main.enemyPokemon, Main.userPokemon, Myutil.getRandom(1, 2));
		if(isFinish) {
			System.out.println("");
			System.out.println("유저 패배");
			System.out.println("배틀 종료");
			return;
		}
		System.out.println("");
		}
	}

	private int scanUserAction() {
		int num = Main.sc.nextInt();
		return num;
	}

	private void printPokemonInfo() {
		System.out.println("유저포켓몬 정보");
		System.out.println(Main.userPokemon);
		System.out.println("");
		
		System.out.println("적 포켓몬 정보");
		System.out.println(Main.enemyPokemon);
		System.out.println("");
	}

	private void printActionList() {
		System.out.println("원하시는 동작을 입력하세요");
		System.out.println("1. 몸통 박치기");
		System.out.println("2. 스킬 사용");
		System.out.println("");
	}

	// 유저 vs 적
	private boolean fight(Pokemon attacker, Pokemon defender, int num) {
		// 공격 메소드 호출
		switch(num) {
		case 1: attacker.bodyAttack(); break;
		case 2: attacker.skill(); break;
		}
		
		//데미지 계산
		int dmg = attacker.getAtk() * num - defender.getDef();
		System.out.println("데미지 : " + dmg);
		//체력 감소
		defender.setHp(defender.getHp() - dmg);
		System.out.println(defender.getName()+ "의 남은 체력 : " + defender.getHp());
		// 죽었는지 체크
		if(defender.getHp() <= 0) {
			return true;
		} else {
			return false;
		}
		
		
		// 배틀 종료
	}
	
	
	// 결과 출력
	
	
	
	
	//행동 목록 보여주기
	
	// 유저 입력 받기

	
}
