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
	public Book get(int no) {

		// 방법1: 따로따로 가져오기
		// Board board = boardDao.findByNo(no);
		// board.setFiles(fileDao.findByBoardNo(no));

		// 방법2: board 객체에 묶어서 가져오기
		Book book = bookDao.findByNo2(no);

		return book;
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
	public int update(Book book) {
        int count = bookDao.update(book);
        
        // 기존의 게시물 첨부파일은 모두 지운다. 
       // fileDao.deleteAllByBoardNo(board.getNo());
        
        // 다시 게시물 첨부파일을 저장한다.
       // addFiles(board.getFiles(), board.getNo());
        
        return count;
	}



	@Override
	public int delete(int no) {
        return bookDao.delete(no);
	}


}