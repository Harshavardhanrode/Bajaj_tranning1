import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-details',
  standalone: false,
  template: ` <p>product-details works!</p>
  
  product id {{this.productId}}
  
  `,
  styles: ``,
})
export class ProductDetails {
  productId:String | null = null;
  constructor(private route: ActivatedRoute) {

  }

  ngOnInit():void{
    this.productId = this.route.snapshot.paramMap.get('id');
    console.log("product id :" + this.productId);
  }


}
