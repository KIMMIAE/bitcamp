package java100.app.control;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Member;
import java100.app.util.Prompts;

public class MemberController extends GenericController<Member> {

    private String dataFilePath;

    public MemberController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }

    private void save() {

    }

    @Override
    public void destroy() {
        try (PrintWriter out = new PrintWriter(new FileWriter(this.dataFilePath));) {
            for (Member member : this.list) {
                out.write(member.toCSVString() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() {

        try (FileReader in = new FileReader(this.dataFilePath); Scanner lineScan = new Scanner(in);) {

            String csv = null;
            while (lineScan.hasNextLine()) {
                csv = lineScan.nextLine();
                try {
                    list.add(new Member(csv));
                } catch (CSVFormatException e) {
                    System.err.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void execute(Request request, Response response) {

        switch (request.getMenuPath()) {
        case "/member/list":
            this.doList(request, response);
            break;
        case "/member/add":
            this.doAdd(request, response);
            break;
        case "/member/view":
            this.doView(request, response);
            break;
        case "/member/update":
            this.doUpdate(request, response);
            break;
        case "/member/delete":
            this.doDelete(request, response);
            break;
        default:
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[회원 목록]");

        Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();

            out.printf("이름: %s\n", member.getName());
            out.printf("이메일: %s\n", member.getEmail());
        }
    }

    private void doAdd(Request request, Response response) {

        Member member = new Member();
        member.setEmail(request.getParameter("email"));
        member.setName(request.getParameter("name"));
        member.setPassword(request.getParameter("password"));

        list.add(member);

        PrintWriter out = response.getWriter();
        out.println("저장하였습니다.");
    }

    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        Member member = findByEmail(email);

        out.println("[회원 상세 정보]");

        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
            return;
        }
        out.printf("이름: %s\n", member.getName());
        out.printf("이메일: %s\n", member.getEmail());
        out.printf("암호: %s\n", member.getPassword());

    }

    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        Member member = findByEmail(email);

        out.println("[회원 변경]");

        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
            return;
        }

        member.setName(request.getParameter("name"));
        member.setPassword(request.getParameter("password"));
        out.println("변경하였습니다.");
    }

    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        Member member = findByEmail(email);

        System.out.println("[회원 삭제]");

        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
        } else {
            list.remove(member);
            System.out.println("삭제하였습니다.");
        }
    }

    private Member findByEmail(String email) {
        Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getEmail().equals(email)) {
                return member;
            }
        }
        return null;
    }
}
