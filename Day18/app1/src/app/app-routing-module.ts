import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FirstComponent } from './first-component/first-component';
import { SecondComponent } from './second-component/second-component';
import { Product } from './product/product';
import { ProductDetails } from './product-details/product-details';
import { OnlineProducts } from './online-products/online-products';
import {OnlineProductsDetails} from './online-products-details/online-products-details'
import { PageNotFoundComponent } from './page-not-found-component/page-not-found-component';
import { ContactUs } from './contact-us/contact-us';
import { India } from './india/india';
import { Usa } from './usa/usa';

const routes: Routes = [

  {
    path :'first-component',component:FirstComponent,
   
  },
  
  {
    path :'second-component',component:SecondComponent,
  },
  {
    path :'products',component:Product,
  },
  {
    path :'products/:id',component:ProductDetails,
  },
  {
    path :'online-products',component:OnlineProducts,
  },
  {
    path :'online-products/:id',component:OnlineProductsDetails,
  },
  
  {
    path :'contact-us',component:ContactUs,
    children:[
      {
        path:"india",
        component:India
      },
      {
        path:"usa",
        component:Usa
      }
    ]
  },

  {
    path :'**',component:PageNotFoundComponent,
  },
  {
    path :'',component:FirstComponent,
  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
