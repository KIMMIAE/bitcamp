
function createScore(name, kor, eng, math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3;
}

var s1 = new createScore("홍길동", 100, 100, 100);
var s2 = new createScore("임꺽정", 90, 90, 90);
var s3 = new createScore("유관순", 80, 80, 80);


function displayScore(score) {
    console.log(
            score.name,
            score.kor, score.eng, score.math,
            score.sum, score.aver);
    
}

displayScore(s1);
displayScore(s2);
displayScore(s3);
