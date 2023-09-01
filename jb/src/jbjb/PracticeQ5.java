package jbjb;

public class PracticeQ5 {

	public static void main(String[] args) {

		int a; int b;
		
		for(a = 0; a < 4; a++) {
			for(b = 0; b < (3-a); b++ ) {
				System.out.print("  ");
			}
			for(b = 0; b < (2 * a + 1); b++){			
				System.out.print("*");
			}
			System.out.println("");
		}
		for(a = 0; a < 3; a++) {
			for(b = 0; b < 1 + a; b++) {
				System.out.print("  "); // 1 2 3
			}
			for(b = 0; b < 5 - a; b++ ) {
				System.out.print("*"); // 5 3 1
			}
			System.out.println("");
			}
		}
	}



