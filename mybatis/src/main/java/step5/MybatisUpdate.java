package step5;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUpdate {
	public static void main(String[] args) throws Exception {
		InputStream inputStream =
				Resources.getResourceAsStream("step5/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		Board board = new Board();
		board.setNo(53);
		board.setTitle("제목변경");
		board.setContents("내용변경!");
		
		
		int count = sqlSession.update("JdbcTestMapper.update", board);
		
		sqlSession.commit();
		
		System.out.printf("%d 개가 변경되었습니다", count);
		
		
		
		sqlSession.close();
		
	}

}
