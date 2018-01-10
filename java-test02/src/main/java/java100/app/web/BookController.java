package java100.app.web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.domain.Book;
import java100.app.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
    
    @Autowired BookService bookService;
    
    @RequestMapping("list")
    public String list(
            @RequestParam(value="words", required=false) String[] words,
            @RequestParam(value="oc", required=false) String orderColumn,
            @RequestParam(value="al", required=false) String align,
            Model model) throws Exception {

        // UI 제어와 관련된 코드는 이렇게 페이지 컨트롤러에 두어야 한다.
        //
        
        HashMap<String,Object> options = new HashMap<>();
        if (words != null && words[0].length() > 0) {
            options.put("words", words);
        }
        options.put("orderColumn", orderColumn);
        options.put("align", align);
        
        model.addAttribute("list", bookService.list(options));
        return "book/list";
    }
/*
	@RequestMapping("{no}")
	public String view(@PathVariable int no, Model model) throws Exception {

		model.addAttribute("book", bookService.get(no));
		return "book/view";
	}
*/
    
    
    
    
    @RequestMapping("form")
    public String form() throws Exception {
        return "book/form";
        
    }
    
    @RequestMapping("add")
    public String add(Book book) throws Exception {
        
        bookService.add(book);
        return "redirect:list";
    }
    
}