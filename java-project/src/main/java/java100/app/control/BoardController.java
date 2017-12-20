package java100.app.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java100.app.annotation.RequestMapping;
import java100.app.annotation.RequestParam;
import java100.app.dao.BoardDao;
import java100.app.domain.Board;

@Controller
public class BoardController {
    
	@Autowired BoardDao boardDao;
	
	@RequestMapping("/board/list")
    public String list(
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<Board> list = boardDao.selectList();
        
        // 작업한 결과를 JSP에게 넘겨주기 위해 ServletRequest 보관소에 저장한다.
        request.setAttribute("list", list);
        
        return "/board/list.jsp";
    }
	@RequestMapping("/board/add")
    public String add(
    		Board board,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        boardDao.insert(board);
        return "redirect:list.do";
        
    }
	@RequestMapping("/board/delete")
    public String delete(
    		@RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        boardDao.delete(no);
        
        return "redirect:list.do";
    }
	@RequestMapping("/board/form")
    public String form(
            HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "/board/form.jsp";
    }
	
	@RequestMapping("/board/update")
    public String update(
    		Board board,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        boardDao.update(board);
        return "redirect:list.do";
        
    }
	
	@RequestMapping("/board/view")
    public String view(
    		@RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        Board board = boardDao.selectOne(no);
        
        // 작업한 결과를 JSP에게 넘겨주기 위해 ServletRequest 보관소에 저장한다.
        request.setAttribute("board", board);
        
        return "/board/view.jsp";
        
    }
}


