package main;

public class Main2dArr {

	public static void main(String[] args) {
		
		// 2차원 배열
		
		int[][] x = new int[3][3];
		
		// 9개의 공간 10, 20, 30 ... 90 값 넣기
		
//		x[0][0] = 10;
//		x[0][1] = 20;
//		x[0][2] = 30;
		
		int value = 0;
		for(int i =0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				x[i][j] = value+=10;
			}
		}
		
		// 9개의 값 출력
		System.out.println(x[0][1]);
		
		
		
	}	//main

} // class
