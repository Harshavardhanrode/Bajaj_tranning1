
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'inCurrency',
  standalone: false,
})
export class InCurrencyPipe implements PipeTransform {
  transform(value: unknown, ...args: unknown[]): string  {
    return `₹${(value as number).toFixed(2)}/- INR`;
  }
}
