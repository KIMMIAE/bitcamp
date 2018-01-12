"use strict"
// 함수 - 파라미터로 전달하기

function f1() {
    console.log('f1().....')
}

var f2 = f1
var f3 = f2

f1()
f2()
f3()
console.log('------------------')
var f4 = function() {
    console.log('f4().....')
};

f1 = f4

f1()
f2()
f3()
f4()