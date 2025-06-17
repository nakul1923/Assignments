import express from 'express';

const app = express();

app.use(express.json());

app.get('/get',(req,res)=>{

    res.send("welcome in express");
})

app.host('/add',(req,res)=>{

    console.log(req.body);
    const name= req.body.name;
    res.send("apka swagat he " + name);
})

app.listen(3000,()=>{

    console.log("server started");
})