package jbjb;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 0;
		char re = 'y';
		char stop = 'n';
		char stop2 = 0;
		

		while (true) {
			count++;
			// 6 개 숫자 설정
			int[] lotto = new int[6];

			for (int i = 0; i < 6; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;
				// 중복된 숫자 없애기
				for (int j = 0; j < i; j++) {
					if (lotto[j] == lotto[i]) {
						i--;
					}
				}
			}
			// 숫자 정렬
			int lineup;
			for (int i = 0; i < lotto.length; i++) {
				for (int j = 0; j < i; j++) {
					if (lotto[i] < lotto[j]) {
						lineup = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = lineup;
					}
				}
			}

//================================================		
			// 1~45 숫자 선택 ( 중복된 숫자X ) 숫자 이외??
			int[] user = new int[6];

			System.out.println("1~45 사이의 숫자를 선택해주세요.");

			for (int i = 0; i < 6; i++) {
				while (true) {
					System.out.print((i + 1) + " 번째 숫자 : ");
					int num = sc.nextInt();
					boolean same = false;

					if (num <= 45 && num >= 1) {
						for (int j = 0; j < i; j++) {
							if (user[j] == num) {
								same = true;
								System.out.println("중복 ㄴㄴ");
								break;
							}
						}
						if (!same) {
							user[i] = num;
							break;
						}
					} else {
						System.out.println("1~45 사이의 숫자만 입력해주세요.");
					}
				}
			}

			int lineup2;
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < i; j++) {
					if (user[i] < user[j]) {
						lineup2 = user[i];
						user[i] = user[j];
						user[j] = lineup2;
					}
				}
			}

			// lotto, user 비교
			int cnt = 0;
			int[] cnt_num = new int[cnt];
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (user[i] == lotto[j]) {
						cnt++;
						break;
					}
				}
			}
			System.out.println("======================================");
			System.out.println("선택한 로또 번호  : " + Arrays.toString(user));
			System.out.println("    로또 당첨 번호 : " + Arrays.toString(lotto));
			int cnt5 = 0;
			int cnt4 = 0;
			int cnt3 = 0;
			int cnt2 = 0;
			int cnt1 = 0;
			
			if (cnt < 3) {
				cnt5++;
				System.out.println(cnt + "개 맞았습니다! " + " 꽝 ");
			} else if (cnt == 3) {
				cnt4++;
				System.out.println(cnt + "개 맞았습니다! 4등 당첨");
			} else if (cnt == 4) {
				cnt3++;
				System.out.println(cnt + "개 맞았습니다! 3등 당첨");
			} else if (cnt == 5) {
				cnt2++;
				System.out.println(cnt + "개 맞았습니다! 2등 당첨");
			} else if (cnt == 6) {
				cnt1++;
				System.out.println(cnt + "개 맞았습니다! 1등 당첨");
			}
			System.out.println("구매 횟수 : " + count);
			System.out.println("1등 : " + cnt1 + "번 " + "| " + "2등 : " + cnt2 + "번 " + "| " + "3등 : " + cnt3 + "번 "
					+ "| " + "4등 : " + cnt4 + "번 " + "| " + "꽝 : " + cnt5 + "번");

			System.out.println("======================================");
			System.out.println("더 하시겠습니까? ( y / n )");
			stop2 = sc.next().charAt(0);

			if (stop2 == stop) {
				System.out.println("게임을 종료합니다.");
				break;
			} else if (stop2 == re) {
				continue;
			}
		}
	}
}
