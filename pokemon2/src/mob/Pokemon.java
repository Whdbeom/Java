package mob;

import util.Myutil;

public class Pokemon {
	
	//static 변수
	public static final String NAME01 = "피카츄";
	public static final String NAME02 = "꼬마돌";
	public static final String NAME03 = "잠만보";
	private static final int MIN_ATK = 20;
	private static final int MAX_DEF = 10;
	
	// 생성자
	public Pokemon() {
	}
	
	public Pokemon(String name) {
		this.name = name;
		this.hp = 100;
		this.atk = Myutil.getRandom(MIN_ATK, 30);
		this.def = Myutil.getRandom(1, MAX_DEF);
	}

	public Pokemon(String name, int hp, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	// 멤버 변수
	private String name;
	private int hp;
	private int atk;
	private int def;
	
	// 멤버 메소드
	public void bodyAttack() {
		System.out.println(name + "의 몸통박치기!");
	}		
	
	public void skill() {
		System.out.println(name + "의 스킬 어쩌구");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}
	
	
}
