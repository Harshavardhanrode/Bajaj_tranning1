import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'evenodd',
  standalone: false,
})
export class EvenoddPipe implements PipeTransform {
  transform(value: number, ...args: unknown[]): string {
    if(value % 2 ==0){
      return `even`;
    }else{
      return `even`;
    }
  }
}
