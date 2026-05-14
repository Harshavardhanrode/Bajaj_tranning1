import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { Parent } from './parent/parent';
import { Child } from './child/child';
import { SearchBox } from './search-box/search-box';
import { FormsModule } from '@angular/forms';
import { Calculator } from './calculator/calculator';
import { Colorcode } from './colorcode/colorcode';

@NgModule({
  declarations: [App, Parent, Child, SearchBox, Calculator, Colorcode],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
