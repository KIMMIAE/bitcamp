package java100.app.web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import java100.app.domain.Board;
import java100.app.domain.Member;
import java100.app.domain.UploadFile;
import java100.app.service.BoardService;

@Controller
@RequestMapping("/board")
@SessionAttributes("loginUser")
public class BoardController {

	@Autowired
	ServletContext servletContext;
	@Autowired
	BoardService boardService;

	@RequestMapping("list")
	public String list(@RequestParam(value = "pn", defaultValue = "1") int pageNo,
			@RequestParam(value = "ps", defaultValue = "5") int pageSize,
			@RequestParam(value = "title", required = false) String[] titles,
			@RequestParam(value = "oc", required = false) String orderColumn,
			@RequestParam(value = "al", required = false) String align, Model model) throws Exception {

		// UI 제어와 관련된 코드는 이렇게 페이지 컨트롤러에 두어야 한다.
		//
		if (pageNo < 1) {
			pageNo = 1;
		}

		if (pageSize < 5 || pageSize > 15) {
			pageSize = 5;
		}

		HashMap<String, Object> options = new HashMap<>();
		options.put("titles", titles);
		options.put("orderColumn", orderColumn);
		options.put("align", align);

		int totalCount = boardService.getTotalCount();
		int lastPageNo = totalCount / pageSize;
		if ((totalCount % pageSize) > 0) {
			lastPageNo++;
		}

		// view 컴포넌트가 사용할 값을 Model에 담는다.
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("lastPageNo", lastPageNo);
		model.addAttribute("list", boardService.list(pageNo, pageSize, options));
		return "board/list";
	}

	@RequestMapping("{no}")
	public String view(@PathVariable int no, Model model) throws Exception {

		model.addAttribute("board", boardService.get(no));
		return "board/view";
	}

	@RequestMapping("form")
	public String form() throws Exception {
		return "board/form";

	}
	
	//XML 설정으로 트랜잭션을 조정한다면 @Transactional 애노테이션은 필요없다.
	//@Transactional
	@RequestMapping("add")
	public String add(Board board,
			MultipartFile[] file,
								 @ModelAttribute(value="loginUser") Member loginUser
								 ) throws Exception {

		String uploadDir = servletContext.getRealPath("/download");

		List<UploadFile> uploadFiles = new ArrayList<>();

		for (MultipartFile part : file) {
			if (part.isEmpty())
				continue;

			String filename = this.writeUploadFile(part, uploadDir);
			uploadFiles.add(new UploadFile(filename));

		}
		board.setFiles(uploadFiles);
		
		//게시글 작성자는 로그인 사용자이다.
		board.setWriter(loginUser);
		
		//게시글 등록
		boardService.add(board);
		

		return "redirect:list";
	}

	@RequestMapping("update")
	public String update(Board board, MultipartFile[] file) throws Exception {
		String uploadDir = servletContext.getRealPath("/download");

		List<UploadFile> uploadFiles = new ArrayList<>();

		for (MultipartFile part : file) {
			if (part.isEmpty())
				continue;

			String filename = this.writeUploadFile(part, uploadDir);
			uploadFiles.add(new UploadFile(filename));

		}
		board.setFiles(uploadFiles);

		Member writer = new Member();
		writer.setNo(22);
		writer.setName("홍길동");

		boardService.update(board);
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(int no) throws Exception {

		boardService.delete(no);
		return "redirect:list";
	}

	long prevMillis = 0;
	int count = 0;

	// 다른 클라이언트가 보낸 파일명과 중복되지 않도록 서버에 파일을 저장할 때는 새 파일명을 만든다.
	synchronized private String getNewFilename(String filename) {
		long currMillis = System.currentTimeMillis();
		if (prevMillis != currMillis) {
			count = 0;
			prevMillis = currMillis;
		}
		return System.currentTimeMillis() + "_" + count++ + extractFileExtName(filename);
	}

	private String extractFileExtName(String filename) {
		int dotposition = filename.lastIndexOf(".");
		if (dotposition == -1)
			return "";

		return filename.substring(dotposition);
	}

	private String writeUploadFile(MultipartFile part, String path) throws IOException {

		String filename = getNewFilename(part.getOriginalFilename());
		part.transferTo(new File(path + "/" + filename));

		return filename;
	}

}
