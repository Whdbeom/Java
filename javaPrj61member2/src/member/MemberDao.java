package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberDao {

	private PrintWriter pw;
	private BufferedReader br;
	private File f;
	
	public MemberDao() {
		f = new File("C:\\dev\\data.txt");
	}

	public boolean join(MemberData memberData) throws Exception {
		pw = new PrintWriter(new FileWriter(f, true), true);
		
		pw.println(memberData.getId() +"#" + memberData.getPwd() +"#" + memberData.getNick());
		
		pw.close();
		return true;
	}

	public boolean login(MemberData md) throws Exception {
		br = new BufferedReader(new FileReader(f));
		boolean isOk = false;
		String memoNick = null;
		while(!isOk) {
			String memoStr = br.readLine();
			String memoId = memoStr.substring(0, memoStr.indexOf("#"));
			String memoPwd = memoStr.substring(memoStr.indexOf("#")+1, memoStr.lastIndexOf("#"));
			memoNick = memoStr.substring(memoStr.lastIndexOf("#")+1);
					
			boolean idOk = md.getId().equals(memoId);
			boolean pwdOk = md.getPwd().equals(memoPwd);
			
			isOk = idOk && pwdOk;
			
		}
		System.out.println(memoNick + " 님 ㅎㅇ");
		br.close();
		return isOk;
		
	}

	public void showAlluser() throws Exception {
		br = new BufferedReader(new FileReader(f));
		
		while(true) {
			String user = br.readLine();
			if(user == null) {
				break;
			}
			System.out.println(user);
		}
		
	}

	
	
	
}
