package step3;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUpdate {
	public static void main(String[] args) throws Exception {
		InputStream inputStream =
				Resources.getResourceAsStream("step3/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		Map<String,Object> data = new HashMap<>();
		data.put("no", 49);
		data.put("title", "제목변경");
		data.put("contents", "내용이더래요~~~");
		
		
		int count = sqlSession.update("JdbcTestMapper.update", data);
		
		sqlSession.commit();
		
		System.out.printf("%d 개가 변경되었습니다", count);
		
		
		
		sqlSession.close();
		
	}

}
