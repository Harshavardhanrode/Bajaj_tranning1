"use strict";
// const employeeList: Employee[] = [ ]
// async function fetchData() {
//   try {
//     const response = await fetch("http://localhost:3000/Employees");
//     const data: Employee[] = await response.json();
//     employeeList.push(...data);
//     console.log(employeeList);
//   } catch (error) {
//     console.error("Error fetching data:", error);
//   }
// }
// fetchData();    
async function createEmployee() {
    const userId = document.getElementById("userId");
    const jobTitleName = document.getElementById("jobTitle");
    const firstName = document.getElementById("firstName");
    const lastName = document.getElementById("lastName");
    const preferredFullName = document.getElementById("preferredFullName");
    const employeeCode = document.getElementById("employeeCode");
    const region = document.getElementById("region");
    const phoneNumber = document.getElementById("phoneNumber");
    const emailAddress = document.getElementById("emailAddress");
    const id = document.getElementById("id");
    const newEmployee = {
        userId: userId.value,
        jobTitleName: jobTitleName.value,
        firstName: firstName.value,
        lastName: lastName.value,
        preferredFullName: preferredFullName.value,
        employeeCode: employeeCode.value,
        region: region.value,
        phoneNumber: phoneNumber.value,
        emailAddress: emailAddress.value,
        id: id.value
    };
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
const createButton = document.getElementById("submit");
createButton.addEventListener("click", createEmployee);
