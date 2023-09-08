package ch08.q07;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySqlDB 에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySqlDB 에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySqlDB 를 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySqlDB 에서 삭제");
	}


}
