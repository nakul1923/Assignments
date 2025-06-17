import express, { Router } from 'express';

const app = express();

const router = Router();

router.get("/getallusers",(req,res)=>{

    res.send("plz collect all users");
})

router.post("/adduser",(req,res)=>{

    res.send("user added");

})

export default router;