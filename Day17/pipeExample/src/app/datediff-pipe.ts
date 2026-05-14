import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'datediff',
  standalone: false,
})
export class DatediffPipe implements PipeTransform {

  transform(startDate: string, endDate: string): string {

    // Convert string to Date
    const start = new Date(startDate);
    const end = new Date(endDate);

    // Difference in milliseconds
    const diff = end.getTime() - start.getTime();

    // Convert into days
    const days = Math.floor(diff / (1000 * 60 * 60 * 24));

    return days + " days";

  }

}