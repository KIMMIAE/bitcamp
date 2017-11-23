package java100.app.control;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Room;

// 자바는 다중 상속을 지원하지 않음!!
// 그래서 GenericController를 상속받을 때 이용할 수 있었던 
// Scanner 객체를 사용하지 못함.
public class RoomController extends ArrayList<Room> implements Controller {
    private static final long serialVersionUID = 1L;
    Scanner keyScan = new Scanner(System.in);

    private String dataFilePath;

    public RoomController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }

    private void save() {

    }

    public void destroy() {
        try (PrintWriter out = new PrintWriter(new BufferedWriter((new FileWriter(this.dataFilePath))))) {
            for (Room room : this) {
                out.write(room.toCSVString() + "\n");
            }
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init() {
        try (FileReader in = new FileReader(this.dataFilePath); Scanner lineScan = new Scanner(in);) {
            String csv = null;
            while (lineScan.hasNextLine()) {
                csv = lineScan.nextLine();

                try {
                    this.add(new Room(csv));
                } catch (CSVFormatException e) {
                    System.out.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void execute(Request request, Response response) {

        // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
        switch (request.getMenuPath()) {
        case "/room/list":
            this.doList(request, response);
            break;
        case "/room/add":
            this.doAdd(request, response);
            break;
        case "/room/delete":
            this.doDelete(request, response);
            break;
        default:
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 목록]");

        Iterator<Room> iterator = this.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();

            out.printf("%s, %s, %d\n", room.getLocation(), room.getName(), room.getCapacity());
        }
    }

    private void doAdd(Request request, Response response) {

        Room room = new Room();
        room.setName(request.getParameter("name"));

        room.setLocation(request.getParameter("location"));
        room.setCapacity(Integer.parseInt(request.getParameter("capacity")));

        this.add(room);
        PrintWriter out = response.getWriter();
        out.println("저장하였습니다.");
    }

    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        String roomName = request.getParameter("name");
        out.println("[강의실 삭제]");

        Room room = find(roomName);

        if (room == null) {
            out.printf("'%s'의 강의실 정보가 없습니다.\n", roomName);
            return;
        }
        this.remove(room);
        out.println("삭제하였습니다.");

    }

    private Room find(String roomName) {
        Iterator<Room> iterator = this.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            if (room.getName().equals(roomName)) {
                return room;
            }
        }
        return null;
    }
}
