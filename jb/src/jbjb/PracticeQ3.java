package jbjb;

public class PracticeQ3 {

	public static void main(String[] args) {
		
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
		
		int dan;
		int a;
		
		for(dan = 2; dan <= 9; dan++) {
			for(a = 1; ; a++) {
				System.out.println(dan + "X" + a + "=" + dan*a);
				if(a >= dan)
					break;
			}
			System.out.println();
		}

	}

}
