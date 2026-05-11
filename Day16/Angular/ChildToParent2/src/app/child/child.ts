import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  standalone: false,
  template: ` 
  <button (click)="sendmesg()">Send Message to Parent</button>
  
  `,
  styles: ``,
})
export class Child {
  message : string = "hey angular"
  @Output() sendMessage = new EventEmitter<string>();

  constructor() {}

  sendmesg() {
    this.sendMessage.emit(this.message);
  }
  



}
