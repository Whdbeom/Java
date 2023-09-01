package completed;

import java.util.Scanner;

public class A2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[9];
		int max = 0;
		int count = 0;
		
		for(int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] > max) {
				max = n[i];
			}
		}
		
		for(int i = 0; i < n.length; i++) {
			count++;
			if(max == n[i]) {
				break;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}

}
