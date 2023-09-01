package failed;

import java.util.Scanner;

public class A10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int max = -1000000;
		
		for(int i =0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int min = 1000000;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}
			if(arr[i] <= min) {
				min = arr[i];
			}
		}
		System.out.print(min + " ");
		System.out.print(max);
	}

}
