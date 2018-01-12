
function createScore(name, kor, eng, math) {
    var obj = new Object();
    obj.name = name;
    obj.kor = kor;
    obj.eng = eng;
    obj.math = math;
    obj.sum = obj.kor + obj.eng + obj.math;
    obj.aver = obj.sum / 3;
    return obj;
}

var s1 = createScore("홍길동", 100, 100, 100);
var s2 = createScore("임꺽정", 90, 90, 90);
var s3 = createScore("유관순", 80, 80, 80);


function displayScore(score) {
    console.log(
            score.name,
            score.kor, score.eng, score.math,
            score.sum, score.aver);
    
}

displayScore(s1);
displayScore(s2);
displayScore(s3);
