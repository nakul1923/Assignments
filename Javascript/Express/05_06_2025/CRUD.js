import express from 'express';

const app = express();

app.use(express.json())

let users= [

    {id:101,name:"rashmika"},
    {id:102,name:"deepika"},
    {id:103,name:"katappa"}

]

app.get('/getall',(req,res)=>{

    console.log("API call for list of users");
    res.json(users);
})

app.post("/adduser",(req,res)=>{

    console.log("API call for add new user");
    const id = req.body.id;
    const name = req.body.name;
    const user = {id:id,name:name};
    users.push(user);

    res.status(201).json(user);
})


app.get("/getuser/:id",(req,res)=>{

    const id=Number(req.params.id);

    const user = users.filter(x=>x.id===id);

    if(user.length<1){

        res.status(404).send("user not found")
    } else{

        res.json(user)
    }
})




app.delete("/removeuser/:id",(req,res)=>{

    const id = Number(req.params.id);

    const index = users.findIndex(x=>x.id===id);
    if(index===-1){

        res.status(404).send("user not found")
    } else{

        users.splice(index,1);
        res.send("deleted successfully");
    }

})

app.put('/update/:id',(req,res)=>{

    const id = Number(req.params.id);
    const NewName = req.body.name;
    const index = users.findIndex(x=>x.id===id);

    if(index!=-1){

        users[index].name = NewName;
        res.status(200).send("updated successfully");
    } else{

        res.status(404).send("user not found");
    }
})

app.listen(3000,()=>{

    console.log("server started");
})
