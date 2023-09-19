package member;

public class MemberData2 {

	public MemberData2(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public MemberData2(String id, String pwd, String nick) {
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
	}
	
	private String id;
	private String pwd;
	private String nick;
	
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getNick() {
		return nick;
	}
	
	@Override
	public String toString() {
		return "[ 아이디 : " + id +" / 비밀번호 : "+pwd +" / 닉네임 : "+nick + " ]";
	}
	
}
