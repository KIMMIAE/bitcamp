"use strict"
// 함수 - 파라미터로 전달하기


function play(a, b, fn) {
    fn(a, b);
}


play(10, 20, function plus(a, b) {console.log(a, '+', b, '=', a + b)})
play(200, 150, function minus(a, b){console.log(a, '-', b, '=', a - b)})

// plus(15, 25) // 오류!
