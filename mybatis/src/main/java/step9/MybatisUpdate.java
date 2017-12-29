package step9;

public class MybatisUpdate {
	public static void main(String[] args) throws Exception {
		BoardDao boardDao = new BoardDao();
		boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());

		Board board = new Board();
		
		board.setNo(59);
		board.setTitle("제목변경2");
		board.setContents("내용변경22!");
		
		
		int count = boardDao.update(board);
		System.out.printf("%d 개가 변경되었습니다", count);
		
	}

}
