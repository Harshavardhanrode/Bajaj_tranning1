import { Component } from '@angular/core';

@Component({
  selector: 'app-product',
  standalone: false,
  template: ` <p>product works!</p> 
  
  <ul>
  <li *ngFor = "let item of product">
    <a  [routerLink]="['/products', item.id]">{{item.name}}</a>
  </li>
  </ul>

  `,
  styles: ``,
})
export class Product {
  product = [
    { id: 1, name: 'laptop', price: 10 },
    { id: 2, name: 'mobile', price: 20 },
    { id: 3, name: 'tablet', price: 30 },
    
  ]
  
  

  


}
