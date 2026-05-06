async function createEmployee() {
    const empId = (document.getElementById("empid") as HTMLInputElement).value;
    const empName = (document.getElementById("empname") as HTMLInputElement).value;
    const empAge = parseInt((document.getElementById("empage") as HTMLInputElement).value);

    const employee = new employee(empName, empAge, parseInt(empId));
    employee.displayPerson();
}