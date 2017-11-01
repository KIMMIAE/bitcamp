// 역할:BookStack을 이용하는 예
package bitcamp.java100.ch09.ex6;

public class BookStack {
    // non-static nested class
    private class Box {

        Book value;
        Box next;

        public Box() {

        }

        public Box(Book value) {
            this.value = value;
        }

    }

    // 시작 상자와 끝 상자의 주소
    Box top;

    // 전체 상자 개수
    int len;

    public void push(Book value) {
        // 맨 꼭대기에 있는 빈 상자에 값을 보관한다.

        // 새 상자를 만든다.
        Box box = new Box(value);

        box.next = top;

        // 꼭대기를 새 상자로 바꾼다
        top = box;

        len++;
    }

    public int size() {
        return len;
    }

    public Book pop() {
        if (len == 0)
            return null;

        Box box = top;

        top = top.next;

        len--;

        return box.value;
    }
}
