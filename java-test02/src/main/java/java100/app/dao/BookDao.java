package java100.app.dao;

import java.util.HashMap;
import java.util.List;

import java100.app.domain.Book;

public interface BookDao {

	List<Book> findAll(HashMap<String, Object> params);
	Book findByNo2(int no);
	int insert(Book book);
	int updateViewCount(int no);
	




}
