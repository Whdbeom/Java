package ch04;

public class Practice06 {

	public static void main(String[] args) {
		
		int a;
		int b; int c;
		
		for(a = 1; a <= 6; a++) {
			for(c = 6;  c > a; c--) {
				System.out.print(" ");
			}
			for(b = 1; b<=a ; b++) { 
				System.out.print("*");
			} 
			System.out.println("");		
		}	
	}
}
