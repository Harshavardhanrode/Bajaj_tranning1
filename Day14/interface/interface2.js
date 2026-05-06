"use strict";
// const employeeList: Employee[] = [ ]
// async function fetchData() {
//   try {
//     const response = await fetch("http://localhost:4000/Employee");
//     const data: Employee[] = await response.json();
//     employeeList.push(...data);
//     console.log(employeeList);
//   } catch (error) {
//     console.error("Error fetching data:", error);
//   }
// }
// fetchData();    
async function createEmployee(newEmployee) {
    try {
        const response = await fetch("http://localhost:4000/Employee", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(newEmployee)
        });
        const createdEmployee = await response.json();
        console.log("Created Employee:", createdEmployee);
    }
    catch (error) {
        console.error("Error creating employee:", error);
    }
}
const newEmployee = {
    userId: "12345",
    jobTitleName: "Software Engineer",
    firstName: "John",
    lastName: "Doe",
    preferredFullName: "John Doe",
    employeeCode: "EMP12345",
    region: "North America",
    phoneNumber: "123-456-7890",
    emailAddress: "joan@gmail.com",
    id: "12345"
};
createEmployee(newEmployee);
