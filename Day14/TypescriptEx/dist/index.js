"use strict";
let values = [1, 2, 3, 4];
values.forEach(value => {
    console.log(value);
});
let collection = [1, "Hello", true, { name: "John" }, [1, 2, 3]];
collection.forEach(item => {
    if (typeof item === "object") {
        console.log('item :' + JSON.stringify(item));
    }
    else if (Array.isArray(item)) {
        console.log("item : ${item.join(", ")}");
    }
    else {
        console.log('item :' + item);
    }
});
// mutiple loops to traverse collection
let names = ["Harsh", "Tushar", "yash"];
names.forEach(name => {
    console.log(name);
});
console.log("===================================:");
for (let i = 0; i < names.length; i++) {
    console.log(names[i]);
}
console.log("===================================:");
for (let name of names) {
    console.log(name);
}
console.log("===================================:");
for (let index in names) {
    console.log(names[index]);
}
