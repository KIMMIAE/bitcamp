
//일반 함수를 생성자처럼 사용하는 함수. 생성자 '역할'을 하는 함수.
function Score(name, kor, eng, math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3;
}

var s1 = new Score("홍길동", 100, 100, 100);
var s2 = new Score("임꺽정", 90, 90, 90);
var s3 = new Score("유관순", 80, 80, 80);


function displayScore(score) {
    console.log(
            score.name,
            score.kor, score.eng, score.math,
            score.sum, score.aver);
    
}

displayScore(s1);
displayScore(s2);
displayScore(s3);
