package java100.app.servlet.score;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import java100.app.dao.ScoreDao;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet ("/score/delete") // 이 클래스의 객체를 자동 생성해야 함을 표시 
public class ScoreDeleteServlet extends HttpServlet {
    
    @Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    	ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
    	response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("[성적 삭제]");
        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (scoreDao.delete(no) > 0) {
                out.println("삭제했습니다.");
            } else {
                out.printf("'%d'의 성적 정보가 없습니다.\n", no);
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }
}













