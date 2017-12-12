package step8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet09")
public class Servlet09 extends HttpServlet {
	  @Override
	  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    // 멀티파트로 받은 데이터는 아래와 같이 인코딩을 설정해봐야 소용없다.
	    //req.setCharacterEncoding("UTF-8");
	   
	    // 멀티파트로 받은 데이터 처리하기
	    // 1) 각 파트에 데이터를 가공할 객체 준비
	    DiskFileItemFactory itemFactory = new DiskFileItemFactory();
	    
	    // 2) 멀티파트로 들어 데이터를 분석하는 객체 준비
	    ServletFileUpload multipartDataParser = new ServletFileUpload(itemFactory);
	    
	    try {
	      // 3) 멀티파트 데이터 파서기를 이용하여 요청 데이터 처리하기
	      // => itemFactory 객체가 가공한 멀티파트 데이터를 List로 받는다.
	      // => 각각의 파트 데이터는 FileItem 객체에 담겨있다.
	      List<FileItem> parts = multipartDataParser.parseRequest(req);
	    
	      // 안타깝게도 특정한 것만 쏙 뽑아낼 수 없다. 
	      // 무조건 반복문을 돌려서 찾아야 한다.
	      // 이를 좀 편하게 하기 위해 List에 저장된 객체를 맵으로 옮긴다.
	      HashMap<String,FileItem> partMap = new HashMap<>();
	      for (FileItem part : parts) {
	        partMap.put(part.getFieldName(), part);
	      }
	      
	      FileItem part = partMap.get("name");
	      FileItem part2 = partMap.get("age");
	      // 파라미터의 값 꺼내기
	      // FileItem에서 UTF-8로 인코딩 된 값을 꺼낼 때는 때 인코딩을 지정해야 한다.
	      String name = part.getString("UTF-8"); 
	      String age = part2.getString("UTF-8"); 
	      
	      // 파일인 경우, 원래의 이름을 꺼내려면 getName()을 호출해야 한다.
	      String photo1 = partMap.get("photo1").getName();
	      String photo2 = partMap.get("photo2").getName();
	      
	      res.setContentType("text/plain;charset=UTF-8");
	      PrintWriter out = res.getWriter();
	      out.printf("이름=%s\n", name);
	      out.printf("나이=%s\n", age);
	      out.printf("사진1=%s\n", photo1);
	      out.printf("사진2=%s\n", photo2);

	    } catch (Exception e) {
	      throw new ServletException(e);
	    }
	    
	  }
	  
	}
            
         /*   
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        out.printf("이름 = %s\n", name);
        out.printf("나이 = %s \n", age);
        out.printf("사진1 = %s \n", photo1Filename);
        out.printf("사진2 = %s \n", photo2Filename);
    }

}
            */