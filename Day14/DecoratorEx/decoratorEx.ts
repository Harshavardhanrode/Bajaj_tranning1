function mylog(constructor: Function) {
    console.log("Constructor: ", constructor);
}

@mylog
class Person {
 constructor(public name: string, public age: number) {}
}   

const person = new Person("John", 30);
console.log("Person: ", person);

