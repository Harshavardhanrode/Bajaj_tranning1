import { India } from './../india/india';
import { Component } from '@angular/core';

@Component({
  selector: 'app-contact-us',
  standalone: false,
  template: ` <p>contact-us works!</p> 
    <nav>
      <ul>
        <li ><a routerLink="india">India</a></li>
        <li ><a routerLink="usa">USA</a></li>  
      </ul>


    </nav>
  
  `,
  styles: ``,
})
export class ContactUs {


}
