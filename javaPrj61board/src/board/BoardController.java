package board;

import java.util.List;
import java.util.Scanner;

public class BoardController {
	
	private Scanner sc;
	private BoardDao dao;
	
	public BoardController() {
		sc = new Scanner(System.in);
		dao = new BoardDao();
	}

	public void showMenu() {
		System.out.println("==================");
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 검색");
		System.out.println("메뉴를 선택해주세요");
		String sel = sc.nextLine();
		
		switch(sel) {
		case "1" : write(); break;
		case "2" : search(); break;
		default : System.out.println("잘못입력하셨습니다.");
		}
	}

	private void write() {
		System.out.println("=====게시글 작성=====");
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		BoardData bd = new BoardData(title, name, content);
		boolean result = false;
		try {
			result = dao.write(bd);
		} catch (Exception e) {
			result = false;
		}
		if(result) {
			System.out.println("게시글을 작성하였습니다.");
		} else {
			System.out.println("게시글 작성이 실패하였습니다.");
		}
	} // write 끝

	private void search() {
		System.out.println("=====게시판 검색=====");
		System.out.print("검색어 : ");
		String searchTitle = sc.nextLine();
		
		try {
			List<BoardData> x = dao.search(searchTitle);
			
			if(!x.isEmpty()) {
				for(int i = 0; i < x.size(); i++) {
					System.out.println(x.get(i));
				} 
			} else {
				System.out.println("해당되는 게시글이 없습니다.");
			}
			x.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	} // search 끝
	
//	private void selectSearch(BoardData bd) {
//		
//	}
	
}
