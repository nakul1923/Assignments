import mysql from 'mysql2';

const db = mysql.createConnection({

    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'test'
})

db.connect(err=>{

    if(err)
        throw err;
    console.log("connected to mysql successfully")
})

export default db;