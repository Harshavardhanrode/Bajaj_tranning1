import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { FirstComponent } from './first-component/first-component';
import { SecondComponent } from './second-component/second-component';
import { Product } from './product/product';
import { ProductDetails } from './product-details/product-details';
import { OnlineProducts } from './online-products/online-products';
import { OnlineProductsDetails } from './online-products-details/online-products-details';
import { PageNotFoundComponent } from './page-not-found-component/page-not-found-component';
import { ContactUs } from './contact-us/contact-us';
import { India } from './india/india';
import { Usa } from './usa/usa';

@NgModule({
  declarations: [
    App,
    FirstComponent,
    SecondComponent,
    Product,
    ProductDetails,
    OnlineProducts,
    OnlineProductsDetails,
    PageNotFoundComponent,
    ContactUs,
    India,
    Usa,
  ],
  imports: [BrowserModule, AppRoutingModule],
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
