package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;

// RoomController는 ArrayList를 상속 받은 서브 클래스이기도 하지만,
// Controller라는 규칙을 따르는 클래스이기도 하다!
public class RoomController implements Controller {
    
    RoomDao roomDao = new RoomDao();
    
    @Override
    public void destroy() {}
    
    // CSV 형식으로 저장된 파일에서 성적 데이터를 읽어 
    // ArrayList에 보관한다.
    @Override
    public void init() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(
                    "JDBC 드라이버 클래스를 찾을 수 없습니다.");
        
        }
    }
    
    
    // 다음 메서드는 Controller 규칙을 따르기로 했기 때문에,
    // Controller 선언된 추상 메서드를 오버라이딩 한 것이다.
    // 만약 추상 메서드를 오버라이딩 하지 않는다면,
    // 이 클래스는 추상 클래스가 되어야 한다.
    @Override
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/room/list": this.doList(request, response); break;
        case "/room/add": this.doAdd(request, response); break;
        case "/room/delete": this.doDelete(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 목록]");
        
        try {
            List<Room> list = roomDao.selectList();
            for (Room room : list) {
                out.printf("%4d, %-4s, %4s, %d\n",
                        room.getNo(),
                        room.getLocation(),
                        room.getName(),
                        room.getCapacity());
            }
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        
        
    }
    
    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 등록]");
        
        try {
            Room room = new Room();
            room.setLocation(request.getParameter("loc"));
            room.setName(request.getParameter("name"));
            room.setCapacity(Integer.parseInt(request.getParameter("capacity")));

            roomDao.insert(room);
            out.println("등록했습니다.");
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    } 
    
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 삭제]");
        
        try {
            
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (roomDao.delete(no) > 0) {
                out.println("삭제했습니다.");
            } else {
                out.printf("'%s'의 강의실 정보가 없습니다.\n", no);
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }
    
}




