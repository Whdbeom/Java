package mob;

public class Pairi  extends Pokemon{

	

	public Pairi() {
		name = "파이리";
		hp = 100;
		atk = 20;
		def = 3;
		super.bodyAttack();
	}
	
	public void skill() {
		System.out.println("파이어볼!");
	}

	public void to() {
		super.toString();
	}
	
}
