import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl:`app.html`,
  standalone: false,
  styles: []
})
export class App {
  protected readonly title = signal('pipeExample');
  today = new Date(1988,3,23);

  name = "harsh rode"
  student = "student"
  fullName = "harshavardhan suresh rode"

  json_Obj = {name:"harsh",age:23,address:{village:"hupari",city:"kolhapur"}}

  array = [1,2,3,4,5,6,7,8,]

  price = 90000

  number = 10;

  student1 = {
  id: 101,
  name: "Harsh",
  city: "Pune"
  
};
}
