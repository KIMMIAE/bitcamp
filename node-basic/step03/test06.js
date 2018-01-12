var obj = new Object();


obj.name = "홍길동";
obj.age = 20;
obj.plus = function(a, b) {
    console.log(a + b)
};
obj.working = false;

if (obj.hasOwnProperty('age')) {
    console.log("age 있다!")
}

if (obj.age) {
    console.log("age 있다!")
}


if (obj.hasOwnProperty('tel')) {
    console.log("tel 있다!")
}

if (obj.tel) {
    console.log("tel 있다!")
}

if (obj.age) {
    console.log("age 있다!")
}

if (obj.working) {
    console.log("working 있다!")
}

if (obj.plus) {
    obj.plus(10, 20)
}

if (obj.minus) {
    obj.minus(10, 20)
}


