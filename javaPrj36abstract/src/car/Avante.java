package car;

public class Avante extends Car {



	public Avante() {
		super();
		setName("아반떼");
		setColor("블랙");
		setPrice(50000);
		setSpeed(50);
		
		
	}

	@Override
	public void go() {
		System.out.println( getName() + "간다");
		
	}

	
}
