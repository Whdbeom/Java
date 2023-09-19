package ch12.sec03.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) { // 클래스 타입
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {
				return true;
			} 
		}
		return false;
		
	}

}
