import express from 'express';

import db from './db.js';

const app = express();

app.use(express.urlencoded({extended:false}))
app.set('view engine','ejs');
app.get('/',(req,res)=>{
    const search = req.query.search || '';

    let str = "select * from users";
    let values = [];
    if(search){

        str = str+' where name like ? or email ? like ?';
        values = [`%${search}%`,`%${search}`];

    }

    db.query(str,values,(err,result)=>{

        if(err){

            res.status(500).send(err);
        } else{

            res.render('index',{result,search})
        }
    })
})

app.get('/giveadd',(req,res)=>{

    res.render('add');
})

// app.post('/add',(req,res)=>{

//     res.render('add');
// })

app.post('/add',(req,res)=>{

    const {name,email} = req.body;
    const str = 'insert into users(name,email) values(?,?)';
    db.query(str,[name,email],err=>{

        if(err){

            res.status(500).send(err);
        } else{

            res.redirect('/');
        }
    })
})

app.get('/giveedit/:id',(req,res)=>{

    const id = req.params.id;
    const str = 'select * from users where id = ?';
    db.query(str,[id],(err,result)=>{

        if(err){

            throw err;
        } else{

            res.render('edit',{user:result[0]})
        }
    })
})

app.post('/edit/:id',(req,res)=>{

    const id = req.params.id;
    const {name,email} = req.body;

    const str = "update users set name=?, email=? where id=?";
    db.query(str,[name,email,id],(err,result)=>{

        if(err){

            throw err;
        } else{

            res.redirect('/');
        }
    })
})

app.get('/delete/:id',(req,res)=>{

    const id = req.params.id;
    const str = "delete from users where id=?";
    db.query(str,[id],(err,result)=>{

        if(err){

            throw err;
        } else{

            res.redirect('/')
        }
    })
})

app.listen(3000,()=>{

    console.log("server started");
})