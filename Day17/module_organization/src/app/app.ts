import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <h1>Hello, {{ title() }}</h1>
    <p>Congratulations! Your app is running. 🎉</p>
    <app-employee-details></app-employee-details>
    <app-emp-list></app-emp-list>
    <router-outlet />
  `,
  standalone: false,
  styles: []
})
export class App {
  protected readonly title = signal('module_organization');
}
