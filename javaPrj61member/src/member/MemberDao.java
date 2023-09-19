package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberDao {

	private File file;
	private BufferedReader br;
	private PrintWriter pw;
	
	
	public MemberDao() {
		file = new File("C:\\dev\\data.txt");
	}

	// 회원가입 // 파라미터로 전달받은 데이터 저장 공간에 넣기 
	public boolean join(MemberData memberData) throws Exception {
		// 할 일 
//		pw = new PrintWriter(new FileWriter(file, true), true);
//		pw.println(memberData.getId() + "#" + memberData.getPwd() + "#" + memberData.getNick());
		FileWriter fw = new FileWriter(file);
		String str = memberData.getId() + "#" + memberData.getPwd() + "#" + memberData.getNick();
		fw.write(str);
		fw.close();
		// 결과 리턴
		
		
		return true;
	}

	// 로그인  // 파라미터로 전달받은 데이터랑 저장공간의 데이터 비교
	public boolean login(MemberData memberData) throws Exception {
		// 할일
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String memoStr = br.readLine();
		String memoId = memoStr.substring(0, memoStr.indexOf("#"));
		String memoPwd = memoStr.substring(memoStr.indexOf("#")+1, memoStr.lastIndexOf("#"));
		
		boolean idOk = memoId.equals(memberData.getId());
		boolean pwdOk = memoPwd.equals(memberData.getPwd());
		
		boolean loginOk = idOk && pwdOk;
		// 결과 리턴
		br.close();
		return loginOk;
	}
	
}
