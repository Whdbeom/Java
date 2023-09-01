package jbjb;

public class PracticeQ4 {

	public static void main(String[] args) {
	
	/* 
			반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
			
														  *
														***
													  *****
												    *******
	*/
		
		int a;
		int b;
		
		for(a = 0; a < 4; a++) {
			for(b = 0; b < (3 - a); b++ ) {
				System.out.print("  ");
			}
			for(b = 0; b < (2 * a + 1); b++){
				System.out.print("*"); 
			}
			System.out.println("");
		
		}
	}
}

