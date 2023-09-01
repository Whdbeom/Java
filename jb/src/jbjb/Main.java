package jbjb;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] cost = new int[n];
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();	
			cost[i] = a[i] * b[i];
			sum += cost[i];
		}
		
//		for(int i = 0; i < n; i++) {
//			cost[i] = a[i] * b[i];
//		}
//		
//		for(int i = 0; i < n; i++) {
//			sum += cost[i];
//		}
		
		if ( x == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}


