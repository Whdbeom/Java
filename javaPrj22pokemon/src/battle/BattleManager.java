package battle;

import mob.Pokemon;

public class BattleManager {
	
	// 승자
	String winner = null;	// 멤버변수
	
	Pokemon p1 = null;
	Pokemon p2 = null;
	
	//포켓몬 생성 메소드
	public void generatePokemon() {
		this.p1 = new Pokemon();
		this.p1.name = "피카츄";
		this.p1.hp = 100;
		this.p1.atk = 30;
		
		this.p2 = new Pokemon();
		this.p2.name = "파이리";
		this.p2.hp = 90;
		p2.atk = 33;
	}

	// 배틀 시작 메소드
	public void battleStart() {
		
		// 포켓몬 2마리 생성
		this.generatePokemon();
		
		//반복문
		while(this.winner == null) {
			mobAttack(p1, p2); // parameter 매개변수
			if(winner != null) {break;}
			mobAttack(p2, p1);
			if(winner != null) {break;}
		}
		
		// 결과 출력
		System.out.println(winner);
		
	}
	
	public void mobAttack(Pokemon attacker, Pokemon deffenser) {
		// 번갈아가며 공격 (출력) - p1 공격
		System.out.println(attacker.name + "이(가) " + deffenser.name + "를 공격함" );
		// 공격마다 데미지 계산 하여 체력 수정
		deffenser.hp -= attacker.atk; // p1 이 p2를 공격
		// 승패 판단
		if(deffenser.hp <= 0) {
			 winner = attacker.name;
		}
	}
	
} // class
