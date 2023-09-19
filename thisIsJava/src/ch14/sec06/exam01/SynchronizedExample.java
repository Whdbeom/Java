package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {

		Caculator calculator = new Caculator();
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCaculator(calculator);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCaculator(calculator);
		user2Thread.start();
		
		
		
	}

}
