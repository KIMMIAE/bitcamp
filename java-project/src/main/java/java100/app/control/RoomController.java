package java100.app.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;

@Controller
public class RoomController {
    
	@Autowired RoomDao roomDao;
	
	@RequestMapping("/room/list")
    public String list(
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Room> list = roomDao.selectList();
        
        // 작업한 결과를 JSP에게 넘겨주기 위해 ServletRequest 보관소에 저장한다.
        request.setAttribute("list", list);
        
        return "/room/list.jsp";
    }
	@RequestMapping("/room/add")
    public String add(
    		Room room,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        
        roomDao.insert(room);
        return "redirect:list.do";
        
    }
	@RequestMapping("/room/delete")
    public String delete(
    		@RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        roomDao.delete(no);
        
        return "redirect:list.do";
        
    }
	
	@RequestMapping("/room/form")
    public String form(
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        // => 인클루드를 실행하는 쪽에서 콘텐츠 타입을 설정해야 한다.
        // => 인클루드 되는 쪽에서는 여기에서 설정한 것을 그대로 따른다.
		return "/room/form.jsp";
        
    }
}
