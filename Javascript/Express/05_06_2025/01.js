import express from 'express';

const app = express();

app.use(express.json());
app.use(express.urlencoded({extended:false}))

app.post("/add",(req,res)=>{

    console.log(req.body);
    res.send("success");
})

app.listen(3000,()=>{

    console.log("server started");
})



