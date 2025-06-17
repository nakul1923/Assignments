let stu1= new Object();

stu1.id=102;
stu1.name = 'deepika';
console.log(stu1);

let stu2= new Object();

stu2.age = 30;

stu2.address = 'indore';

console.log(stu2);

let stu3 = {...stu1,...stu2};

console.log(Object.values(stu3));

console.log(Object.entries(stu3));