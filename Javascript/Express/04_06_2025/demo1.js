//In the above example app.use() is a method in express used to mount middleware functions.

// middleware functions are the functions that have access to the request object, response object and the next middleware function.



import express from 'express';

const app = express();

app.use((req,res,next)=>{

     console.log("request received", Date.now());

     next();
})

app.get('/',(req,res)=>{

    res.send("welcome in express");
})

app.listen(3000);