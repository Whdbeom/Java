package main;

public class KhClass implements Runnable {

	@Override
	public void run() {
		Thread x = Thread.currentThread();
		String str = x.getName();
//		while(true) {
			System.out.println(str + "   t2");
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//			}
//		}
	}
}
