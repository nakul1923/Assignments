import express from 'express';
import employeeRouter from './routes/employee.js';

const app = express();

app.use(express.json());

app.use("/employees",employeeRouter);

app.listen(8000,()=>{

    console.log("server started");
})