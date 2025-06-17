import express,{Router} from 'express';

// const app = express();
const router = Router();

let Students = [

    {id:101,name:"nakul panchal",room:"12",age:22,mobile:8889435205},
    {id:102,name:"Rohit pal",room:"11",age:22,mobile:1234567890},
    {id:103,name:"Shrey Nigam",room:"10",age:21,mobile:9876543210},
]

router.get("/getAllStudents",(req,res)=>{

    res.json(Students);
})

router.get("/getStudent/:id",(req,res)=>{

    const id = req.params.id;

    const index = Students.findIndex(x=>x.id==id);

    if(index==-1){

        res.status(404).send("student not found");
    } else{

        res.json(Students[index]);
    }
})

router.post("/addStudent",(req,res)=>{

    const id = Number(req.body.id);
    const name = req.body.name;
    const room = Number(req.body.room);
    const age = Number(req.body.age);
    const mobile = req.body.mobile;

    const student = {id:id,name:name,room:room,age:age,mobile:mobile}

    Students.push(student);

    res.send("student added successfully");
    
})

router.patch("/updateStudent/:id",(req,res)=>{

    const id = Number(req.params.id);

    const index = Students.findIndex(x=>x.id===id);

    if(index==-1){

        res.status(404).send("student not found");
    } else{

        // const name = req.body.name;
        // const room = Number(req.body.room);
        // const age = Number(req.body.age);
        // const mobile = req.body.mobile;

        // Students[index].name = name;
        // Students[index].room = room;
        // Students[index].age = age;
        // Students[index].mobile = mobile;

        Students[index] = {...Students[index],...req.body};


        res.send("student updated successfully");
    }

    
})


router.put("/updateStudent/:id",(req,res)=>{

    const id = Number(req.params.id);

    const index = Students.findIndex(x=>x.id===id);

    if(index==-1){

        res.status(404).send("student not found");
    } else{

        // const name = req.body.name;
        // const room = Number(req.body.room);
        // const age = Number(req.body.age);
        // const mobile = req.body.mobile;

        // Students[index].name = name;
        // Students[index].room = room;
        // Students[index].age = age;
        // Students[index].mobile = mobile;

        Students[index] = {...Students[index],...req.body};


        res.send("student updated successfully");
    }

    
})


router.delete("/removeStudent/:id",(req,res)=>{

    const id = Number(req.params.id);

    const index = Students.findIndex(x=>x.id===id);

    if(index==-1){

        res.status(404).send("student not found");
    } else{

        Students.splice(index,1);
        res.send("student deleted successfully");
    }
})


export default router;