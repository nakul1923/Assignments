import express from 'express';

const app = express();

app.use('/admin',(req,res,next)=>{            //if path is not given then middleware will be applied to all the routes

     console.log("request received", Date.now());

     next();
})

app.get('/',(req,res)=>{

    res.send("welcome in express");
})

app.listen(3000);