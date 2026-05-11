import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  standalone: false,
  template: ` <p>home works!</p> 
      <app-parent> </app-parent>
  `,
  styles: ``,
})
export class Home {}
