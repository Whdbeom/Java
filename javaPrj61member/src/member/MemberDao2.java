package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberDao2 {
	
	private File file; 
	private BufferedReader br;
	private PrintWriter pw;
	
	public MemberDao2() {
		file = new File("C:\\dev\\data2.txt");
	}

	public boolean join(MemberData2 memberData) throws Exception {
		pw = new PrintWriter(new FileWriter(file, true), true);
		String user = memberData.getId() +"#" + memberData.getPwd() + "#" + memberData.getNick();
		pw.println(user);
		pw.close();
		return true;
	}

	public boolean login(MemberData2 memberData) throws Exception {
		br = new BufferedReader(new FileReader(file));
		boolean isOk;
		while(true) {
			String user = br.readLine();
			String memoId = user.substring(0, user.indexOf("#"));
			String memoPwd = user.substring(user.indexOf("#")+1, user.lastIndexOf("#"));
			
			boolean id = memoId.equals(memberData.getId());
			boolean pwd = memoPwd.equals(memberData.getPwd());
			
			isOk = id && pwd;
			if(isOk) {
				br.close();
				break;
			}
		}
		return isOk;
	}

	
	
}
