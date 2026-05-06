"use strict";
/// <reference path="file1.ts" />
var MyNamespace;
(function (MyNamespace) {
    function greet(user) {
        console.log(`Hello, ${user.name}!`);
    }
    MyNamespace.greet = greet;
})(MyNamespace || (MyNamespace = {}));
/// <reference path="file2.ts" />
const user = { name: "Alice" };
MyNamespace.greet(user);
