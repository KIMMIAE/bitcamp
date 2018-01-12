//함수 = 객체 + 코드
function fn() {
    console.log('okok');
    
}
fn.user = "홍길동";
fn.age = 20;
fn.plus = function(a, b) {
    console.log(a + b);
    
}

fn();

console.log(fn.user);
console.log(fn.age);
fn.plus(10, 20);