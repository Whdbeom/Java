package failed;

import java.util.Arrays;
import java.util.Scanner;

public class A5597 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] stu = new int[30];
		int[] stu2 = new int[28];
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0; i < stu.length; i++) {
			stu[i] = i+1;
		}
		for(int i = 1; i <= stu2.length; i++) {
			stu[i] = sc.nextInt();
		}
		
		for(int i = 0; i < stu.length; i++) {
			for(int j = 0; j < stu2.length; j++) {
				if(stu[i] == stu2[j]) {
		
				}
			}
		}
		
	}

}
