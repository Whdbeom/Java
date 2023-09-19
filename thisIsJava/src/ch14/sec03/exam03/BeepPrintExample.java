package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		// 작업 1
		
		Thread thread = new Thread() { 
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
//					System.out.println("뿅");
					toolkit.beep();
					try { 
						Thread.sleep(1000); 
					} catch(Exception e) {
					}
				}
			}
		};
		thread.start();
		
		// 작업2
//		for(int i = 0; i < 5; i++) {
//			System.out.println("띵");
//			try { 
//				Thread.sleep(1000); 
//			} catch(Exception e) {
//			}
//		}
		PrintThread pt = new PrintThread();
		pt.start();
		
	}

}
