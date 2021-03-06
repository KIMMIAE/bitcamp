package java100.app.control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Room;
import java100.app.util.Prompts;

// 자바는 다중 상속을 지원하지 않음!!
// 그래서 GenericController를 상속받을 때 이용할 수 있었던 
// Scanner 객체를 사용하지 못함.
public class RoomController extends ArrayList<Room> implements Controller {

    Scanner keyScan = new Scanner(System.in);
    
    @Override
    public void execute() {
        loop: while (true) {
            System.out.print("강의실관리> ");
            String input = keyScan.nextLine();

            // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
            switch (input) {
            case "list": this.doList(); break;
            case "add": this.doAdd(); break;
            case "delete": this.doDelete(); break;
            case "main": break loop;
            default:
                System.out.println("해당 명령이 없습니다.");
            }
        }
    }

    private void doList() {
        System.out.println("[강의실 목록]");

        Iterator<Room> iterator = this.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();

            System.out.printf("%s, %s, %d\n", room.getLocation(), room.getName(), room.getCapacity());
        }
    }

    private void doAdd() {
        System.out.println("[강의실 등록]");

        Room room = new Room();

        room.setName(Prompts.inputString("강의실명? "));

        if (find(room.getName()) != null) {
            System.out.println("이미 등록된 강의실입니다.");
            return;
        }
        room.setLocation(Prompts.inputString("지역? "));
        room.setCapacity(Prompts.inputInt("수용인원? "));

        this.add(room);
    }


    private void doDelete() {
        System.out.println("[강의실 삭제]");
        String roomName = Prompts.inputString("강의실명? ");

        Room room = find(roomName);

        if (room == null) {
            System.out.printf("'%s'의 강의실 정보가 없습니다.\n", roomName);
            return;
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                this.remove(room);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
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
