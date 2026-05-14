import { Component } from '@angular/core';

@Component({
  selector: 'app-child1',
  standalone: false,
  template: ` <p>child1 works!</p> `,
  styles: ``,
})
export class Child1 {
  childmsg :string = '';
   constructor(){};

}
