package ch08.q07;

public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
	}

}
/*ㄴㄴ
Oracle DB 에서 검색
Oracle DB 에 삽입
Oracle DB 를 수정
Oracle DB 에서 삭제

MySql DB 에서 검색
MySql DB 에 삽입
MySql DB 를 수정
MySql DB 에서 삭제

*/