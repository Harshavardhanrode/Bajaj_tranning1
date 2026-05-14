class Person {
    private name: string;
    private age: number;

    get Name(): string {
        return this.name;
    }

    get Age(): number {
        return this.age;
    }

    set Name(name: string) {
        this.name = name;
    }

    set Age(age: number) {
        this.age = age;
    }

    constructor( name: string = "", age: number = 0 ) {
        this.name = name;
        this.age = age;
    }

    toString(): string {
        return `Name: ${this.name}, Age: ${this.age}`;
    }

    displayPerson(): void {
        console.log(`Name: ${this.name}, Age: ${this.age}`);
    }
} 

const person1 = new Person("Alice", 30);
const person2 = new Person("Bob", 25);
// person1.displayPerson();
// person2.displayPerson();


// console.log(person1.Name);
// console.log(person1.Age);

// person1.Name = "Charlie";
// person1.Age = 35;
// person1.displayPerson();

console.log(person1.toString());
console.log(JSON.stringify(person1));

/*
interface PersonInterface {
    name: string;
    age: number;
    displayPerson(): void;
}

class employee implements PersonInterface {
    name: string;
    age: number;
    employeeId: number;

    constructor(name: string, age: number, employeeId: number) {
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
    }
    displayPerson(): void {
        console.log(`Name: ${this.name}, Age: ${this.age}, Employee ID: ${this.employeeId}`);
    }

    
}

const employee1 = new employee("Charlie", 28, 101);
employee1.displayPerson();

*/