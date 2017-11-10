package java100.app.control;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class GenericController<T> implements Controller {
    //Controller 클래스들이 공통으로 사용하는 Scanner 객체를 선언한다.
    static Scanner keyScan = new Scanner(System.in);
    protected ArrayList<T> list = new ArrayList<>();
    
    //Controller 인터페이스로부터 execute()라는 추상 메서드를 받았기 때문에 
    // ....
    //public abstract void execute();
}
