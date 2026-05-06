import { add, execute } from './function.js';
const sum = add(10, 20);
console.log(`The sum of 10 and 20 is: ${sum}`);
execute((message) => {
    console.log(message);
});
