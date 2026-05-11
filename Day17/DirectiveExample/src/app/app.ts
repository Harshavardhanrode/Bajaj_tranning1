import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <h1>Hello, {{ title() }}</h1>
    <p>Congratulations! Your app is running. 🎉</p>
    <fieldset>
      <legend>Component Directive</legend>
    
    </fieldset>

    <fieldset>
      <legend>Attribute Directive </legend>
      <div [ngClass]="{'text-success': isSuccess,'text-danger': !isSuccess}">
	    Text
	</div>
    </fieldset>




     <fieldset>
      <legend>custom attribute Directive </legend>
      
                  <p appMyHighlight>
              Move mouse here
            </p>

    </fieldset>

    <fieldset>
      <legend>focus transition</legend>
      <br />
    <img  [src]="image" appMyHighlight >
    <br />
                

    </fieldset>
    

     <fieldset>
      <legend>autofocus </legend>
      <input appAutofocus type="text"  />

    </fieldset>
  `,
  standalone: false,
  styles: [
    `.text-success {
      color: green;
    }
    .text-danger {
      color: red;
    }
    `
  ]
})
export class App {
  
  isSuccess = true;
   image='https://angular.io/assets/images/logos/angular/angular.svg';
  protected readonly title = signal('DirectiveExample');
}
