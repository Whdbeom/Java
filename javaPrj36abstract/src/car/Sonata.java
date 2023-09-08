package car;

public class Sonata extends Car {

	public Sonata() {
		super();
		
		setName("소나타");
		setPrice(1000000);
		setSpeed(300);
		setColor("Black");
	}
	@Override
	public void go() {
		System.out.println("휘발유 사용");
		System.out.println("간다 " + getName());
	}
}
