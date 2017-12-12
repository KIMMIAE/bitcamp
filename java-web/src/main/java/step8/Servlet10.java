package step8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet10")
public class Servlet10 extends HttpServlet {
	  @Override
	  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	        req.setCharacterEncoding("UTF-8");

	        // 멀티 파트로 전송된 데이터를 분석하여 값과 파일명을 꺼내
	        // 다음 변수에 저장할 것이다.
	        String name = null;
	        String age = null;
	        String photo1Filename = null;
	        String photo2Filename = null;

		  
		// Create a factory for disk-based file items
		  DiskFileItemFactory factory = new DiskFileItemFactory();
		  
		// Create a new file upload handler
		  ServletFileUpload upload = new ServletFileUpload(factory);
	    
		  Map<String, FileItem> itemMap = new HashMap<>();
		  
	    try {
	    	List<FileItem> items = upload.parseRequest(req);
	    	for(FileItem item : items) {
	    		itemMap.put(item.getFieldName(), item);
	    	}
	    } catch (Exception e) {
	    	throw new ServletException(e);
	      }
	    
	    //ServletContext context = this.getServletContext();
	    //String path = context.getRealPath("/step8");
	    
	   name = itemMap.get("name").getString("UTF-8");
	   age = itemMap.get("age").getString();
	   photo1Filename = itemMap.get("photo1").getName();
	   photo2Filename = itemMap.get("photo2").getName();
	    
	      
	      PrintWriter out = res.getWriter();
	      out.printf("이름=%s\n", name);
	      out.printf("나이=%s\n", age);
	      out.printf("사진1=%s\n", photo1Filename);
	      out.printf("사진2=%s\n", photo2Filename);
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