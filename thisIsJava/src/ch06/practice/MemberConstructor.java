package ch06.practice;

public class MemberConstructor {

	public static void main(String[] args) {

		Member user1 = new Member("홍길동", "hong");

		System.out.println(user1.name);
		System.out.println(user1.id);
		
System.out.println("=================================");

		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}

}
