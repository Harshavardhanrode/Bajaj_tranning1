import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <h1>Hello, {{ title() }}</h1>
    <p>Angular Routing</p>

    <ul>
      <!-- <p><a routerLink="/first-component">First Component</a></p>
      <p><a routerLink="/second-component">Second Component</a></p> -->

      <li> <a routerLink="/products">Products</a></li>
      <li> <a routerLink="/online-products">Online Products</a></li>
      <li> <a routerLink="/contact-us">Contact Us</a></li>

  </ul>
    
    <router-outlet />
  `,
  standalone: false,
  styles: []
})
export class App {
  protected readonly title = signal('app1');
}
