import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {Button,Header,Footer} from 'shared-ui'
@Component({
  selector: 'app-root',
  imports: [RouterOutlet,Button,Header,Footer],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  protected readonly title = signal('customer-app');
}
