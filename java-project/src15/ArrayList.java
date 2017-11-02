// 제네릭 적용 

package java100.app;

import java.lang.reflect.Array;

public class ArrayList<T> {

    
        private T[] list;
        private int cursor = 0;
        
        public ArrayList() {
            //Array.newInstance(T, 10000);
        }
        
        
        
        void add(T obj) {
            if (this.cursor == this.list.length) {
                System.err.println("최대 저장 개수를 초과하였습니다.");
                return;
            }
            this.list[this.cursor++] = obj;
        }
        
        int size() {
            return this.cursor;
        }
        
        
        
        T get(int index) {
            if (index < 0 || index >= this.cursor) {
                return null;
            }
            return (T)this.list[index];

    }
}
