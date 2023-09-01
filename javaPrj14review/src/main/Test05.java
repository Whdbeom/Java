package main;

import java.util.Arrays;

public class Test05 {

	public void abc() {
		System.out.println("=====배열=====");
		
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = i + 1;
		}
		System.out.println(Arrays.toString(a));

	}
	
	
}
