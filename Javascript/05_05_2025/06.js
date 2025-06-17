// Object.seal()

let stu = {id:101,name:'abc',address:'indore'};

Object.seal(stu);

stu.age = 90;
console.log(stu);

delete stu1.name;

console.log(stu);

stu.name = 'deepika'

console.log(stu);