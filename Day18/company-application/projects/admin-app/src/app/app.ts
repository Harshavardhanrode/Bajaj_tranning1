

import { Component, signal,inject } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {Button,Header,Footer} from 'shared-ui'
import {Api} from 'shared-service';

@Component({ 
  selector: 'app-root',
  imports: [RouterOutlet , Button, Header,Footer ,Api],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  protected readonly title = signal('admin-app');



  message:string = '';

  constructor(private api: Api){}

  ngOnInit(){
    this.message = this.api.getMessage();
  }
}
