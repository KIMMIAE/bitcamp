package bitcamp.java100.ch13.ex9;

public class ScoreOutOfBoundsException extends Exception {

        public ScoreOutOfBoundsException() {
            super(); // 그냥 수퍼 클래스의 기본 생성자를 호출한다.
        }

        public ScoreOutOfBoundsException(String message) {
            super(message); // 그냥 수퍼 클래스의 메시지를 받는 생성자를 호출한다.
        }

    }

