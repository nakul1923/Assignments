let student = {

    name : "deepika",
    address: "indore",
    marks: 90
}

let send = JSON.stringify(student);

console.log(send);

let obj = JSON.parse(send);

console.log(obj);
console.log(obj.name);