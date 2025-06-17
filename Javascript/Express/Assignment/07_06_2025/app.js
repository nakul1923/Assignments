import express from 'express';
import studentRouter from "./routes/student.js";


const app = express();

app.use(express.json());
app.use("/student",studentRouter);

app.listen(8000,()=>{

    console.log("server started");
})