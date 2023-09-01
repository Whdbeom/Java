package test;

public class Switch_case_Example {

	public static void main(String[] args) {
		
		int fl = 5;
		String name = null;
		
		switch(fl) {
		case 1 : name = "약국";
		case 2 : name = "정형외과";
		case 3 : name = "피부과";
		case 4 : name = "치과";
		case 5 : name = "헬스 클럽";
		}
		System.out.println(fl + "층 " + name + " 입니다");
	

	}

}
