import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'jsonToTable',
  standalone: false,
})
export class JsonToTablePipe implements PipeTransform {

  transform(value: any): any[] {
    return Object.entries(value);
  }

}