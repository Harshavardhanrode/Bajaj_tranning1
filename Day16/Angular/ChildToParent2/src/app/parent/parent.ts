import { Component } from '@angular/core';
import {products} from '../../../data/products.json';

@Component({
  selector: 'app-parent',
  standalone: false,
  template: ` 
  
  <h2>Message from Child: {{messageFromChild}}</h2>
  <app-child (sendMessage) ="receiveMessage($event)"></app-child>
  
   <app-search-box (search)="searchProducts($event)"></app-search-box>
  <ul>
    <li *ngFor="let product of filteredProducts">{{ product }}</li>
  </ul> 
  
  `,
  styles: ``,
})
export class Parent {

constructor() {}
  messageFromChild: string = "";

  receiveMessage($event: string ){
    this.messageFromChild = $event
  }

  private products = products;
  //  private products = ['iPhone', 'Samsung Phone', 'Oppo Phone', 'Vivo Phone', 'OnePlus Phone'];
  filteredProducts: string[] = [];
  searchProducts(searchText: string) {
    const filteredProducts = this.products.filter(product =>
      product.toLowerCase().includes(searchText.toLowerCase())
    );
    this.filteredProducts = filteredProducts; 
    console.log('Search results:', filteredProducts);
  }

}
