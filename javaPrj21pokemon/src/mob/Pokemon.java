package mob;

public class Pokemon {

	// 구성품==멤버 (변수, 메소드)
	
	public String name;
	public int hp;
	public int atk;
	public int def;
	// 접근제한자  public protected default private
	// public - 모든 접근 허용 <-> private 현재 객체 내에서만 허용
	// default - 같은 패키지
	// protected,,

	public int attack() {
		System.out.println("피카");
		return 123;
	}
	
	
}
