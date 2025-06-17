import express, { json } from 'express';

const app = express();

app.use(express.json());

let students = [

    {id:1,name:"Rahul",age:20},
    {id:2,name:"priya",age:22},
]

app.get("/getStudents",(req,res)=>{

    res.json(students);
})

app.get("/getStudent/:id",(req,res)=>{

    const id = Number(req.params.id);

    const student = students.filter(curStudent=>curStudent.id===id);

    if(student.length==-1){

        res.status(404).send("Student not in the list");
    } else{

        res.json(student);
    }
})

app.post("/addStudent",(req,res)=>{

    const id = Number(req.body.id);
    const name = req.body.name;
    const age = req.body.age;
    const student = {id:id,name:name,age:age}

    students.push(student);

    res.json("student added successfully");
})

app.put("/updateStudent/:id",(req,res)=>{

    const id = Number(req.params.id);

    let index = students.findIndex(x=>x.id===id);

    if(index==-1){

        res.status(404).send("user not found");
    } else{

        const newName = req.body.name;
        const newAge = req.body.age;
        
        students[index].name = newName;
        students[index].age = newAge;
        res.json(students[index]);
    }
})


app.delete("/deleteStudent/:id",(req,res)=>{

    const id = Number(req.params.id);

    let index = students.findIndex(x=>x.id===id);

    if(index==-1){

        res.status(404).send("user not found");
    } else{

       students.splice(index,1);

       res.send("student deleted successfully");
       res.send(students[index]);
    }
})

app.listen(8000,()=>{

    console.log("server started");
})