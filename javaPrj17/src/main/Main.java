package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int cnt = 0;
		
		for(int a = 1; a <= i; a++) {
			if(i%a == 0){
				cnt++;
			} 
		} if(cnt == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
		


	}

}
