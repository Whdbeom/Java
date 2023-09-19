package ch15.practice.practice10;

public class Student implements Comparable<Student> {
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	public String id;
	public int score;

	@Override
	public int compareTo(Student o) {
	 if(score < o.score) return -1;
	 else if(score == o.score) return 0;
	 else return 1;
	}
	

}
