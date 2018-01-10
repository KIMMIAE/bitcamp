package java100.app.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.BookDao;
import java100.app.domain.Book;
import java100.app.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired BookDao bookDao;
    
    @Override
    public int add(Book book) {
        return bookDao.insert(book);
    }

	@Override
	public List<Book> list(HashMap<String, Object> options) {
		  HashMap<String,Object> params = new HashMap<>();
	        
	        if (options != null) {
	            params.putAll(options);
	        }
	        
	        return bookDao.findAll(params);
	}

	@Override
	public Book get(int no) {
		bookDao.updateViewCount(no);

		// 방법1: 따로따로 가져오기
		// Board board = boardDao.findByNo(no);
		// board.setFiles(fileDao.findByBoardNo(no));

		// 방법2: board 객체에 묶어서 가져오기
		Book book = bookDao.findByNo2(no);

		return book;
	}


}