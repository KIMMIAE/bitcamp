// 역할: Queue 방식으로 
package bitcamp.java100.ch09.ex5;

public class Queue {
    // non-static nested class
    private class Box {

        Object value;
        Box next;

        public Box() {

        }

        public Box(Object value) {
            this.value = value;
        }

    }

    // 시작과 끝 위치의
    Box head;
    Box tail;

    // 전체 상자 개수
    int len;

    public void add(Object value) {

        Box box = new Box(value);
        // 기존의 상자가 새 상자를 가리키게 한다.
        if (tail != null)
            tail.next = box;
        
        
        box.next = tail;

        tail = box;

        len++;

        if (head == null)
            head = box;
    }

    public int size() {
        return len;
    }

    public Object poll() {
        if (len == 0)
            return null;

        Box box = head;

        head = head.next;

        len--;

        return box.value;
    }
}
