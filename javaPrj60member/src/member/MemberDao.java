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
	private File file;
	private String x;
	private BufferedReader br;
	
	
	public MemberDao() {
		x = File.separator;
		file = new File("C:" + x + "dev" + x + "data.txt");
	}
	
	// 회원가입 ( 데이터 집어넣기)
	public boolean join(MemberData memberData){
//		pw = new PrintWriter(new FileWriter(file, true), true);
//		String id = memberData.getId();
//		String pwd = memberData.getPwd();
//		String nick = memberData.getNick();
//		pw.println(id + "#" + pwd + "#" + nick);
//		pw.close();
		
		// 보내는 스트림
		FileWriter fw = null;	
		try {
			pw = new PrintWriter(new FileWriter(file, true),true);
			
			// 데이터 가공 ID#PWD#NICK
			String dataStr = memberData.getId() + "#"
									+ memberData.getPwd() + "#"
									+ memberData.getNick();
			pw.println(dataStr);
			// 보내기 - 위에 있는 코드가 확실하게 동작했을때 작업을 수행
//			fw.write(memberData.toString());
			
		} catch (Exception e) {
			System.out.println("파일 객체만드려다가,,io예외발생함");
			return false;
		} finally {
			try {
				pw.close();
			} catch (Exception e) {
				System.out.println("닫으려다가 그만,,");
			}
		}
		
		// 결과 리턴
		return true;
	}
	
	// 로그인 (데이터 꺼내오기)
//	public MemberData login(String id, String pwd){
//		br = new BufferedReader(new FileReader(file));
//		MemberData memberData = new MemberData();
//		
//		while(true) {
//			String user = br.readLine();
//			if(user == null) {
//				break;
//			}
//			int idx = user.indexOf("#");
//			int idx2 = user.lastIndexOf("#");
//			String memoId = user.substring(0, idx);
//			String memoPwd = user.substring(idx+1, idx2);
//			String memoNick = user.substring(idx2+1);
//			// 비교
//			boolean isOk = id.equals(memoId) && pwd.equals(memoPwd);
//				
//			if(isOk) {
//				memberData.setId(memoId);
//				memberData.setPwd(memoPwd);
//				memberData.setNick(memoNick);
//					br.close();
//					break;
//			}
//		}
//		return memberData;
//	}
	public boolean login(MemberData memberData){
		
		BufferedReader br = null;
		boolean isSuccess = false;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			while(true) {
				// 읽기
				String str = br.readLine();
					if(str == null) {
						break;
					}
				
				// 비교
				String id = memberData.getId();	
				String pwd = memberData.getPwd();
				
//				int firstIdx = str.indexOf("#");
				String memoId = str.substring(0, str.indexOf("#"));
				
				str = str.substring(str.indexOf("#")+1);
				
				String memoPwd = str.substring(0, str.indexOf("#"));
				String memoNick = str.substring(str.lastIndexOf("#")+1);
				
				isSuccess = memoId.equals(id) && memoPwd.equals(pwd);

				if(isSuccess) {
					System.out.print(memoNick + "님 하이용..");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("파일이없어요");
		} finally {
			try { if(br != null) { br.close(); }} catch (IOException e) { }
		}
		return isSuccess;
	}
	
	

}
