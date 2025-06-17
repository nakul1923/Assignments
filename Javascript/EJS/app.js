import express from 'express';
import db from './db.js'
const app = express();
app.use(express.urlencoded)({extended:false})

app.set('view engine','ejs');

app.get('/',(req,res)=>{

    const users = [

        {name:"deepika",age:30},
        {name:"rashmika",age:20},
        {name:"katappa",age:37}

    ]
    res.render('home',{users});
})


app.listen(3000,()=>{

    console.log("server started");
})