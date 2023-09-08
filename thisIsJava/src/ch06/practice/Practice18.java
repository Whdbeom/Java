package ch06.practice;

public class Practice18 {

	public static void main(String[] args) {
	
		Practice18Singleton obj1 = Practice18Singleton.single();
		Practice18Singleton obj2 = Practice18Singleton.single();
	
		if(obj1 == obj2) {
			System.out.println("같아요");
		} else {
			System.out.println("달라요");
		}
	}
}
