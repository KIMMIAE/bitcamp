// 스태틱 변수는 클래스가 로딩될 때 단 한 번만 생성된다.
// 만약 데이터를 개별적으로 다루고 싶다면 인스턴스 변수로 전환해야 한다.

public class ScoreDao {
        Score[] scores = new Score[10000];
        int cursor = 0;
        
        void add(Score score) {
            if (this.cursor == this.scores.length) {
                System.err.println("최대 저장 개수를 초과하였습니다.");
                return;
            }
            this.scores[this.cursor++] = score;
        }
        
        int size() {
            return this.cursor;
        }
        
        Score get(int index) {
            if (index < 0 || index >= this.cursor) {
                return null;
            }
            return this.scores[index];

    }
}
