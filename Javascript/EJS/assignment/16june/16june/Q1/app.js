import express from 'express';
import db from './db.js'; 

const app = express();

app.use(express.urlencoded({ extended: false }));
app.set('view engine', 'ejs');


app.get('/', (req, res) => {
    const str = 'SELECT * FROM employee';
    db.query(str, (err, result) => {
        if (err) {
            res.status(500).send(err);
        } else {
            res.render('index', { result }); 
        }
    });
});


app.get('/giveadd', (req, res) => {
    res.render('add');
});


app.post('/add', (req, res) => {
    const { name, email, position, salary } = req.body;
    const str = 'INSERT INTO employee (name, email, position, salary) VALUES (?, ?, ?, ?)';
    db.query(str, [name, email, position, salary], (err) => {
        if (err) {
            res.status(500).send(err);
        } else {
            res.redirect('/');
        }
    });
});


app.get('/giveedit/:id', (req, res) => {
    const id = req.params.id;
    const str = 'SELECT * FROM employee WHERE id = ?';
    db.query(str, [id], (err, result) => {
        if (err) {
            res.status(500).send(err);
        } else {
            res.render('edit', { user: result[0] });
        }
    });
});


app.post('/edit/:id', (req, res) => {
    const id = req.params.id;
    const { name, email, position, salary } = req.body;
    const str = 'UPDATE employee SET name = ?, email = ?, position = ?, salary = ? WHERE id = ?';
    db.query(str, [name, email, position, salary, id], (err) => {
        if (err) {
            res.status(500).send(err);
        } else {
            res.redirect('/');
        }
    });
});


app.get('/delete/:id', (req, res) => {
    const id = req.params.id;
    const str = 'DELETE FROM employee WHERE id = ?';
    db.query(str, [id], (err) => {
        if (err) {
            res.status(500).send(err);
        } else {
            res.redirect('/');
        }
    });
});

app.listen(9000, () => {
    console.log('Server started ');
});
