const customer1 = {
    name: 'Harsh rode',
    age: 30,
    email: 'harsh@gmail.com',
    isPremiumMemeber: true
};
// console.log(customer1.name);
// console.log(customer1.age);
// console.log(customer1.email);
// console.log(customer1.isPremiumMemeber);
async function fetchCustomerData() {
    try {
        const response = await fetch('http://localhost:4000/Employee');
        const data = await response.json();
        console.log(data);
    }
    catch (error) {
        console.error('Error fetching data:', error);
    }
}
fetchCustomerData();
export {};
