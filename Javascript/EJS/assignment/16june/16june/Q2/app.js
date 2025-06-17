import express from 'express';
import db from './db.js'; 
const app = express();
app.set('view engine', 'ejs');
app.use(express.urlencoded({ extended: true }));


app.get('/', (req, res) => {
  db.query('SELECT * FROM students', (err, result) => {
    if (err) throw err;
    res.render('index', { students: result });
  });
});


app.get('/add', (req, res) => {
  res.render('form', { student: {}, action: '/add', method: 'POST' });
});


app.post('/add', (req, res) => {
  const data = req.body;
  db.query('INSERT INTO students SET ?', data, (err) => {
    if (err) throw err;
    res.redirect('/');
  });
});


app.get('/edit/:id', (req, res) => {
  db.query('SELECT * FROM students WHERE id = ?', [req.params.id], (err, result) => {
    if (err) throw err;
    res.render('form', { student: result[0], action: '/edit/' + req.params.id, method: 'POST' });
  });
});


app.post('/edit/:id', (req, res) => {
  const data = req.body;
  db.query('UPDATE students SET ? WHERE id = ?', [data, req.params.id], (err) => {
    if (err) throw err;
    res.redirect('/');
  });
});


app.get('/view/:id', (req, res) => {
  db.query('SELECT * FROM students WHERE id = ?', [req.params.id], (err, result) => {
    if (err) throw err;
    res.render('view', { student: result[0] });
  });
});

app.post('/delete/:id', (req, res) => {
  db.query('DELETE FROM students WHERE id = ?', [req.params.id], (err) => {
    if (err) throw err;
    res.redirect('/');
  });
});

app.listen(9000, () => console.log('Server started '));
