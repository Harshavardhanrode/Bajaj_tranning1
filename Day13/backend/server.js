const e = require('express');
const express = require('express'); 
const app = express();
app.use(express.urlencoded({ extended: true }));
app.use(express.json());


app.listen(3000, () => {
    console.log('Server is running on port 3000');
});

app.get('/validate', (req, res) => {
    res.send('Hello, World!');
});

app.post('/data', (req, res) => {
    const {username,password} = req.body;
    console.log('Received data:', {username, password});
    if (!username || !password) {
        return res.status(400).send('Username and password are required');
    }else if (username === 'admin' && password === 'password') {
        res.status(200).send('Login successful');
    } else {
        res.status(401).send('Invalid username or password');
    }
});
