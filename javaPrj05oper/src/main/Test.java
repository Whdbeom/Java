package main;

public class Test {

	public static void main(String[] args) {
		
		System.out.println( !(10 < 20 && 10 > 20));

		int no = -5;
		System.out.println(no == 0 ? "영" : ( no > 0 ? "양수" : "음수"));

		int age = 25;
		
		boolean isAdult = age >= 20;
		
		System.out.println(age + "살이면, 성인이 맞는지?  " +  isAdult);
		System.out.println(isAdult);
		
		System.out.println("=====================");
		
		double pi = 3.14;
		int r = 10;
		
		System.out.println(pi + r);
		
		byte x = (byte)128;
		byte y = (byte)129;
	    System.out.println(x);
	    System.out.println(y);
	}

}
