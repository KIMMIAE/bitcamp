package step7;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTest {
	public static void main(String[] args) throws Exception {
		InputStream inputStream =
				Resources.getResourceAsStream("step7/mybatis-config.xml");
		
		
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
	
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		
		sqlSession.close();
		
		System.out.println("종료!");
		
	}

}
