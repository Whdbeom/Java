package mob;

public class Turtle extends Pokemon {

	public Turtle() {
		name = "꼬부기";
		hp = 120;
		atk = 10;
		def = 10;
		super.bodyAttack();
	}	
	public void skill() {
		System.out.println("물대포!");
		
	}

	public void to() {
		super.toString();
	}
}
