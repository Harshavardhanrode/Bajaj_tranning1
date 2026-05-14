import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <h1>Hello, {{ title() }}</h1>
    <p>Congratulations! Your app is running. 🎉</p>
    <app-parent></app-parent>


  

    <br />
    <br />

    <app-calculator> </app-calculator>
<br />
    <br />
    <app-colorcode></app-colorcode>
    
    <router-outlet />
  `,
  standalone: false,
  styles: []
})
export class App {
  protected readonly title = signal('ChildToParent2');
}
