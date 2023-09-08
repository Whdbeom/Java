package mob;

public class Pokemon {

	
	
	public Pokemon() {
		super();
	}

	
	public Pokemon(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}



	// 멤버 변수
	protected String name;
	protected int hp;
	
	// 멤버 메소드
	public void bodyAttack() {
		System.out.println(name + "의 몸통박치기");
	}
	
	public void skill() {
		System.out.print(name);
	}
	
	
}
