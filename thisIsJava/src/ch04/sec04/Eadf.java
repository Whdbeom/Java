package ch04.sec04;

public class Eadf {

	public static void main(String[] args) {
		
		int[] arr1;
		int[] arr2;
		int[] arr3;
		// 배열변수 arr1~3 선언
		
		arr1 = new int[] {1, 2, 3};		// 배열을 생성하고 arr1 변수에 대입
		arr2 = new int[] {1, 2, 3};	// 배열을 생성하고 arr2 변수에 대입
		arr3 = arr2;		// 배열변수 arr2의 값을 변수 arr3 에 대입
		
		System.out.println(arr1 == arr2);  // arr1과 arr2 변수가 같은 배열을 참조하는지 검사
		System.out.println(arr2 == arr3);	// arr2와 arr3 변수가 같은 배열을 참조하는지 검사
		

	}

}