package ch14.sec06.exam01;

public class User2Thread extends Thread {

	private Caculator caculator;
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void setCaculator(Caculator caculator) {
		this.caculator = caculator;
	}

	@Override
	public void run() {
		caculator.setMemory2(50);
	}
	
	
	
}
