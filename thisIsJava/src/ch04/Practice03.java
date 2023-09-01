package ch04;

public class Practice03 {

	public static void main(String[] args) {
		
		int b = 0;
		
		for(int a = 0; a < 100; a++) {
			if(a%3 ==0) {
				b += a;
			}
		} 
		System.out.println(b);

	}

}
