package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberDao {

	private File file;
	private PrintWriter pw;
	private BufferedReader br;
	
	public MemberDao() {
		file = new File("C:\\dev\\data.txt");
	
	}

	public boolean join(MemberData md) throws Exception {
		pw = new PrintWriter(new FileWriter(file, true), true);
		String join = md.getId() + "#" + md.getPwd() + "#" + md.getNick();
		
		if(md.getId().contains("#") || md.getPwd().contains("#")) {
			System.out.println("아이디,비밀번호에 # 을 포함할 수 없습니다.");
			return false;
		}
		
		pw.println(join);
		
		pw.close();
		
		return true;
	}

	public boolean login(MemberData md) throws Exception {
		br = new BufferedReader(new FileReader(file));
		
		boolean login = false;
		
		while(true) {
			String user = br.readLine();
			String memoId = user.substring(0, user.indexOf("#"));
			String memoPwd = user.substring(user.indexOf("#")+1, user.lastIndexOf("#"));
		
			boolean idOk = md.getId().equals(memoId);
			boolean pwdOk = md.getPwd().equals(memoPwd);
			
			login = idOk && pwdOk;
			
			if(login) {
				break;
			}
			
		}
		br.close();
		return login;
	}

	public void user() throws Exception {
		br = new BufferedReader(new FileReader(file));
		
		while(true) {
			String user = br.readLine();
			
			if(user == null) {
				break;
			}
			System.out.println(user);
			
		}
		
	}

	
	
}
