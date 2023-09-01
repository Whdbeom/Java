package practice;

public class ArrayTest {

	/*
	 		[ 배열 ]
	 	type[] name = new type[size];
	 	변수타입[] 변수이름 = new 변수타입[]
	 	int[] arr = new int[3];	
	 		
 		타입이 같은 변수 여러개를 한번에 만들어줌
 		주의사항 : 처음부터 사이즈를 지정해야함
	 	
	 	다차원 배열
	 	int[][] arr = new int[3][3];
	 	
	 */
	
	public void test() {
		
		//배열 변수 선언
		int[] x;
		
		// 배열 생성 후 배열변수에 할당
		x = new int[3];

		x[0] = 10;
		System.out.println(x[0]);
		
	}
	
	
}
