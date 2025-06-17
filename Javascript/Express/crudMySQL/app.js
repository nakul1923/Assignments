import express from 'express';
import mysql from 'mysql2';
import db from './db.js';

const app = express();

app.use(express.json());

app.get("/users",(req,res)=>{

    db.query("select * from users",(err,result)=>{

        if(err){

            res.status(500).send(err);
        } else{

            res.json(result);
        }
    })
})

app.post("/adduser",(req,res)=>{

    const {name,email} = req.body;
    const str = "insert into users(name,email) values(?,?)";
    db.query(str,[name,email],(err,data)=>{

        if(err){

            res.status(500).send("some error is there");
        } else{

            // res.json(data);
            res.send("data added successfully");
        }
    })
})

app.get("/users/:id",(req,res)=>{

    const id = req.params.id;
    const str = "select * from users where id=?";
    db.query(str,[id],(err,result)=>{

        if(err){

            res.status(500).send("some problem is there");
        } else if(result.length==0){

            res.status(404).send("user not found")
        } else{

            res.json(result[0]);
        }
    })
})

app.put("/updateuser/:id",(req,res)=>{

    const id = req.params.id;
    const {name,email} = req.body;

    const str = "update users set name=?,email=? where id=?";

    db.query(str,[name,email,id],(err,result)=>{

        if(err){

            res.status(500).send("some error is there");
        } else{

            res.send("user updated successfully");
        }
    })
})

app.delete("/remove/:id",(req,res)=>{

    const id = req.params.id;
    const str = "delete from users where id=?";

    db.query(str,[id],(err,result)=>{

        if(err){

            res.status(500).send("error is there")
        } else{

            res.send("deleted successfully")
        }
    })
})

app.listen(3000,()=>{

    console.log("server started");
})