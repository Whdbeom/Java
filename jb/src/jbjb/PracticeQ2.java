package jbjb;

public class PracticeQ2 {

	public static void main(String[] args) {

		// 구구단을 짝수 단만 출력하도록 프로그램을 만들어보세요.
		
		int dan;
		int a;
		
		for(dan = 2; dan <= 9; dan++) {
			if((dan % 2) != 0)
				continue;
			for(a = 1; a <= 9; a++) {
				System.out.println(dan + "X" + a + "=" + dan*a);
			}
			System.out.println();
			}
			
	}

}
