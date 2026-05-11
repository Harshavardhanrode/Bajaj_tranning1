import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { Home } from './home/home';
import { Parent } from './parent/parent';
import { Childt } from './childt/childt';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [App, Home, Parent, Childt],
  imports: [BrowserModule, AppRoutingModule,FormsModule],
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
