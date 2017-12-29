package step10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisSelectOne {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext iocContainer =
				new ClassPathXmlApplicationContext("step10/application-context.xml");
		
		BoardDao boardDao = iocContainer.getBean(BoardDao.class);
		
		Board board = boardDao.findByNo(52);
		
			System.out.printf("번호: %d\n", board.getNo());
			System.out.printf("제목: %s\n", board.getTitle());
			System.out.printf("내용: %s\n", board.getContents());
			System.out.printf("날짜: %s\n", board.getCreateDate());
			System.out.printf("조회수: %s\n", board.getViewCount());
		
			iocContainer.close();
	}

}
