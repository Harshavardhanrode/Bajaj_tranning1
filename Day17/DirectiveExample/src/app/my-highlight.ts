import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appMyHighlight]',
  standalone: false,
})
export class MyHighlight {

  constructor(private el: ElementRef) {}

  @HostListener('mouseenter') onMouseEnter() {
    // this.highlight('yellow');

     this.el.nativeElement.style.transform = "scale(1.2)";
  }

  @HostListener('mouseleave')
  onMouseLeave() {
    this.highlight('');
    this.el.nativeElement.style.transform = "scale(1)";
  }

  private highlight(color: string) {

    this.el.nativeElement.style.backgroundColor = color;

  }

}