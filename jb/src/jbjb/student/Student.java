package jbjb.student;

public class Student {
// String형의 학과와 정수형의 학번을 필드로 선언
	
	private String part;
	private int num;
			
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
		
	public static void main(String[] args) {
	Student st = new Student();
	st.setPart("경영학과");
	st.setNum(10);
	
	System.out.println(st.getNum());
	System.out.println(st.getPart());
	}
}
