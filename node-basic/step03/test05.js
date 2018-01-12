var obj = new Object();


obj.name = "홍길동";
obj.age = 20;
obj["home tel^^"] = "1111-1111";
obj['office telT.T'] = '2222-2222'
obj.plus = function(a, b) {
    console.log(a + b)
};
obj.working = true;

console.log(obj.name)
console.log(obj.age)
console.log(obj['home tel^^'])
console.log(obj['office telT.T'])
console.log(obj.working)

obj.plus(10, 20);
