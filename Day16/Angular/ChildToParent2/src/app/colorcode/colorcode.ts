import { Component } from '@angular/core';

@Component({
  selector: 'app-colorcode',
  standalone: false,

  template: `

    <h2>Color Changer</h2>

    <!-- Color Input Box -->
    <input type="color" [(ngModel)]="myColor">

    <br><br>

    <!-- Paragraph -->
    <p [style.background-color]="myColor">
      This paragraph background color will change.
    </p>

  `,

  styles: [`

    p{
      padding:20px;
      width:300px;
      color:white;
    }

  `],
})
export class Colorcode {

  myColor: string = '#ff0000';

}