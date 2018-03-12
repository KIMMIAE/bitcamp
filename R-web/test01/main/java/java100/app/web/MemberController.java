package java100.app.web;

import java.util.HashMap;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.domain.Artist;
import java100.app.domain.Member;
import java100.app.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
    @Autowired ServletContext servletContext;
	@Autowired MemberService memberService;
   
    @RequestMapping("list")
    public String list(
    		@RequestParam(value="pn", defaultValue="1") int pageNo,
    		@RequestParam(value="ps", defaultValue="5") int pageSize,
            @RequestParam(value="word", required=false) String[] words,
            @RequestParam(value="oc", required=false) String orderColumn,
            @RequestParam(value="al", required=false) String align,
            Model model) throws Exception {
        
    	if (pageNo < 1) {
    		pageNo = 1;
    	}
    	
    	if (pageSize < 5 || pageSize > 25) {
    		pageSize = 5;
    	}
    	
        HashMap<String,Object> options = new HashMap<>();
        options.put("words", words);
        options.put("orderColumn", orderColumn);
        options.put("align", align);
        
        int totalCount = memberService.getTotalCount();
        int lastPageNo = totalCount / pageSize;
        if((totalCount % pageSize) > 0 ) {
        	lastPageNo++;
        }
        model.addAttribute("pageNo", pageNo);
        model.addAttribute("lastPageNo", lastPageNo);
        model.addAttribute("list", memberService.list(pageNo, pageSize, options));
        return "member/list";
    }
    
    @RequestMapping("{no}")
    public String view(@PathVariable int no, Model model) throws Exception {
        
        model.addAttribute("member", memberService.get(no));
        return "member/view";
    }
    
    @RequestMapping("add")
    public String add(Member member, Artist artist
    		/*, MultipartFile photo*/) throws Exception {
        /*
    	 String uploadDir = servletContext.getRealPath("/download");
    	 String filename = this.writeUploadFile(photo, uploadDir);
         member.setPhoto(filename);
         
         */
    	
    	memberService.add(member, artist);
        return "redirect:list";
    }
    
    /*
    
    long prevMillis = 0;
    int count = 0;
    
    private String getNewFilename(String filename) {
    	long currMillis = System.currentTimeMillis();
    	if (prevMillis != currMillis) {
    		count = 0;
    		prevMillis = currMillis;
    	}
    	
    	return  currMillis + "_" + count++ + extractFileExtName(filename); 
    }
    
    */

	@RequestMapping("form")
    public String form() throws Exception {
        return "member/form";
        
    }
    
    @RequestMapping("update")
    public String update(Member member, Artist artist) throws Exception {
        System.out.println(member.getNo());
        artist.setArtistNo(member.getNo());
        memberService.update(member, artist);
        return "redirect:list";
    }

    
    @RequestMapping("delete")
    public String delete(int no) throws Exception {

        memberService.delete(no);
        
        return "redirect:list";
    }
    
    /*
    private String extractFileExtName(String filename) {
        int dotPosition = filename.lastIndexOf(".");
        
        if (dotPosition == -1)
            return "";
        
        return filename.substring(dotPosition);
	}

	private String writeUploadFile(MultipartFile file, String uploadDir) throws IOException {
    	String filename = getNewFilename(file.getOriginalFilename());
    	file.transferTo(new File(file + "/" + filename));
    	return filename;
    }
    */
    
}




