function RequireRole(role: string) {
  return function (
    target: any,
    context: any
  ) {
    const originalMethod = context.value;

    context.value = function (...args: any[]) {
      if (this.role !== role) {
        console.log(`Access denied! Required role: ${role}`);
        return;
      }
      return originalMethod.apply(this, args);
    };
  };
}


class Employee {
  constructor(public name: string, public role: string) {}

  @RequireRole("manager")
  approveBudget() {
    console.log(`${this.name} approved the budget`);
  }

  @RequireRole("admin")
  deleteUser() {
    console.log(`${this.name} deleted a user`);
  }
}


const emp1 = new Employee("Rahul", "employee");
const emp2 = new Employee("Priya", "manager");
const emp3 = new Employee("Amit", "admin");

emp1.approveBudget(); // ❌ Access denied
emp2.approveBudget(); // ✅ Works
emp3.deleteUser();    // ✅ Works