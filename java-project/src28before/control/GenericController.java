package java100.app.control;

import java.util.ArrayList;
import java.util.Scanner;

import java100.app.domain.Member;

public class GenericController<T> {
    //Controller 클래스들이 공통으로 사용하는 Scanner 객체를 선언한다.
    static Scanner keyScan = new Scanner(System.in);
    protected ArrayList<T> list = new ArrayList<>();
    
    public void execute() {}
}
