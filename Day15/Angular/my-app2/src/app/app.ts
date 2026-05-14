import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  
  template: `

  <fieldset>
  <legend>Data Binding</legend>
  <h1>Hello, {{ title() }}</h1>
    <p>Congratulations! Your app is running. 🎉</p>
    <p>Welcome to {{ appName }}!</p>
    <h2>Friends List:</h2>
    <ul>
      <li *ngFor="let friend of friendsList">{{ friend }}</li>
    </ul>
    <h2>Employee Records:</h2>
    <table border="1">
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
      </tr>
      <tr *ngFor="let emp of empRecords">
        <td>{{ emp.id }}</td> 
        <td>{{ emp.name }}</td>
        <td>{{ emp.age }}</td>
      </tr>
      

    </table>
    </fieldset>

    <fieldset>
    <legend>Event Binding</legend>
    <button (click)="showAlert()"> Click Me</button>
    </fieldset>


    <fieldset>
    <legend>Two-Way Binding</legend>
    <input [(ngModel)]="username" placeholder="Enter username">
    <p>Current Username: {{ username }}</p>

    <select [(ngModel)]="selectedCity">
  <option value="Pune">Pune</option>
  <option value="Mumbai">Mumbai</option>
</select>

<p>Selected: {{ selectedCity }}</p>


<input type="checkbox" [(ngModel)]="isChecked"> 
Login Status: {{ isChecked ? 'Logged In' : 'Logged Out' }}  
<br/>
<br/>
<input type=radio name="gender" [(ngModel)]="gender" value="Male"> Male
<input type=radio name="gender" [(ngModel)]="gender" value="Female">  Female
<p>Selected Gender: {{ gender }}</p>      

    </fieldset>

<fieldset>
  <legend>Property Binding</legend>
  
  <img [src]="image" alt="Angular Logo" width="200">
</fieldset> 
  


<fieldset>
<legend>Signup form</legend>
<form>
  <label for="name ">Name :</label>
  <input type="text" placeholder="Enter name" id="name" name="name"><br><br> 
  

  <label for="email">Select gender : </label>
  <select [(ngModel)]="logingender">
  <option value="male">male</option>
  <option value="female">female</option>
   <option value="other">other</option>
</select>

<p>Selected: {{ logingender }}</p>
<br />

<label for="password">Password :</label>
  <input type="password" id="password" name="password"><br><br>
  <label for="conformpassword">Confirm Password :</label>
  <input type="password" id="conformpassword" name="conformpassword"><br><br>
  <input type="submit" value="Signup">
</form>
  
</fieldset> 


  `,
  
 standalone: false,
  styles: []
})
export class App {

isChecked=false;
  gender='';
  logingender='';
  image='https://angular.io/assets/images/logos/angular/angular.svg';
  selectedCity = '';
  username="Eshan"
  protected readonly title = signal('my-app3');
  appName="Angular My Application";
  friendsList=['Alice', 'Bob', 'Charlie'];
  empRecords=[
    {id:1, name:'Alice', age:30},
    {id:2, name:'Bob', age:25},
    {id:3, name:'Charlie', age:35}
  ];
  
  showAlert() {
    alert('Button clicked!');
  }


}