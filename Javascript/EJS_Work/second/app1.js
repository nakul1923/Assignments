import express from 'express';
import db from './db.js';

const app = express();

app.use(express.urlencoded({extended: false}));
app.set('view engine','ejs');

app.get('/',(req,res)=>{

    const str = "SELECT * FROM employee";
    db.query(str,(err,result)=>{

        if(err){

            res.status(500).send(err);
        } else{

            res.render('index',{result});
        }
    })
})

app.listen(3000,()=>{

    console.log("server started");
})
