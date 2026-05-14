import { Component } from '@angular/core';

@Component({
  selector: 'app-calculator',
  standalone: false,

  template: `
    <div>

      <h2>Simple Calculator</h2>

     
      <label>Number 1:</label>
      <select [(ngModel)]="num1">
        <option *ngFor="let n of numbers" [value]="n">
          {{ n }}
        </option>
      </select>

      <br><br>

      <label>Operation:</label>
      <select [(ngModel)]="operation">
        <option value="+">Addition (+)</option>
        <option value="-">Subtraction (-)</option>
        <option value="*">Multiplication (*)</option>
        <option value="/">Division (/)</option>
      </select>

      <br><br>

    
      <label>Number 2:</label>
      <select [(ngModel)]="num2">
        <option *ngFor="let n of numbers" [value]="n">
          {{ n }}
        </option>
      </select>

      <br><br>

      <button (click)="calculate()">Calculate</button>

      <h3>Result: {{ result }}</h3>

    </div>
  `,

  styles: [`
    div{
      padding:20px;
    }

    select, button{
      padding:5px;
      margin:5px;
    }
  `]
})
export class Calculator {

  numbers: number[] = [1,2,3,4,5,6,7,8,9,10];

  num1: number = 1;
  num2: number = 1;

  operation: string = '+';

  result: number = 0;

  calculate() {

    switch(this.operation){

      case '+':
        this.result = this.num1 + this.num2;
        break;

      case '-':
        this.result = this.num1 - this.num2;
        break;

      case '*':
        this.result = this.num1 * this.num2;
        break;

      case '/':
        this.result = this.num1 / this.num2;
        break;

    }
  }
}