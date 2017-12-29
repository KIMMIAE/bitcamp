package step9;

public class MybatisInsert {
	public static void main(String[] args) throws Exception {
		BoardDao boardDao = new BoardDao();
		boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());

		Board board = new Board();
		board.setTitle("aaa");
		board.setContents("aaaaa");
		
		
		int count = boardDao.insert(board);
		
		
		System.out.printf("%d 개가 입력되었습니다", count);
		
		
		
	}

}
