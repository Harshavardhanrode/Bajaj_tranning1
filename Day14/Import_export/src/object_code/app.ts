const person = {
    myname: 'John',
    age: 30,    
   show: function() {
        console.log(`Hello, my name is ${this.myname} and I am ${this.age} years old.`);
    }       
};

let { myname, age } = person;
console.log(myname); 
console.log(age);
console.log(person.show());