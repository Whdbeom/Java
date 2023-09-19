package board;

public class BoardData {

	
	
	
	public BoardData() {
	}

	
	public BoardData(String title, String name) {
		super();
		this.title = title;
		this.name = name;

	}
	
	public BoardData(String title, String name, String content) {
		super();
		this.title = title;
		this.name = name;
		this.content = content;
	}
	private String title;
	private String name;
	private String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "검색결과 [제목=" + title + ", 작성자=" + name + ", 내용=" + content + "]";
	}
	
	
	
}
