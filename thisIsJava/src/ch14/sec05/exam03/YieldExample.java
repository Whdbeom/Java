package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {

		WorkThread workThreadA = new WorkThread("workThradA");
		WorkThread workThreadB = new WorkThread("workThradB");
		workThreadA.start();
		workThreadB.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			workThreadA.work = false;
		}

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			workThreadA.work = true;
		}
		
	}

}
