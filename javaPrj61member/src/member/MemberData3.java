package member;

public class MemberData3 {
	
	
	
	public MemberData3(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	public MemberData3(String id, String pwd, String nick) {
		super();
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

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	@Override
	public String toString() {
		return "MemberData3 [id=" + id + ", pwd=" + pwd + ", nick=" + nick + "]";
	}

	
	
}
