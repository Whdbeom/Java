package ch05.sec12;

public class Practice07 {

	public static void main(String[] args) {
		
		// 7. 주어진 뱅ㄹ 항목에서 최대값을 출력하는 코드를 작성해보세요. (for문 이용)
		
		int[] array = { 1, 5, 3, 8, 2 };
		int num = 0;
		
		for(int i =0; i<array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[j] > array[i]) {
					num = array[j];
				}
			}
		}			System.out.println(num);
	}

}
