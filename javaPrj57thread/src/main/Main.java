package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("==========스레드==========");
		
//		Thread t0 = Thread.currentThread();
//		t0.setName("내가만든스레드");
//		String t0name = t0.getName();
//		System.out.println(t0name);
		
		Thread t1 = new Thread(new Runnable() {
			Thread x = Thread.currentThread();
			String str = x.getName();
			@Override
			public void run() {
				System.out.println(str + "   t1");
			}
		});
			t1.start();	
			
		Thread t2 = new Thread(new KhClass());
			t2.start();
		
		Thread t3 = new Thread() {
			@Override
			public void run() {
				Thread x = Thread.currentThread();
				String str = x.getName();
				System.out.println(str + "   t3");
			}
		};
			t3.start();
		
		Thread t4 = new Thread( ()->{
			Thread x = Thread.currentThread();
			String str = x.getName();
			System.out.println(str +"   t4");
		});
			t4.start();
		
	} // main
	
}	// class			
	
	

