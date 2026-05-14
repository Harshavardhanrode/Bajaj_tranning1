import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-childt',
  standalone: false,
  template: ` <p>childt works!</p> 
  
      <p> msg from parent : {{childmsg | uppercase }}</p>
       <p> obj from parent : {{childobj | json}}</p>`,
  styles: `
    p{
    color:blue;
    font-size:20px;
    font-weight:bold;
    }
  
  `,
})
export class Childt {

  @Input() childmsg: string = '';
  @Input() childobj: object = {};

}
