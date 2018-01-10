package java100.app.service;

import java.util.HashMap;
import java.util.List;

import java100.app.domain.Book;

public interface BookService {
	List<Book> list(HashMap<String, Object> options);
    int add(Book book);
	Book get(int no);


}