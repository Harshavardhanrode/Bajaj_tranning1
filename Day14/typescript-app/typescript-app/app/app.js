import { greet, add } from './function';
console.log(greet('Alice'));
console.log(`The sum of 5 and 3 is: ${add(5, 3)}`);
const inputHtmlElement = document.getElementById('username');
const inputEmailElement = document.getElementById('email');
const inputPasswordElement = document.getElementById('password');
const buttonHtmlElement = document.getElementById('submit');
const outputHtmlElement = document.getElementById('output');
buttonHtmlElement.addEventListener('click', () => {
    const username = inputHtmlElement.value;
    const email = inputEmailElement.value;
    const password = inputPasswordElement.value;
    outputHtmlElement.textContent = `Hello, ${username}! Your email is ${email} and your password is ${password}.`;
});
async function fetchData() {
    try {
        const response = await fetch('https://jsonplaceholder.typicode.com/todos/1');
        const data = await response.json();
        console.log(data);
    }
    catch (error) {
        console.error('Error fetching data:', error);
    }
}
fetchData();
