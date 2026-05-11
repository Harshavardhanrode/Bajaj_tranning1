import { AfterViewInit, Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appAutofocus]',
  standalone: false,
})
export class Autofocus implements AfterViewInit {
  constructor( private el :ElementRef) {}
  ngAfterViewInit(): void {
    this.el.nativeElement.focus();
  }
}
