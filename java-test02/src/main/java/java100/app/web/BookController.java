package java100.app.web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java100.app.domain.Book;
import java100.app.domain.UploadPhoto;
import java100.app.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
    
    @Autowired BookService bookService;
    @Autowired ServletContext servletContext;
    
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

	@RequestMapping("{no}")
	public String view(@PathVariable int no, Model model) throws Exception {

		model.addAttribute("book", bookService.get(no));
		return "book/view";
	}

    @RequestMapping("form")
    public String form() throws Exception {
        return "book/form";
        
    }
    
    @RequestMapping("add")
    public String add(
    		Book book,
    		 MultipartFile[] file) throws Exception {
    	   // 업로드 파일을 저장할 폴더 위치를 가져온다.
        String uploadDir = servletContext.getRealPath("/download");

        // 업로드 파일 정보를 저장할 List 객체 준비
        ArrayList<UploadPhoto> uploadPhoto = new ArrayList<>();
        
        // 클라이언트가 보낸 파일을 저장하고, 
        // 그 파일명(저장할 때 사용한 파일명)을 목록에 추가한다.
        for (MultipartFile part : file) {
            if (part.isEmpty())
                continue;
            
            String photoname = this.writeUploadPhoto(part, uploadDir);
            
            uploadPhoto.add(new UploadPhoto(photoname));
        }
        
        // Board 객체에 저장한 파일명을 등록한다. 
        book.setPhoto(uploadPhoto);

        bookService.add(book);
        return "redirect:list";
    }
    
    

	@RequestMapping("update")
    public String update(
            Book book
            //, MultipartFile[] file
            ) throws Exception {
        
    	/*
        // 업로드 파일을 저장할 폴더 위치를 가져온다.
        String uploadDir = servletContext.getRealPath("/download");

        // 업로드 파일 정보를 저장할 List 객체 준비
        ArrayList<UploadFile> uploadFiles = new ArrayList<>();
        
        // 클라이언트가 보낸 파일을 저장하고, 
        // 그 파일명(저장할 때 사용한 파일명)을 목록에 추가한다.
        for (MultipartFile part : file) {
            if (part.isEmpty())
                continue;
            
            String filename = this.writeUploadFile(part, uploadDir);
            
            uploadFiles.add(new UploadFile(filename));
        }
        
        // Board 객체에 저장한 파일명을 등록한다. 
        book.setFiles(uploadFiles);
*/
        bookService.update(book);
        
        return "redirect:list";
    }

    @RequestMapping("delete")
    public String delete(int no) throws Exception {

        bookService.delete(no);
        return "redirect:list";
    }
    
    long prevMillis = 0;
    int count = 0;
    
    private String writeUploadPhoto(MultipartFile part, String path) throws IOException {
        String photoname = getNewPhotoname(part.getOriginalFilename());
        part.transferTo(new File(path + "/" + photoname));
        return photoname;
    }

    synchronized private String getNewPhotoname(String photoname) {
		  long currMillis = System.currentTimeMillis();
	        if (prevMillis != currMillis) {
	            count = 0;
	            prevMillis = currMillis;
	        }
	        
	        return  currMillis + "_" + count++ + extractPhotoExtName(photoname); 
	}

	private String extractPhotoExtName(String photoname) {
	      int dotPosition = photoname.lastIndexOf(".");
	        
	        if (dotPosition == -1)
	            return "";
	        
	        return photoname.substring(dotPosition);
	        
	        
	}


    
}