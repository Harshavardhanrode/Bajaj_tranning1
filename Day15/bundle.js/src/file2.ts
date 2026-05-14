
/// <reference path="file1.ts" />
namespace MyNamespace {
    export function greet(user: UserNamespace.User) {
        console.log(`Hello, ${user.name}!`);
    }
}