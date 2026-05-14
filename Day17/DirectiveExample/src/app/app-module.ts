import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { AppComponentDirective } from './app-component-directive/app-component-directive';
import { StructuralDirective } from './structural-directive/structural-directive';
import { MyHighlight } from './my-highlight';
import { Autofocus } from './autofocus';

@NgModule({
  declarations: [App, AppComponentDirective, StructuralDirective, MyHighlight, Autofocus],
  imports: [BrowserModule, AppRoutingModule],
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
