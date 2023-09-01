package completed;

import java.util.Scanner;

public class A11022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		int[] sum = new int[t];
		
		for(int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			sum[i] = a[i] + b[i];
		}
		for(int j=0; j<t; j++) {
			System.out.println("Case #" + (j+1) + ": " + a[j] + " + " + b[j] + " = "+ sum[j]);
		}
		
	}

}