interface Employee {
    userId: string,
    jobTitleName: string
    firstName: string
    lastName: string,
    preferredFullName:string
    employeeCode: string
    region: string
    phoneNumber: string
    emailAddress: string
    id: string
}
async function createEmployee() {
    const userId=document.getElementById("userId") as HTMLInputElement;
    const jobTitleName=document.getElementById("jobTitle") as HTMLInputElement;
    const firstName=document.getElementById("firstName") as HTMLInputElement;
    const lastName=document.getElementById("lastName") as HTMLInputElement;
    const preferredFullName=document.getElementById("preferredFullName") as HTMLInputElement;
    const employeeCode=document.getElementById("employeeCode") as HTMLInputElement;
    const region=document.getElementById("region") as HTMLInputElement;
    const phoneNumber=document.getElementById("phoneNumber") as HTMLInputElement;
    const emailAddress=document.getElementById("emailAddress") as HTMLInputElement;
    const id=document.getElementById("id") as HTMLInputElement;
        
    const newEmployee: Employee = { 
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

const createButton = document.getElementById("submit") as HTMLButtonElement;
createButton.addEventListener("click", createEmployee); 

