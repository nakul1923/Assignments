let str = "java is powerful";

let arr = str.split(" ");

let rev = [];
while(arr.length > 0){

    rev.push(arr.pop());
}

console.log(rev.join(" "));