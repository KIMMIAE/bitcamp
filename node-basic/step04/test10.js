// 객체 II - 배열과 for문

var arr = [10, 20, 30, 40];
for (var i in arr) {
    console.log(arr[i])
}

console.log("-----------------------------")

for (var value of arr) {
    console.log(value);
}

console.log("-----------------------------")

arr.forEach(function(value, index) {
    console.log(index, value)
    
})

    