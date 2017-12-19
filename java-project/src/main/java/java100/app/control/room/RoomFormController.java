package java100.app.control.room;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import java100.app.control.PageController;

@Component("/room/form")
public class RoomFormController implements PageController {
    
    public String service(
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        // => 인클루드를 실행하는 쪽에서 콘텐츠 타입을 설정해야 한다.
        // => 인클루드 되는 쪽에서는 여기에서 설정한 것을 그대로 따른다.
		return "/room/form.jsp";
        
    }
}




