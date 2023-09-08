package main;

public class HongGilDong extends Person implements Programmer, Fisherman {

	public HongGilDong() {
		super();
		say();
	}

	
	
	String NAME = "홍길동";
	
	@Override
	public void coding() {
		System.out.println(NAME + "코딩중ㅋㅋㅋ");
	}

	@Override
	public void fishing() {
		System.out.println("낚시중ㅎㅎ");
	}
	
}
