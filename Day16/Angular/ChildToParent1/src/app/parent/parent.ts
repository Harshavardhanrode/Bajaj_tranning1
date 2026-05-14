import { AfterViewInit, ChangeDetectorRef, Component, ViewChild } from '@angular/core';

@Component({
  selector: 'app-parent',
  standalone: false,
  template: ` <p>parent works!</p>
  <app-child1></app-child1>
this is from child component : {{childmessage}}

  `,
  styles: ``,
})
export class Parent implements AfterViewInit {
  @ViewChild('child') childcomponent :any;

  constructor( private cdr:ChangeDetectorRef){};

  childmessage:string ='';

  ngAfterViewInit (){
    this.childmessage = this.childcomponent.childmsg;
    this.cdr.detectChanges();

  }


}
