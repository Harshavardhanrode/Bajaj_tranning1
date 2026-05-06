import { User } from "./user";

export function greetUser(user: User) {
    console.log(`Hello, ${user.name}! Welcome to our application.`);
}
greetUser({ name: "Rahul" });