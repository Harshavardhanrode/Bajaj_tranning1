"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
function RequireRole(role) {
    return function (target, context) {
        const originalMethod = context.value;
        context.value = function (...args) {
            if (this.role !== role) {
                console.log(`Access denied! Required role: ${role}`);
                return;
            }
            return originalMethod.apply(this, args);
        };
    };
}
class Employee {
    constructor(name, role) {
        this.name = name;
        this.role = role;
    }
    approveBudget() {
        console.log(`${this.name} approved the budget`);
    }
    deleteUser() {
        console.log(`${this.name} deleted a user`);
    }
}
__decorate([
    RequireRole("manager")
], Employee.prototype, "approveBudget", null);
__decorate([
    RequireRole("admin")
], Employee.prototype, "deleteUser", null);
const emp1 = new Employee("Rahul", "employee");
const emp2 = new Employee("Priya", "manager");
const emp3 = new Employee("Amit", "admin");
emp1.approveBudget(); // ❌ Access denied
emp2.approveBudget(); // ✅ Works
emp3.deleteUser(); // ✅ Works
