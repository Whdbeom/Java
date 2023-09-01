package ch04;



public class Practice04 {

	public static void main(String[] args) {
		
		
		
		while(true) {
			int a = (int)(Math.random()*6) + 1;
			int b = (int)(Math.random()*6) + 1;
			System.out.println("(" + a + ", " + b + ")");
			if((a+b) == 5) {
				System.out.println("주사위의 합이 5가 나왔습니다.");
				break;
			}
			
		}
			
		}

	}


