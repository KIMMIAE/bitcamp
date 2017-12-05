package java100.app.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.AppInitServlet;
import java100.app.dao.BoardDao;
import java100.app.domain.Board;

@WebServlet (urlPatterns="/board/*")
public class BoardServlet implements Servlet {
    
	ServletConfig servletConfig;
    // BoardDao는 인터페이스이다. 
    // 따라서 BoardDao 인터페이스를 구현한 어떤 클래스라도 주입 받을 수 있다.
    // 이것이 인터페이스를 사용하는 이유이다.
    // 상황에 따라 다양한 DAO 구현체를 주입 받을 수 있기 때문이다.
    // 현재는 App 클래스에서 MySQL DBMS를 사용하는 구현체를 주입해 주지만,
    // 만약 고객사의 DBMS가 Oracle이라면 
    // 그 Oracle을 사용하는 DAO를 주입해줄 것이다.    
    BoardDao boardDao;
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "게시물관리 서블릿";
	}

	@Override
	public void destroy() {
	}
	
    @Override
    public ServletConfig getServletConfig() {
    	// TODO Auto-generated method stub
    	return this.servletConfig;
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	this.servletConfig = config;
    	boardDao = AppInitServlet.IocContainer.getBean(BoardDao.class);
    }
    

    @Override
   	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
           HttpServletRequest httpRequest = (HttpServletRequest) request;
           HttpServletResponse httpResponse = (HttpServletResponse) response;
           httpResponse.setContentType("text/plain;charset=UTF-8");
           System.out.println("------------------------------------");
           System.out.println(httpRequest.getServletPath());
           System.out.println(httpRequest.getPathInfo());
           System.out.println(httpRequest.getQueryString());
           System.out.println(httpRequest.getRequestURI());
           System.out.println(httpRequest.getRequestURL());
           System.out.println("------------------------------------");
        switch (httpRequest.getPathInfo()) {
        case "/list": this.doList(httpRequest, httpResponse); break;
        case "/add": this.doAdd(httpRequest, httpResponse); break;
        case "/view": this.doView(httpRequest, httpResponse); break;
        case "/update": this.doUpdate(httpRequest, httpResponse); break;
        case "/delete": this.doDelete(httpRequest, httpResponse); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doList(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        out.println("[게시물 목록]");
        
        try {
            
            List<Board> list = boardDao.selectList();
            
            for (Board board : list) {
                out.printf("%d, %s, %s, %d\n",
                        board.getNo(),
                        board.getTitle(), 
                        board.getRegDate(),
                        board.getViewCount());
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }

    private void doAdd(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("[게시물 등록]");
        
        try {
            Board board = new Board();
            board.setTitle(request.getParameter("title"));
            board.setContent(request.getParameter("content"));
            
            boardDao.insert(board);
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    } 
    
    private void doView(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("[게시물 상세 정보]");
        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            Board board = boardDao.selectOne(no);
            
            if (board != null) {
                out.printf("번호: %d\n", board.getNo());
                out.printf("제목: %s\n", board.getTitle());
                out.printf("내용: %s\n", board.getContent());
                out.printf("등록일: %s\n", board.getRegDate());
                out.printf("조회수: %d\n", board.getViewCount());
            } else {
                out.printf("'%d'번의 게시물 정보가 없습니다.\n", no);
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    } 
    
    private void doUpdate(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("[게시물 변경]");
        
        try {
            Board board = new Board();
            board.setNo(Integer.parseInt(request.getParameter("no")));
            board.setTitle(request.getParameter("title"));
            board.setContent(request.getParameter("content"));
            
            if (boardDao.update(board) > 0) {
                out.println("변경하였습니다.");
            } else {
                out.printf("'%d'번 게시물이 없습니다.\n", board.getNo());
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }
    
    private void doDelete(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("[게시물 삭제]");
        
        try {
            
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (boardDao.delete(no) > 0) {
                out.println("삭제했습니다.");
            } else {
                out.printf("'%d'번의 게시물 정보가 없습니다.\n", no); 
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }
}








