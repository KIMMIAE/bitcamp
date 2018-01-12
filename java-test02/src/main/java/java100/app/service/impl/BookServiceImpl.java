package java100.app.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.BookDao;
import java100.app.dao.PhotoDao;
import java100.app.domain.Book;
import java100.app.domain.UploadPhoto;
import java100.app.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired BookDao bookDao;
    @Autowired PhotoDao photoDao;
    
    
    @Override
    public int add(Book book) {
        // insert를 하기 전에는 board의 no 프로퍼티 값은 0이다.
        // insert를 한 후에는 no 프로퍼티에 DB에서 생성한 값이 저장된다.
        int count = bookDao.insert(book);
        // 첨부파일 등록
        this.addFiles(book.getPhotos(), book.getNo());
        
        return count;
    }



    @Override
	public void addFiles(List<UploadPhoto> photos, int bookNo) {
    	 for (UploadPhoto photo : photos) {
             // 파일 정보를 insert 하기 전에 게실물 no를 설정한다.
             photo.setBookNo(bookNo);
             photoDao.insert(photo);
         }
		
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