// JSON(JavaScript Object Notation)

var obj = {
        name: "홍길동",
        "age": 20,
        'tel': '111-1111'
        
};

console.log(obj);

var JsonStr = '{"name":"홍길동","age":20,"tel":"111-1111"}';

// => JSON.stringify(obj)

var JsonStr2 = JSON.stringify(obj);

console.log(JsonStr);
console.log(JsonStr2);