package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet ("/board/list")
public class BoardListServlet extends HttpServlet {

	  public void doGet(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
		  BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
	        
	        response.setContentType("text/html;charset=UTF-8");
	        
	        PrintWriter out = response.getWriter();
	        out.println("<!DOCTYPE html>");
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>게시물관리</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>게시물 목록</h1>");

	        out.println("<p><a href='add'>추가</a></p>");
	        
	        out.println("<table>");
	        out.println("<thead>");
	        out.println("<tr>");
	        out.println("<th>번호</th><th>제목</th><th>등록일</th><th>조회수</th>");
	        out.println("</tr>");
	        out.println("</thead>");
	        out.println("<tbody>");
        
        try {
            
            List<Board> list = boardDao.selectList();
            
            for (Board board : list) {
                out.printf("<tr><td>%d</td><td>"
                        + "<a href='view?no=%d'>%s</a>"
                        + "</td><td>%s</td><td>%s</td></tr>\n",
                        board.getNo(),
                        board.getNo(),
                        board.getTitle(), 
                        board.getRegDate(),
                        board.getViewCount());
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        out.println("</tbody>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

}








