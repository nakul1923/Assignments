import express, {Router} from 'express';
import db from '../db.js';
const router = Router();

router.get("/getAllEmployees",(req,res)=>{

    db.query("select * from employee",(err,result)=>{

        if(err){

            throw err;
        } else{

            res.json(result);
        }
    })
})


router.post("/addEmployee",(req,res)=>{

    const {name,email,department,salary} = req.body;
    db.query("insert into employee(name,email,department,salary) Values(?,?,?,?)",[name,email,department,salary],(err,result)=>{

        if(err){

            throw err;
        } else{

            res.send("data added successfully");
        }
    })
})

router.get("/getEmployee/:id",(req,res))


export default router;