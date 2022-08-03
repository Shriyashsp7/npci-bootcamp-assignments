import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app/common/category';
import { Product } from 'src/app/common/product';
import { ProductServiceService } from 'src/app/services/product-service.service';

@Component({
  selector: 'app-buyer',
  templateUrl: './buyer.component.html',
  styleUrls: ['./buyer.component.css']
})
export class BuyerComponent implements OnInit {
  cartProducts : Product[]
  products : Product[] 
  display: string;
  pname : string
  categoryid : number
  categories : Category[]
  
  
  constructor(private service : ProductServiceService) { }

  ngOnInit(): void {
    this.listOfProduct()
    this.listOfCategory()
  }

  listOfProduct(){
    this.service.getAllProduct().subscribe(data =>{
      this.products=data
    })
  }
  listOfCategory(){
    this.service.getAllCategory().subscribe(data =>{
      console.log(data);
      this.categories=data
      
    })
  }
 
 addToCart(product :Product){
  this.service.addToCart(product);
  window.alert('Ypur Product has been added');

 }

 getProductByName(pname : string){
  this.service.getProductByName(pname).subscribe(data =>{

    this.products =data
  })
}

getProductByCategoryId(categoryid : number){
  this.service.getProductByCategoryId(categoryid).subscribe(data =>{

    this.products =data
  })
}

}
