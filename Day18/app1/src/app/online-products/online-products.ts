import { Component } from '@angular/core';
import axios from 'axios';

@Component({
  selector: 'app-online-products',
  standalone: false,
  template: ` <p>online-products works!</p> 
  

  <ul>
    
    <li *ngFor = "let item of listofproducts">
      <div id = "{{item.id}}">
          <h4><a  [routerLink]="['/online-products', item.id]" > {{item.title}}</a></h4>
          <hr>
      </div>
    </li>
  </ul>
  `,
  styles: ``,
})
export class OnlineProducts {

listofproducts:any[] = []

async ngOnInit():Promise<void>{
  let response = await axios.get('https://fakestoreapi.com/products')
  this.listofproducts = response.data;
  
}


}
