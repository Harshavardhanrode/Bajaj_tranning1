import { Component, Output ,EventEmitter} from '@angular/core';

@Component({
  selector: 'app-search-box',
  standalone: false,
  template: ` 
  <input type="text" placeholder="Search..." [(ngModel)]="searchText"/>
  <button (click)="searchProducts()">Search</button>
`,
  styles: ``,
})
export class SearchBox {

  searchText: string = '';

  @Output() search = new EventEmitter<string>();
  searchProducts() {
    this.search.emit(this.searchText);
  }

}