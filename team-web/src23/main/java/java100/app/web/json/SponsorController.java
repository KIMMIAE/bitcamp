package java100.app.web.json;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java100.app.domain.member.Member;
import java100.app.domain.sponsor.Sponsor;
import java100.app.service.SponsorService;

@RestController
@RequestMapping("/sponsor")
@SessionAttributes("loginUser")
public class SponsorController {
    
    @Autowired SponsorService sponsorService;
    

    Logger logger = Logger.getLogger(SponsorController.class);
    
    
    @RequestMapping("list")
    public Object list(@RequestParam(value="pn", defaultValue="1") int pageNo,
            @RequestParam(value="ps", defaultValue="5") int pageSize,
            @RequestParam(value="words", required=false) String[] words,
            @RequestParam(value="oc", required=false) String orderColumn,
            @RequestParam(value="al", required=false) String align,
            HttpSession session, Model model) throws Exception {
        
        
        logger.fatal("fatal....");
        logger.error("error...");
        logger.warn("warn...");
        logger.info("info...");
        logger.debug("debug...");
        logger.trace("trace...");
        
        
        if (pageNo < 1) {
            pageNo = 1;
        }

        if (pageSize < 5 || pageSize > 15) {
            pageSize = 5;
        }
        
        HashMap<String, Object> options = new HashMap<>();
        if(words != null && words[0].length()>0) {
            options.put("words", words);
        }
        
        options.put("orderColumn", orderColumn);
        options.put("align", align);
        
        
        /*
        int totalCount = SponsorService.getTotalCount();\
             
        int lastPageNo = totalCount / pageSize;
        if ((totalCount % pageSize) > 0) {
            lastPageNo++;
       }*/
        
        
        Member member = (Member)session.getAttribute("loginUser");
        HashMap <String, Object> result = new HashMap<>();
    
        
        result.put("pageNo", pageNo);
        result.put("list", sponsorService.list(member.getNo()));
        
        return result;
    }
    
    
    

    @RequestMapping(value="add", method=RequestMethod.POST)
    public Object add(Sponsor sponsor,HttpSession session) throws Exception {
        Member member = (Member)session.getAttribute("loginUser");
        sponsor.setMemberNo(member .getNo());
        HashMap<String,Object> result = new HashMap<>();
        int count = sponsorService.add(sponsor);
        if(count >= 0){
            result.put("Status", "success");
        } else {
            result.put("Status", "fail");
        }
        return result;
    }
    
    @RequestMapping("{sponsorNo}")
    public Object view(@PathVariable int sponsorNo) throws Exception {
        HashMap<String,Object> result = new HashMap<>();
        result.put("sponsor", sponsorService.get(sponsorNo));
        return result;
    }
    
    @RequestMapping("get")
    public Object get(HttpSession session) throws Exception {
        Member member = (Member)session.getAttribute("loginUser");
        HashMap<String,Object> result = new HashMap<>();
        result.put("get", sponsorService.findSpons(member.getNo()));
        return result;
    }

}








