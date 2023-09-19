package main;


public class Main {

	public static void main(String[] args) {

		System.out.println("=====쓰레드=====");
		
		// 현재 스레드 이름 확인
//		Thread x = Thread.currentThread();
//		System.out.println(x.getName());
		
		Thread x = new Thread(new KhClass());
		x.start();
		
		Thread y = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
				System.out.println("2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				}
			}
		});
		
		y.start();
		
		Thread z = new Thread(  ()->{
			for(int i = 0; i < 5; i++) {
				System.out.println("3");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		} );
		
		z.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		
	} // main

} // class
