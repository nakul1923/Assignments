students = [];

function addStudent(name){

    if(!(students.includes(name))){

        students.push(name);
    } else{

        console.log("Student with name "+ name + " is already present")
    }
    
}

function viewStudents(){

    console.log(students);
}

function updateName(oldName,newName){

    if(students.includes(oldName)){

        index =  students.indexOf(oldName);

        students.splice(index,1,newName);
    } else{

        console.log("no student present with name " + oldName)
    }
}

function deleteStudent(name){

    if(students.includes(name)){

        index =  students.indexOf(name);

        students.splice(index,1);
    } else{

        console.log("no student present with name " + name)
    }
}

function checkStudent(name){

    if(students.includes(name)){

        console.log(name + " is present in the list")
    } else{

        console.log("no student present with name " + name)
    }
}

function count(){

    console.log("there are " + students.length + " students present in the list")
}

function sorting(){

    students.sort();
}

function deleteAllStudents(){

    students.splice(0,students.length);
}

addStudent("nakul");
addStudent("shrey");
addStudent("rhoit");
addStudent("nakul")
addStudent("tanishka")
addStudent("badal")
addStudent("sandeep")

viewStudents();

updateName("rhoit","rohit");

viewStudents();

deleteStudent("shrey");

viewStudents();

count();

console.log(students);

sorting();

console.log(students);


deleteAllStudents();

console.log(students);
