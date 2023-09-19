package board;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	private File file;
	private PrintWriter pw;
	private BufferedReader br;
	
	
	public BoardDao() {
		file = new File("C:\\dev\\board.txt");
	}

	public boolean write(BoardData bd) throws Exception {
		pw = new PrintWriter(new FileWriter(file, true), true);
		String write = bd.getTitle() +"#"+ bd.getName() +"#"+bd.getContent();
		pw.println(write);
		
		pw.close();
		return true;
	}

	public List<BoardData> search(String searchTitle) throws Exception {
		br = new BufferedReader(new FileReader(file));
		List<BoardData> arrayList = new ArrayList<BoardData>();
		
		String search;

		while((search = br.readLine()) != null) {
			if(search.contains(searchTitle)) {
				String title = search.substring(0, search.indexOf("#"));
				String name = search.substring(search.indexOf("#")+1, search.lastIndexOf("#"));
				String content = search.substring(search.lastIndexOf("#")+1);
				
				BoardData bd = new BoardData(title, name, content);
				arrayList.add(bd);

			} 
		}
		return arrayList;
	}

	
	
	
}
