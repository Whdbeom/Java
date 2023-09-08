package mob;

public class Pikachu extends Pokemon {
	
	public Pikachu() {
		name = "피카츄";
		hp = 100;
		atk = 30;
		def = 5;
		super.bodyAttack();
	}
	
	public void skill() {
		System.out.println("백만볼트!");
	}
	
	public void to() {
		super.toString();
	}
	
	
	
} // class
