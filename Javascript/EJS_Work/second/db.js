import mysql from 'mysql2';

const db = mysql.createConnection({

    host: "localhost",
    user: "root",
    password: "root",
    database: "crud"
});

db.connect((err)=>{

    if(err){

        throw err;
    } else{

        console.log("database conncected");
    }
})

export default db;