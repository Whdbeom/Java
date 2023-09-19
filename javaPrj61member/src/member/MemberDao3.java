package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberDao3 {

	private File file;
	private PrintWriter pw;
	private BufferedReader br;
	
	public MemberDao3() {
		file = new File("C:\\dev\\data3.txt");
	}

	public boolean join(MemberData3 md) throws Exception {
		pw = new PrintWriter(new FileWriter(file, true),true);
		String user = md.getId() +"#"+ md.getPwd() +"#" + md.getNick(); 
		pw.println(user);
		pw.close();
		return true;
	}

	public boolean login(MemberData3 md) throws Exception {
		br = new BufferedReader(new FileReader(file));
		
		boolean isOk;
		
		while(true) {
			String user = br.readLine();
			String memoId = user.substring(0, user.indexOf("#"));
			String memoPwd = user.substring(user.indexOf("#")+1, user.lastIndexOf("#"));
			
			boolean id = memoId.equals(md.getId());
			boolean pwd = memoPwd.equals(md.getPwd());
			
			isOk = id && pwd;
			if(isOk) {
				br.close();
				break;
			}
			
		}	
		return isOk;
	}

}
