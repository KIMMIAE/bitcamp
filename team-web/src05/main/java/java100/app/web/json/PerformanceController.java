package java100.app.web.json;

import java.util.HashMap;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java100.app.service.PerformanceService;

@RestController
@RequestMapping("/performance")
@SessionAttributes("loginUser")
public class PerformanceController {
    
    @Autowired ServletContext servletContext;
    @Autowired PerformanceService performanceService;
    

    @RequestMapping("{no}")
    public Object view(@PathVariable int no) throws Exception {
        
        HashMap<String, Object> result = new HashMap<>();
        result.put("data",  performanceService.get(no));
        return result;
    }
    
    
}







