package ch15.practice.practice07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	
	public List<Board> getBoardList() {

		List<Board> zz = new ArrayList<Board>();
		zz.add(new Board("제목1", "내용1"));
		zz.add(new Board("제목2", "내용2"));
		zz.add(new Board("제목3", "내용3"));
		
		return zz;
	}

}
