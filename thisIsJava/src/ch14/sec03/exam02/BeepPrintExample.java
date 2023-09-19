package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// 작업1
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try { 
						Thread.sleep(1000); 
					} catch(Exception e) {
					}
				}
			}
		});
		
		thread.start();
	
		
		
		// 작업2
//		for(int i = 0; i < 5; i++) {
//			System.out.println("띵");
//			try { 
//				Thread.sleep(1000); 
//			} catch(Exception e) {
//			}
//		}
		Runnable task = new Task();
		Thread thread2 = new Thread(task);
		
		thread2.start();
	}

}
