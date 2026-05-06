import { greet, add } from './function';
console.log(greet('Alice'));
console.log(`The sum of 5 and 3 is: ${add(5, 3)}`);


const inputHtmlElement = document.getElementById('username') as HTMLInputElement;
const inputEmailElement = document.getElementById('email') as HTMLInputElement;
const inputPasswordElement = document.getElementById('password') as HTMLInputElement;
const buttonHtmlElement = document.getElementById('submit') as HTMLButtonElement;
const outputHtmlElement = document.getElementById('output') as HTMLParagraphElement;

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
    }catch (error) {
        console.error('Error fetching data:', error);
    }
}

fetchData();