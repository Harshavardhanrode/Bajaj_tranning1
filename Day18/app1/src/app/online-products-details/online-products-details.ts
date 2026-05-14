import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import axios from 'axios';

@Component({
  selector: 'app-online-products-details',
  standalone: false,

  template: `

  <div class="product-card" >

    <h2>{{product.title}}</h2>

    <img
      [src]="product.image"
      width="200"
      height="200"
    >
  
    <p>
      <b>Product ID:</b>
      {{product.id}}
    </p>

    <p>
      <b>Category:</b>
      {{product.category}}
    </p>

    <p>
      <b>Price:</b>
      ₹ {{product.price}}
    </p>

    <p>
      <b>Description:</b>
      {{product.description}}
    </p>

    <div class="button-group">

      <button class="cart-btn">
        Add To Cart
      </button>

      <button class="review-btn">
        Reviews
      </button>

    </div>

  </div>`
  ,

  styles: `[

  .product-card{
    width: 400px;
    margin: 20px auto;
    padding: 20px;
    border-radius: 12px;
    border: 1px solid #ccc;
    box-shadow: 0px 2px 10px rgba(0,0,0,0.1);
    text-align: center;
  }

  img{
    object-fit: contain;
    margin-bottom: 15px;
  }

  .button-group{
    margin-top: 20px;
    display: flex;
    justify-content: center;
    gap: 10px;
  }

  button{
    padding: 10px 18px;
    border: none;
    border-radius: 8px;
    cursor: pointer;
    color: white;
  }

  .cart-btn{
    background-color: orange;
  }

  .review-btn{
    background-color: dodgerblue;
  }

  ] `
})
export class OnlineProductsDetails {

  product:any = null;

  constructor(private route: ActivatedRoute) {}

  async ngOnInit(): Promise<void> {

    const productId =
      this.route.snapshot.paramMap.get('id');

    let response = await axios.get(
      `https://fakestoreapi.com/products/${productId}`
    );

    this.product = response.data;

    console.log(this.product);
  }
}



