"use strict"
// 함수 - 파라미터로 전달하기

function play(a, b, fn) {
    fn(a, b);
}

function plus(a, b) {
    console.log(a, '+', b, '=', a + b)
    
}

function minus(a, b) {
    console.log(a, '-', b, '=', a - b)
    
}

play(10, 20, plus)
play(200, 150, minus)
