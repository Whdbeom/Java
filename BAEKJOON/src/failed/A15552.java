package failed;

import java.util.Scanner;

public class A15552 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		
		for(int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < t; i++) {
			System.out.println(a[i] + b[i]);			
		}
		
	}

}
// 시간초과 
// BufferedReader와 BufferedWriter BufferedWriter.flush