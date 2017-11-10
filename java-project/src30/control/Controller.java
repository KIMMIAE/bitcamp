package java100.app.control;

// 이 규칙은 App 클래스가 컨트롤러 객체를 사용하기 위해
// 호출하는 메서드를 선언한 것이다.
// 
public interface Controller {
    // App 클래스는 컨트롤러에 대해 이 메서드를 호출한다.
    /* public abstract */ void execute();
}
