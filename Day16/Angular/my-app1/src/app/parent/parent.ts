import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  standalone: false,
  template: ` <p>parent works!</p>
        <app-childt [childmsg]="'Hello from parent!'"  [childobj]="{ name: 'John', age: 30 }"></app-childt>

         Enter the : <input type="text" [(ngModel)]="parentmesage">
         
       <app-childt [childmsg]="parentmesage"  [childobj]="parentobj"></app-childt>


      
       `,
  styles: ``,
})
export class Parent {

    parentmesage: string = 'Hello from parent!';
    parentobj: object = { name: 'John', age: 30 };

}
