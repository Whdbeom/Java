package ch14.sec06.exam01;

public class User1Thread extends Thread{

	private Caculator caculator;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCaculator(Caculator caculator) {
		this.caculator = caculator;
	}

	@Override
	public void run() {
		caculator.setMemory1(100);
	
	}
	
	
	
}
