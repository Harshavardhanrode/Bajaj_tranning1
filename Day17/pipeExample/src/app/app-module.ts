import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { InCurrencyPipe } from './in-currency-pipe';
import { EvenoddPipe } from './evenodd-pipe';
import { DatediffPipe } from './datediff-pipe';
import { JsonToTablePipe } from './json-to-table-pipe';

@NgModule({
  declarations: [App, InCurrencyPipe, EvenoddPipe, DatediffPipe, JsonToTablePipe],
  imports: [BrowserModule, AppRoutingModule],
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
