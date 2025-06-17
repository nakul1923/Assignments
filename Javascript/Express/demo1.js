import express from 'express';

const app = express();

app.get("/",function(req,res){

   // res.send("welcome in our website" + req.query.name + " and " + req.query.address);
    res.send(`welcome ${req.query.name} and address is ${req.query.address}`);
})

app.get("/about",(req,res)=>{

    res.send("this is about page")
})

app.post("/",(req,res)=>{

    res.send("this is post method");
})

app.post("/addEmp",(req,res)=>{

    res.send("employe added")
})

app.post("/remove",(req,res)=>{

    res.send("employe deleted");
})





app.listen(3000,()=>{

    console.log("server started")
})