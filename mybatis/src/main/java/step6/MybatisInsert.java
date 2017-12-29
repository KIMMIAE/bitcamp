package step6;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisInsert {
	public static void main(String[] args) throws Exception {
		InputStream inputStream =
				Resources.getResourceAsStream("step6/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		Board board = new Board();
		board.setTitle("꾸엑");
		board.setContents("내용이더래요~~~2");
		
		
		int count = sqlSession.insert("JdbcTestMapper.insert", board);
		
		sqlSession.commit();
		
		System.out.printf("%d 개가 입력되었습니다", count);
		
		
		
		sqlSession.close();
		
	}

}
