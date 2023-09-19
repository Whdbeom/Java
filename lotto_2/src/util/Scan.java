package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {

	public static Scanner sc = new Scanner(System.in);

	public int scan() {
		boolean stop = true;
		int x = 0;
		while(stop) {
			try {
//				System.out.print("입력 : ");
				x = sc.nextInt();
				stop = false;
			} catch(InputMismatchException a) {
				sc.nextLine();
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
					continue;
			} 
		}	
		return x;
	}
	
	public static void main(String[] args) {
		
		Scan scan = new Scan();
		scan.scan();
	}
	
}
