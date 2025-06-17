var students = [

    {id:101,name:'deepika',marks:99},
    {id:102,name:'rashmika',marks:89},
    {id:103,name:'katappa',marks:85},
];

console.log(students);

console.log(students[0]);

console.log(students[0].name);

console.log(students[2]['name']);

for(var student of students){

    console.log("id is " + student.id + " name is " + student.name);
}