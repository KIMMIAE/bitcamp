package step10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisSelectList {
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext iocContainer =
				new ClassPathXmlApplicationContext("step10/application-context.xml");
		
		BoardDao boardDao = iocContainer.getBean(BoardDao.class);
		
		Map<String,Object> data = new HashMap<>();
		data.put("orderColumn", "regdt");
		data.put("align", "desc");
		
		List<String> words = new ArrayList<>();
		words.add("aa");
		words.add("꾸");
		
		//data.put("words", words);
		
		List<Board> records = boardDao.findAll(data);
		
		for(Board board : records) {
			System.out.printf("%d, %s, %s, %s\n", 
					board.getNo(), 
					board.getTitle(),
					board.getCreateDate(),
					board.getViewCount());
			
		}
		
		iocContainer.close();
		
	}

}
